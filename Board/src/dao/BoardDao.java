package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	private static BoardDao boardDao = new BoardDao();
	
	public static BoardDao getboardDao() { return boardDao; }
	
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC" , 
					"root" , "1234");
		}
		catch (Exception e) {
			System.out.println("*db 연동 실패");
		}
	}
	
	//게시물 등록
	public boolean boardwrite(Board board) {
		String sql = "insert into board(b_title, b_contents,b_write) value(?,?,?)";
		try {
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, board.getB_title());
		preparedStatement.setString( 2 , board.getB_contents() );
		preparedStatement.setString( 3 , board.getB_write() );
		preparedStatement.executeUpdate();
		return true;
		}catch (Exception e) {
			return false;
		}
		
	}
	
	public ObservableList<Board> boardlist(){
		ObservableList<Board> boards = FXCollections.observableArrayList();
		String sql = "select * from board order by b_no desc";
		try {
			preparedStatement= connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				boards.add(board);
			}
			return boards;
			
		}catch (Exception e) {
			return boards;
		}
	}
	
	
	
}
















