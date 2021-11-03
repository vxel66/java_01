package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.BoardDao;
import dao.memberdao;
import domain.Board;
import domain.member;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;


public class BoardlistController implements Initializable {
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		ObservableList<Board> boards =  BoardDao.getboardDao().boardlist();
		// 2. 테이블뷰의 필드 가져오기  
		TableColumn tc = boardlist.getColumns().get(0);// 테이블뷰의 첫번째 필드 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_no"));
	
	tc = boardlist.getColumns().get(1);
	tc.setCellValueFactory(new PropertyValueFactory<>("b_title"));
	
	tc = boardlist.getColumns().get(2);
	tc.setCellValueFactory(new PropertyValueFactory<>("b_write"));
	
	tc = boardlist.getColumns().get(3);
	tc.setCellValueFactory(new PropertyValueFactory<>("b_date"));
	
	tc = boardlist.getColumns().get(4);
	tc.setCellValueFactory(new PropertyValueFactory<>("b_view"));
	
	
	boardlist.setItems(boards);

	boardlist.setOnMouseClicked( e -> { 
		if( e.getButton().equals( MouseButton.PRIMARY ) ) { // 해당 이벤트가 클릭이면 
			board = boardlist.getSelectionModel().getSelectedItem();
							// 테이블뷰에 선택된 모델의 아이템[ 객체 ]
			MainpageController.getinstance().loadpage("boardview");
		}
	} ) ;	
	
	
	}
	public static Board board; 
	

    @FXML
    private TableView<Board> boardlist;

    @FXML
    private Button btnwrite;

    @FXML
    private AnchorPane pane;

    @FXML
    void write(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardwrite");
    	
    }
    
  
   
}
