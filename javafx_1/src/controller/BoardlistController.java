package controller;

import java.net.URL;

import java.util.ResourceBundle;

import Domain.Board;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;


public class BoardlistController implements Initializable {
	
	
	
	


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//1. dao 호출
		ObservableList<Board> boards = BoardDao.getBoardDao().boardlist();
		//2.테이블뷰의 필드 가져오기
		TableColumn tc =boardlist.getColumns().get(0);
		tc.setCellValueFactory( new PropertyValueFactory<>("b_no")); // 객체내 필드명
		
		tc = boardlist.getColumns().get(1); // 테이블뷰의 두번째 필드 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_title"));
		
		tc = boardlist.getColumns().get(2); // 테이블뷰의 세번째 필드 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_write"));

		tc = boardlist.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("b_date"));
		
		tc = boardlist.getColumns().get(4); // 테이블뷰의 다섯번째 필드 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_view") );
		
		//3.테이블뷰에 리스트 설정
				boardlist.setItems(boards);
				
		boardlist.setOnMouseClicked(e-> {
			if(e.getButton().equals(MouseButton.PRIMARY)) {
				board = boardlist.getSelectionModel().getSelectedItem();
				//조회수 증가
				BoardDao.getBoardDao().viewupdate(board.getB_no(), 1);
				
				MainpageController.getinstance().loadpage("boardview");
				
				
			}
		} );	
			// 인수 -> 정의 : 익명메소드
		
		
	}
	public static Board board;

    @FXML
    private TableView<Board> boardlist;
    			   //테이블에 넣을 객체의 클래스명 => 제네릭
    
    
    
    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardwrite");
    }
}
