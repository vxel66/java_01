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
	
	
	public static Board board;
	


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//1. dao ȣ��
		ObservableList<Board> boards = BoardDao.getBoardDao().boardlist();
		//2.���̺���� �ʵ� ��������
		TableColumn tc =boardlist.getColumns().get(0);
		tc.setCellValueFactory( new PropertyValueFactory<>("b_no")); // ��ü�� �ʵ��
		
		tc = boardlist.getColumns().get(1); // ���̺���� �ι�° �ʵ� 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_title"));
		
		tc = boardlist.getColumns().get(2); // ���̺���� ����° �ʵ� 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_write"));

		tc = boardlist.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("b_date"));
		
		tc = boardlist.getColumns().get(4); // ���̺���� �ټ���° �ʵ� 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_view") );
		
		//3.���̺�信 ����Ʈ ����
				boardlist.setItems(boards);
				
		boardlist.setOnMouseClicked(e-> {
			if(e.getButton().equals(MouseButton.PRIMARY)) {
				board = boardlist.getSelectionModel().getSelectedItem();
				//��ȸ�� ����
				
				MainpageController.getinstance().loadpage("boardview");
				
				
			}
		} );	
			// �μ� -> ���� : �͸�޼ҵ�
		
		
	}
	

    @FXML
    private TableView<Board> boardlist;
    			   //���̺� ���� ��ü�� Ŭ������ => ���׸�
    
    
    
    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardwrite");
    }
}
