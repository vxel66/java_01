package controller;

import java.net.URL;
import java.util.ResourceBundle;

import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class BoardviewController implements Initializable {
	Board board = BoardlistController.board;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println(board.getB_write());
		txttitle.setText( board.getB_title()  );
		txtcontente.setText( board.getB_contents() );
		
//		if( MainpageController.getinstance().getloginid()
//				.equals( board.getB_write() ) ) {
//			// �Խù� �ۼ��ڿ� �α��ε� ���̵� �ٸ���� 
//				// ��ư ����� 
//			btndelete.setVisible(true);
//			btnupdate.setVisible(true);
//		}
		if(! MainpageController.getinstance().getloginid()
				.equals( board.getB_write() ) ) {
			// �Խù� �ۼ��ڿ� �α��ε� ���̵� �ٸ���� 
				// ��ư ����� 
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
		
	}
	
	@FXML
    private Button btncancel;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnreplywrite;

    @FXML
    private Button btnupdate;

    @FXML
    private TableView<?> replylist;

    @FXML
    private TextArea txtcontente;

    @FXML
    private Label txtdate;

    @FXML
    private TextArea txtreply;

    @FXML
    private TextField txttitle;

    @FXML
    private Label txtview;

    @FXML
    private Label txtwrite;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void delete(ActionEvent event) {
    	
    }
    boolean upcheck = true;
    @FXML
    void update(ActionEvent event) {
    	Alert alert =new Alert(AlertType.INFORMATION);
    	if(upcheck) {
    		alert.setHeaderText("�����Ͻʽÿ�");
    		txttitle.setEditable(true);
    		
    	}
    }

    @FXML
    void write(ActionEvent event) {

    }
}























