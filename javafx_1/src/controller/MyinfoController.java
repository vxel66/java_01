package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import Domain.Member;
import dao.MemberDao;
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
import javafx.scene.control.Alert.AlertType;
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
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("¾Ë¸²");
    	alert.setContentText("È¸¿øÅ»Åð");
    	alert.setContentText("È¸¿øÅ»Åð?");
    	
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get()==ButtonType.OK) {
    		boolean  result = MemberDao.getMemberDao().delete(labelemail.getText());
    		Alert alert2 = new Alert(AlertType.INFORMATION);
    		if(result) {    						
    			alert2.setTitle("¾Ë¸²");
    			alert2.setHeaderText("È¸¿øÅ»Åð µÇ¾ú½À´Ï´Ù");
    			alert2.showAndWait();
    			
    			//1.main½ºÅ×ÀÌÁö ¼û±â±â
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
    			alert2.setTitle("¾Ë¸²");
    			alert2.setHeaderText("db ¿À·ù");
    			alert2.showAndWait();
    			
    		}
    			
    	}
    	
    	
    	
    }

    @FXML
    void update(ActionEvent event) {

    }
}
























