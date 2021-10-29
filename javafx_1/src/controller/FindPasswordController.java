package controller;

import java.net.URL;
import java.util.ResourceBundle;

import Domain.Member;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class FindPasswordController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
		
	}
	
	 @FXML
	    private Label btnback;

	    @FXML
	    private Button btnfindid;

	    @FXML
	    private AnchorPane findpasswordpane;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    private TextField txtid;

	    @FXML
	    void back(MouseEvent event) {
	    	LoginController.getinstance().loadpage("login");
	    }

	    @FXML
	    void findid(ActionEvent event) {
	    	//dao 객체네 find 메소드 호출
	    	String result = MemberDao.getMemberDao().findpassword(txtid.getText(), txtemail.getText());
	    	
	    	if(result!=null) {
	    		Member.sendmail(txtemail.getText(), result, 2);
	    		
	    		lblconfirm.setText("이메일 전송");
	    	}else {
	    		lblconfirm.setText("실패");
	    	}
	    	
	    }
}
