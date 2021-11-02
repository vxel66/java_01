package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Domain.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {

	private Connection connection;	//db ���� �������̽�
	private PreparedStatement preparedStatement; //sql ���� �������̽�
	private ResultSet resultSet;
	
	private static BoardDao boardDao = new BoardDao();
	
	public static BoardDao getBoardDao() {
		return boardDao;
	}
	
	//2.������ db ����
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTime=UTC","root","1234");
		} catch (Exception e) {		
		}	
	}
	 
	//3.�޼ҵ�
	
		//1.�Խù� ���
		public boolean write(Board board) {
			
			String sql = "insert into board(b_title , b_contents ,b_write) value(?,?,?)";
			try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, board.getB_title());
			preparedStatement.setString(2, board.getB_contets());
			preparedStatement.setString(3, board.getB_write());
			preparedStatement.executeUpdate();
			return true;
			
			}catch (Exception e) {
				return false;
			}
			
		}
		//2.�Խù� ��ü ��ȸ 
		public ObservableList<Board> boardlist(){
			ObservableList<Board> boards = FXCollections.observableArrayList();
			String sql = "select * from board ";
			try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				//��ü ����Ʈ�� ���
				boards.add(board);
				
				
			}
			return boards;
			}catch (Exception e) {
				// TODO: handle exception
			}return boards;
		};
		
		
		//3.�Խù� ���� 
	
		//4.�Խù� ����
	
		//5.�Խù� ������ȸ 
		
	
		
}


































