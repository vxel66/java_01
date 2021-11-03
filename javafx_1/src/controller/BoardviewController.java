package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import Domain.Board;
import Domain.Reply;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;

public class BoardviewController implements Initializable {


		Board board = BoardlistController.board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		replytableload();
		
		txttitle.setText(board.getB_title());
		txtcontente.setText(board.getB_contets());
		txtdate.setText(board.getB_date().split(" ")[0]);
		txtwrite.setText(board.getB_write());
		txtview.setText(board.getB_view()+"");
		
		if(!MainpageController.getinstance().getloginid().equals(board.getB_write())) {
			//�Խù� �ۼ��ڿ� �α��� ���̵� �ٸ��� 
			//��ư �����
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
    private TableView<Reply> replylist;
    
    // ���̺� �ε� �޼ҵ�
    public void replytableload() {
    	//1. dao ȣ��
    			ObservableList<Reply> replys = BoardDao.getBoardDao().replylist(board.getB_no());
    			//2.���̺���� �ʵ� ��������
    			TableColumn tc =replylist.getColumns().get(0);
    			tc.setCellValueFactory( new PropertyValueFactory<>("r_no")); // ��ü�� �ʵ��
    			
    			tc = replylist.getColumns().get(1); // ���̺���� �ι�° �ʵ� 
    			tc.setCellValueFactory( new PropertyValueFactory<>("r_write"));
    			
    			tc = replylist.getColumns().get(2); // ���̺���� ����° �ʵ� 
    			tc.setCellValueFactory( new PropertyValueFactory<>("r_contents"));

    			tc = replylist.getColumns().get(3);
    			tc.setCellValueFactory(new PropertyValueFactory<>("r_date"));
    			

    			//3.���̺�信 ����Ʈ ����
    				replylist.setItems(replys);
    				// ���â �ʱ�ȭ	
    				txtreply.setText("");
    }
    
    
    @FXML
    private TextArea txtcontente;

    @FXML
    private TextField txttitle;
    
    @FXML
    private Label txtdate;

    @FXML
    private Label txtview;

    @FXML
    private Label txtwrite;
    
    @FXML
    private TextArea txtreply;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void delete(ActionEvent event) {
   	
   	
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("����?");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get()==ButtonType.OK) {
    		Alert alert2 = new Alert(AlertType.INFORMATION);
    		boolean result= BoardDao.getBoardDao().boarddelete(board.getB_no());
    		if(result) {
    			alert2.setTitle("�˸�");
    			alert2.setHeaderText("���� �Ǿ����ϴ�");
    			alert2.showAndWait();
    			
    			MainpageController.getinstance().loadpage("boardlist");
    		}
    	}
    	
    }
    boolean upcheck = true;
    @FXML
    void update(ActionEvent event) {
//    	MainpageController.getinstance().loadpage("boardwriteupdate");
    	Alert alert = new Alert( AlertType.INFORMATION );
    	if(upcheck ) {
	    	alert.setHeaderText("���� ������ �ٽ� ��ư Ŭ���� ���� �Ϸ� �˴ϴ�");
	    	alert.showAndWait();
	    	txttitle.setEditable(true);
	    	txtcontente.setEditable(true);
	    	upcheck = false;
    	}
    	else {
    		BoardDao.getBoardDao().boardupdate( board.getB_no() , txttitle.getText() , txtcontente.getText() );// DB ó��
    		alert.setHeaderText("�Խù��� ���� �Ǿ����ϴ�.");
	    	alert.showAndWait();
	    	upcheck = true;
	    	txttitle.setEditable(false);
	    	txtcontente.setEditable(false);
    	}
    }

    @FXML
    void write(ActionEvent event) {
    	Reply reply = new Reply(txtreply.getText(),MainpageController.getinstance().getloginid() ,board.getB_no());
    	BoardDao.getBoardDao().replywrite(reply);
    	replytableload();
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("����Է� �Ϸ�");
    	alert.showAndWait();
    }
}

























