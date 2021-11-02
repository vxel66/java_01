package controller;

import Domain.Board;
import dao.BoardDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardwriteController {

    @FXML
    private Button btncancel;

    @FXML
    private Button btnwrite;

    @FXML
    private TextArea txtcontente;

    @FXML
    private TextField txttitle;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void write(ActionEvent event) {
    	
    	Board board = new Board(txttitle.getText(), txtcontente.getText(), MainpageController.getinstance().getloginid());
    	
    	boolean result = BoardDao.getBoardDao().write(board);
    		Alert alert = new Alert(AlertType.INFORMATION);
    	if(result) {
    		
    		alert.setContentText("게시글 작성완료");
    		alert.setTitle("좋아요");
    		alert.showAndWait();
    		MainpageController.getinstance().loadpage("boardlist");
    	}else {
    		alert.setContentText("게시글 작성실패");
    		alert.setTitle("좋아요");
    		alert.showAndWait();
    	}
    	
    }
}
