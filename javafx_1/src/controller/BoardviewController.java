package controller;

import java.net.URL;
import java.util.ResourceBundle;

import Domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardviewController implements Initializable {


	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		Board board = BoardlistController.board;
		txttitle.setText(board.getB_title());
		txtcontente.setText(board.getB_contets());
		if(!MainpageController.getinstance().getloginid().equals(board.getB_write())) {
			//게시물 작성자와 로그인 아이디가 다르면 
			//버튼 숨기기
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
    private TextField txttitle;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

    @FXML
    void write(ActionEvent event) {

    }
}
