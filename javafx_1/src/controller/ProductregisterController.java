package controller;

import java.io.File;

import Domain.Product;
import dao.MemberDao;
import dao.ProductDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProductregisterController {
	@FXML
    private Button btncancel;

    @FXML
    private Button btnimgadd;

    @FXML
    private Button btnregister;

    @FXML
    private ToggleGroup categori;

    @FXML
    private Label lblimgpath;

    @FXML
    private RadioButton opt_1;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    private ImageView pimg;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextField txtpname;

    @FXML
    private TextField txtprice;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productlist");
    }

  

    @FXML
    void register(ActionEvent event) {
    	//��ȿ���˻� ����
    	String pname = txtpname.getText();
    	String pcontents = txtpcontents.getText();
    	int pprice = Integer.parseInt(txtprice.getText()); //����ȯ ������
    	String pcategory = "";
    		if(opt_1.isSelected()) {	//�ش� ������ư�� Ŭ��������
    			pcategory="�Ƿ�";
    		}
    		if(opt_2.isSelected()) {
    			pcategory="�Ź�";
    		}
    		if(opt_3.isSelected()) {
    			pcategory="����";
    		}
    		if(opt_4.isSelected()) {
    			pcategory="Acc";
    		}
    		int m_no = ProductDao.getProductDao().bnocheck(MainpageController.getinstance().getloginid());
    	
    		Product product = new Product(pname, pimage, pcontents, pcategory, pprice, 1, m_no)	;  		
    	
    	boolean check = ProductDao.getProductDao().register(product);
    	if(check) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("��� �Ϸ�");
    		alert.showAndWait();
    		MainpageController.getinstance().loadpage("productlist");
    	}else {
    		System.out.println("�ȵ�");
    	}
    
    }
    //���� ��� ã��
    private String pimage; //���ϰ�� ������ ����
    private Stage stage ; //���� ��θ� ã�� ȭ��
    
    @FXML
    void imgadd(ActionEvent event) {
    	//1. ���� ���� Ŭ����
    	FileChooser fileChooser = new FileChooser();// ���� ���ý� ��� ����
    	//2. ���� �������� ����  getExtensionFilters():������ ���� ����
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("�׸����� : Image File","*png","*jpg","*gif"));
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("�ؽ�Ʈ ���� ","txt"));
    	//3.���������� ���ϼ���Ŭ���� �ֱ�  	
    	File file = fileChooser.showOpenDialog(stage);
    		//*������ ������ ����Ŭ������ ����
    	lblimgpath.setText("���ϰ��: "+file.getPath());
    //	System.out.println("���ϰ��: "+file.getPath());
    	pimage = file.toURI().toString(); //������ ����[db] ���
   // 	System.out.println("uri ���"+pimage);
    	
    	
    	Image image = new Image(pimage);
    	pimg.setImage(image);
    	
    }
}








































