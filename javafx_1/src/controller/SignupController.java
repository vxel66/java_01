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
	    	
	    	//0.��Ʈ�� ��ü ȣ���
	    	
	    	//1. ��ȿ�� �˻�
	    		// ���̵� ���� üũ
	    	if(txtid.getText().length() < 4 || txtid.getText().length() >13) {
	    		lblconfirm.setText("���̵�� 4~12����"); // ���̺� ���� ����
	    		return;
	    	}
	    		//�н����� ���� üũ
	    	if(txtpassword.getText().length() <4||txtpassword.getText().length() >9 ) {
	    		lblconfirm.setText("���̵�� 4~8����");
	    		return;
	    	}
	    	if(!txtpassword.getText().equals(txtpasswordconfirm.getText())) {
	    		lblconfirm.setText("�н����� �������� �ʽ��ϴ�");
	    		return;
	    	}
	    	if(txtname.getText().length()<2||txtname.getText().length()>10) {
	    		lblconfirm.setText("�̸��� 2���ڿ��� 10����");
	    		return;
	    	}
	    	if(txtemail.getText().length()<5||!txtemail.getText().contains("@")) {
	    		lblconfirm.setText("�̸��� �������� �Է�");
	    		return;
	    	}
	    	//2. �ߺ��� �ߺ�üũ
	    	boolean idcheck = MemberDao.getMemberDao().idcheck(txtid.getText());
	    	if(idcheck) {
	    		lblconfirm.setText("���� ������� ���̵��Դϴ�");return;
	    	}
	    	
	    	
	    	//3. ��üȭ
	    	Member member = new Member(txtid.getText(), txtpassword.getText(), txtname.getText(), txtemail.getText(), 0);
	    	//4.����ó�� Ȥ�� dbó��
	    	boolean result = MemberDao.getMemberDao().signup(member);
	    	//5.
	    if(result) {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setContentText("ȸ������ �����Ϸ�");//�޼��� ����
	    	lblconfirm.setText("ȸ������ ����");//�޼��� Ÿ��Ʋ
	    	alert.setTitle("���ƿ�");
	    	alert.showAndWait(); // �޽����� ���� ��Ʈ �Է±��� ���
	    	LoginController.getinstance().loadpage("login");//�α��� fxml ���Ϸ� �̵�
	    }else {
	    	lblconfirm.setText("ȸ������ ����");
	    }
	    	
	    }

    @FXML
    void back(MouseEvent event) {
    		// !! ���ο� ��ü ����ÿ��� ���ο� �޸�
    	// LoginController loginController = new LoginController();
    		
    		// ������ �޸� ����ϱ� ���ؼ� this Ű���带 ����� ��ü ȣ�� 
    	LoginController.getinstance().loadpage("login");
    }
}











