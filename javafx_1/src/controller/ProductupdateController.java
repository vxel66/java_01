package controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import Domain.Product;
import dao.ProductDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class ProductupdateController implements Initializable {
	ProductlistController controller = new ProductlistController();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		txtpname.setText(controller.product.getP_name());
		txtpcontents.setText(controller.product.getP_contents());
		txtprice.setText(controller.product.getP_price()+"");
		lblimgpath.setText(controller.product.getP_img());
		
		Image image = new Image(controller.product.getP_img());
    	pimg.setImage(image);
    	
    	
	}
	
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
    	//유효성검사 생략
    	String pname = txtpname.getText();
    	String pcontents = txtpcontents.getText();
    	int pprice = Integer.parseInt(txtprice.getText()); //형변환 죠지기
    	String pcategory = "";
    		if(opt_1.isSelected()) {	//해당 라디오버튼을 클릭했을때
    			pcategory="의류";
    		}
    		if(opt_2.isSelected()) {
    			pcategory="신발";
    		}
    		if(opt_3.isSelected()) {
    			pcategory="가방";
    		}
    		if(opt_4.isSelected()) {
    			pcategory="Acc";
    		}
    		int m_no = ProductDao.getProductDao().bnocheck(MainpageController.getinstance().getloginid());
    	
    		Product product = new Product(pname, pimage, pcontents, pcategory, pprice, 1, m_no)	;  		
    		
    	boolean check = ProductDao.getProductDao().p_update(product,controller.product.getP_no());
    	if(check) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("등록 완료");
    		alert.showAndWait();
    		MainpageController.getinstance().loadpage("productlist");
    	}else {
    		System.out.println("안됨");
    	}
    }
    
    private String pimage; //파일경로 저장할 변수
    private Stage stage ; //파일 경로를 찾을 화면

    @FXML
    void imgadd(ActionEvent event) {
    	//1. 파일 선택 클래스
    	FileChooser fileChooser = new FileChooser();// 파일 선택시 경로 저장
    	//2. 파일 스테이지 설정  getExtensionFilters():선택할 파일 필터
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("그림파일 : Image File","*png","*jpg","*gif"));
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("텍스트 파일 ","txt"));
    	//3.스테이지에 파일선택클래스 넣기  	
    	File file = fileChooser.showOpenDialog(stage);
    		//*선택한 파일을 파일클래스에 저장
    	lblimgpath.setText("파일경로: "+file.getPath());
    //	System.out.println("파일경로: "+file.getPath());
    	pimage = file.toURI().toString(); //파일의 실제[db] 경로
   // 	System.out.println("uri 경로"+pimage);
    	
    	
    	Image image = new Image(pimage);
    	pimg.setImage(image);
    	
    }

   
}
