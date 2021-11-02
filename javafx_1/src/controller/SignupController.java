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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SignupController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
		
	}
	
	 @FXML
	    private Label btnback;

	    @FXML
	    private Button btnsignup;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private AnchorPane signuppane;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    private TextField txtid;

	    @FXML
	    private TextField txtname;

	    @FXML
	    private PasswordField txtpassword;

	    @FXML
	    private PasswordField txtpasswordconfirm;


	    @FXML
	    void signup(ActionEvent event) {
	    	
	    	//0.컨트롤 객체 호출시
	    	
	    	//1. 유효성 검사
	    		// 아이디 길이 체크
	    	if(txtid.getText().length() < 4 || txtid.getText().length() >13) {
	    		lblconfirm.setText("아이디는 4~12글자"); // 레이블 내용 변경
	    		return;
	    	}
	    		//패스워드 길이 체크
	    	if(txtpassword.getText().length() <4||txtpassword.getText().length() >9 ) {
	    		lblconfirm.setText("아이디는 4~8까지");
	    		return;
	    	}
	    	if(!txtpassword.getText().equals(txtpasswordconfirm.getText())) {
	    		lblconfirm.setText("패스워드 동일하지 않습니다");
	    		return;
	    	}
	    	if(txtname.getText().length()<2||txtname.getText().length()>10) {
	    		lblconfirm.setText("이름은 2글자에서 10글자");
	    		return;
	    	}
	    	if(txtemail.getText().length()<5||!txtemail.getText().contains("@")) {
	    		lblconfirm.setText("이메일 형식으로 입력");
	    		return;
	    	}
	    	//2. 중복값 중복체크
	    	boolean idcheck = MemberDao.getMemberDao().idcheck(txtid.getText());
	    	if(idcheck) {
	    		lblconfirm.setText("현재 사용중인 아이디입니다");return;
	    	}
	    	
	    	
	    	//3. 객체화
	    	Member member = new Member(txtid.getText(), txtpassword.getText(), txtname.getText(), txtemail.getText(), 0);
	    	//4.파일처리 혹은 db처리
	    	boolean result = MemberDao.getMemberDao().signup(member);
	    	//5.
	    if(result) {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setContentText("회원가입 성공완료");//메세지 내용
	    	lblconfirm.setText("회원가입 성공");//메세지 타이틀
	    	alert.setTitle("좋아요");
	    	alert.showAndWait(); // 메시지를 띄우고 버트 입력까지 대기
	    	LoginController.getinstance().loadpage("login");//로그인 fxml 파일로 이동
	    }else {
	    	lblconfirm.setText("회원가입 실패");
	    }
	    	
	    }

    @FXML
    void back(MouseEvent event) {
    		// !! 새로운 객체 선언시에는 새로운 메모리
    	// LoginController loginController = new LoginController();
    		
    		// 동일한 메모리 사용하기 위해서 this 키워드를 사용한 객체 호출 
    	LoginController.getinstance().loadpage("login");
    }
}











