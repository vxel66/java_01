package controller;

import java.net.URL;
import java.util.ResourceBundle;

import Domain.Board;
import dao.BoardDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class BoardwriteupdateController implements Initializable {

	Board board = BoardlistController.board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txttitle.setText(board.getB_title());
		txtcontente.setText(board.getB_contets());
		
	}
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
    	MainpageController.getinstance().loadpage("boardview");
    }

    @FXML
    void write(ActionEvent event) {
    	
    	BoardDao.getBoardDao().boardupdate(board.getB_no(), txttitle.getText(), txtcontente.getText());
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("수정되었습니다");
    	alert.showAndWait();
    	MainpageController.getinstance().loadpage("boardlist");
    }
}
