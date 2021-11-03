package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Domain.Board;
import Domain.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {

	private Connection connection;	//db 연결 인터페이스
	private PreparedStatement preparedStatement; //sql 연결 인터페이스
	private ResultSet resultSet;

	
	private static BoardDao boardDao = new BoardDao();
	
	public static BoardDao getBoardDao() {
		return boardDao;
	}
	
	//2.생성자 db 연동
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC","root","1234");
		} catch (Exception e) {		
		}	
	}
	 
	//3.메소드
	
		//1.게시물 등록
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
		//2.게시물 전체 조회 
		public ObservableList<Board> boardlist(){
			ObservableList<Board> boards = FXCollections.observableArrayList();
			String sql = "select * from board order by b_no desc";
			try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				//객체 리스트에 담기
				boards.add(board);
				
				
			}
			return boards;
			}catch (Exception e) {
				// TODO: handle exception
			}return boards;
		};
		public boolean viewupdate(int no, int view) {
			String sql = "update board set b_view = b_view+? where b_no =?";
			try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, view);
			preparedStatement.setInt(2, no);
			preparedStatement.executeUpdate();
			return true;
			}
			catch (Exception e) {
				return false;
		}
		}
		
		
		
		//3.게시물 삭제 
		public boolean boarddelete(int number) {
			String sql = "delete from board where b_no=?";
			try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, number);
			preparedStatement.executeUpdate();
			return true;
			}catch (Exception e) {
				return false;
			}
		}
		//4.게시물 수정
		public boolean boardupdate(int number, String title, String contents ) {
			String sql = "update board set b_title = ? , b_contents =? where b_no = ?";
			try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title);
			preparedStatement.setString(2, contents);
			preparedStatement.setInt(3, number);
			preparedStatement.executeUpdate();
			return true;
			}catch (Exception e) {
				return false;
			}
		}
		
		// 댓글 등록 메소드
		public boolean replywrite(Reply reply) {
			
			String sql = "insert into reply(r_contents,r_write,b_no) value(?,?,?)";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, reply.getR_contents());
				preparedStatement.setString(2, reply.getR_write());
				preparedStatement.setInt(3, reply.getB_no());
				preparedStatement.executeUpdate();
				return true;
			}catch (Exception e) {
				return false;
			}
			
		}
		
		// 댓글 출력 메소드
		public ObservableList<Reply> replylist(int b_no){
			ObservableList<Reply> replys = FXCollections.observableArrayList();
			String sql = "select * from reply where b_no = ? order by r_no desc";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, b_no);
				resultSet= preparedStatement.executeQuery();
				while(resultSet.next()) {
					Reply reply = new Reply(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),resultSet.getInt(5));
					replys.add(reply);
				}return replys;
				
			}catch (Exception e) {
				return replys;
			}
			
		};
	
		
}


































