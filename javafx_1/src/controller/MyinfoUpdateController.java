package controller;

import java.net.URL;
import java.util.ResourceBundle;

import Domain.Member;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class MyinfoUpdateController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		String loginid = MainpageController.getinstance().getloginid();
		Member member = MemberDao.getMemberDao().getmember(loginid);
		
		
		lblid.setText(loginid);
		txtname.setText(member.getM_name());
		txtemail.setText(member.getM_email());
		lblpoint.setText(member.getM_point()+"");
	}
	
	@FXML
    private Button btncancel;

    @FXML
    private Button btnupdate;

    @FXML
    private AnchorPane lblemail;

    @FXML
    private Label lblid;

    @FXML
    private Label lblpoint;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtname;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("myinfo");
    }

    @FXML
    void update(ActionEvent event) {
    	
    	boolean result =MemberDao.getMemberDao().update(txtname.getText(), txtemail.getText(),lblid.getText());
    	
    	if(result) {
    		Alert alert =new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("회원정보 수정완료");
    		alert.showAndWait();
    		MainpageController.getinstance().loadpage("myinfo");
    		
    	}else {
    		
    	}
    	
    }
}





















