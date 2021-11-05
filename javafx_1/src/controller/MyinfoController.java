package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import Domain.Board;
import Domain.Member;
import Domain.Product;
import dao.BoardDao;
import dao.MemberDao;
import dao.ProductDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MyinfoController implements Initializable {

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		String loginid = MainpageController.getinstance().getloginid();
		Member member = MemberDao.getMemberDao().getmember(loginid);
		
		
		lblid.setText(loginid);
		lblname.setText(member.getM_name());
		labelemail.setText(member.getM_email());
		lblpoint.setText(member.getM_point()+"");
		
		ObservableList<Board> boards = BoardDao.getBoardDao().infoboardlist(loginid);
		//2.���̺���� �ʵ� ��������
		TableColumn tc =myboardlist.getColumns().get(0);
		tc.setCellValueFactory( new PropertyValueFactory<>("b_write")); // ��ü�� �ʵ��
		
		tc = myboardlist.getColumns().get(1); // ���̺���� �ι�° �ʵ� 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_title"));

		tc = myboardlist.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("b_date"));
		
		tc = myboardlist.getColumns().get(3); // ���̺���� �ټ���° �ʵ� 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_view") );
		
		//3.���̺�信 ����Ʈ ����
			myboardlist.setItems(boards);
			
			int m_no = ProductDao.getProductDao().bnocheck(loginid);
			
			ObservableList<Product> products = ProductDao.getProductDao().myproductlist(m_no);
			//2 ���̤���� ����Ʈ�� ���̺�� �ű��
			//3.���̺�信 �ʵ带 ������ ����Ʈ�� �ʵ�� ����
			TableColumn tc2 = myproductlist.getColumns().get(0);
			tc2.setCellValueFactory(new PropertyValueFactory<>("p_name"));
			
			tc2 = myproductlist.getColumns().get(1);
			tc2.setCellValueFactory(new PropertyValueFactory<>("p_category"));
			
			tc2 = myproductlist.getColumns().get(2);
			tc2.setCellValueFactory(new PropertyValueFactory<>("p_price"));
			
			tc2 = myproductlist.getColumns().get(3);
			tc2.setCellValueFactory(new PropertyValueFactory<>("act"));
			
			tc2 = myproductlist.getColumns().get(4);
			tc2.setCellValueFactory(new PropertyValueFactory<>("p_date"));
			
			myproductlist.setItems(products);	
			
			
		
	}
	
	@FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private Label labelemail;

    @FXML
    private AnchorPane lblemail;

    @FXML
    private Label lblid;

    @FXML
    private Label lblname;
    
    @FXML
    private Label lblpoint;
    
    @FXML
    private TableView<Board> myboardlist;

    @FXML
    private TableView<Product> myproductlist;

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("�˸�");
    	alert.setContentText("ȸ��Ż��");
    	alert.setContentText("ȸ��Ż��?");
    	
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get()==ButtonType.OK) {
    		boolean  result = MemberDao.getMemberDao().delete(labelemail.getText());
    		Alert alert2 = new Alert(AlertType.INFORMATION);
    		if(result) {    						
    			alert2.setTitle("�˸�");
    			alert2.setHeaderText("ȸ��Ż�� �Ǿ����ϴ�");
    			alert2.showAndWait();
    			
    			//1.main�������� �����
        		btndelete.getScene().getWindow().hide();
        		
        		Stage stage = new Stage();
        		
        		Parent parent;
    			try {
    				parent = FXMLLoader.load( getClass().getResource("/fxml/login.fxml"));
    				Scene scene = new Scene( parent );
    	    		stage.setScene(scene);
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        	
        			
        		stage.show();
    			
    		}else {
    			alert2.setTitle("�˸�");
    			alert2.setHeaderText("db ����");
    			alert2.showAndWait();
    			
    		}
    			
    	}
    	
    	
    	
    }

    @FXML
    void update(ActionEvent event) {

    	MainpageController.getinstance().loadpage("myinfoupdate");
    }
}
























