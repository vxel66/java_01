package controller;

import dao.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
    	Maincon.getmain().loadpage("boardlist");
    }

    @FXML
    void write(ActionEvent event) {
    	Board board =new Board(txttitle.getText(), txtcontente.getText(), Maincon.getmain().id);
    	
    	BoardDao.getboardDao().boardwrite(board);
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("¿Ï·á");
    	alert.showAndWait();
    	Maincon.getmain().loadpage("boardlist");
    }
}
