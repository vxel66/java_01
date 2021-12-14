package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;
import dto.Reply;

public class BoardDao {
	
	
		//1. 자주 사용하는 인터페이스
	private Connection connection;
	private ResultSet resultSet;
	private PreparedStatement preparedStatement;	
	
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/jsp?serverTimezone=UTC" , 
					"root" , "1234");
			System.out.println("연동");
		}
		catch (Exception e) {
			System.out.println("*db 연동 실패");
		}
	}
	
	public static BoardDao boardDao =new BoardDao();
	public static BoardDao getboBoardDao() {return boardDao;}
	
	
	//게시글 등록
	public boolean boardwrite(Board board) {
		
		String sql="insert into board(b_title , b_contents , m_no , b_file ,b_file2) value(?,?,?,?,?)";
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, board.getB_title());
			preparedStatement.setString(2, board.getB_contents());
			preparedStatement.setInt(3, board.getM_no());
			preparedStatement.setString(4, board.getB_file());
			preparedStatement.setString(5, board.getB_file2());
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("boardwrite db오류");
			return false;
		}
	}
	
	//모든 게시물 출력
	public ArrayList<Board> boarList(int startrow, int listsize){
		String sql = "select * from board order by b_no DESC limit "+startrow+", "+listsize+"";
		ArrayList<Board> arrayList = new ArrayList<Board>();
		try {
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				
			Board board =new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getInt(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getInt(8),
						resultSet.getInt(9));
			arrayList.add(board);
			}
			return arrayList;
		} catch (Exception e) {
			return arrayList;
		}
	}
	
	// 모든 게시물 출력
			public ArrayList<Board> boardlist( int startrow , int listsize ,  String key , String keyword ){
				
				ArrayList<Board> boards = new ArrayList<Board>(); 
				String sql = null;
				
				if( key ==null && keyword ==null ) { // 1. 검색이 없을경우
					sql ="select * from board order by b_no DESC limit ? , ?";
				}else { // 2. 검색이 있을경우
					if( key.equals("b_writer")  ) {		 //작성자 검색 : 작성자 -> 회원번호
						int m_num = MemberDao.getmMemberDao().member_num(keyword);
						sql ="select * from board where m_no = "+ m_num +" order by b_no desc limit ? , ?";
					}else if( key.equals("b_num") ) {	//번호 검색 : 일치한 값만 검색
						sql ="select * from board where b_no = "+ keyword +" order by b_no desc limit ? , ? ";
					}else {								 // 제목 혹은 내용 검색 : 포함된 값 검색 
						sql ="select * from board where "+key+" like '%"+keyword+"%' order by b_no desc limit ? , ?";
					}
				}
				try {
					preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setInt(1, startrow);  preparedStatement.setInt(2, listsize);
					resultSet = preparedStatement.executeQuery();
					while( resultSet.next() ) {
						
						Board board = new Board( resultSet.getInt(1), 
								resultSet.getString(2), 
								resultSet.getString(3),
								resultSet.getInt(4), 
								resultSet.getString(5),
								resultSet.getString(6),
								resultSet.getString(7),
								resultSet.getInt(8),
								resultSet.getInt(9));
						boards.add(board);
					}
					return boards;
				}catch (Exception e) {} return null;
			}
	
	
	//해당 번호 게시물 가져오기
	public Board getboar(int b_num){
		String sql = "select * from board where b_no=?";
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, b_num);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				Board board =new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getInt(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getInt(8),
						resultSet.getInt(9));
				return board;
			}
		} catch (Exception e) {
			System.out.println("getboar db오류");
			return null;
		}
		return null;
		
	}
	
	// 조회수 증가
		public boolean view(int b_num){
			String sql = "update board set b_view = b_view+1 where b_no=?";
			try {
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, b_num);
				preparedStatement.executeUpdate();
					return true;
			} catch (Exception e) {
				System.out.println("getboar db오류");
				return false;
			}
			
		}
		
		//게시글 삭제
		public boolean delete(int b_no) {
			
			String sql="DELETE FROM board WHERE b_no=?";
			try {
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, b_no);
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {
				System.out.println("delete");
				return false;
			}
		}
	
		//게시글 등록
		public boolean boardupdate(Board board , int b_no) {
			
			String sql="UPDATE board SET b_title=? ,b_contents=?, b_file=?, b_file2=? WHERE b_no=?";
			
			try {
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, board.getB_title());
				preparedStatement.setString(2, board.getB_contents());
				preparedStatement.setString(3, board.getB_file());
				preparedStatement.setString(4, board.getB_file2());
				preparedStatement.setInt(5, b_no);
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {
				System.out.println("boardwrite db오류");
				return false;
			}
		}
		
		//리플 등록
		public boolean replywrite(Reply reply) {
			
			String sql="insert into reply(r_contents,m_num,b_num) value(?,?,?)";
			
			try {
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, reply.getR_contents());
				preparedStatement.setInt(2, reply.getM_num());
				preparedStatement.setInt(3, reply.getB_no());
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {
				System.out.println("replywrite db오류");
				return false;
			}
		}
		
		//모든 리플 출력
		public ArrayList<Reply> ReplyList(){
			String sql = "select * from Reply ";
			ArrayList<Reply> replyList = new ArrayList<Reply>();
			try {
				preparedStatement=connection.prepareStatement(sql);
				resultSet=preparedStatement.executeQuery();
				while(resultSet.next()) {
					
				Reply reply =new Reply(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),
						resultSet.getInt(4),resultSet.getInt(5));
				replyList.add(reply);
				}
				return replyList;
			} catch (Exception e) {
				return replyList;
			}
		}
		
		//모든 리플 출력
				public ArrayList<Reply> ReplyList2(int startrow , int listsize ){
					String sql ="select * from reply order by b_num DESC limit ? , ?";
					ArrayList<Reply> replyList = new ArrayList<Reply>();
					try {
						preparedStatement=connection.prepareStatement(sql);
						preparedStatement.setInt(1,startrow);
						preparedStatement.setInt(2,listsize);
						resultSet=preparedStatement.executeQuery();
						while(resultSet.next()) {
							
						Reply reply =new Reply(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),
								resultSet.getInt(4),resultSet.getInt(5));
						replyList.add(reply);
						}
						return replyList;
					} catch (Exception e) {
						System.out.println("ReplyList2 db");
						return replyList;
					}
				}
		
		//게시물 총
		public int boardcount() {
			String sql = "select count(*) from board"; //count : 검색개수
			try {
				preparedStatement=connection.prepareStatement(sql);
				resultSet= preparedStatement.executeQuery();
				if(resultSet.next()) {
					return resultSet.getInt(1);
				}
			} catch (Exception e) {
				System.out.println(" boardcount db오류");
				return 0;
			}
			return 0;
		}
		
		
		// 게시물 총 개수 반환 메소드 
		public int boardcount2( String key , String keyword) {
			String sql = null;
			
			if( key != null && keyword != null ) { // 검색이 있을때 [ 조건 레코드 개수 세기 ]
				if( key.equals("b_writer")  ) {		 //작성자 검색 : 작성자 -> 회원번호
					int m_num = MemberDao.getmMemberDao().member_num(keyword);
					sql ="select count(*) from board where m_no = "+ m_num ;
				}else if( key.equals("b_no") ) {	//번호 검색 : 일치한 값만 검색
					sql ="select count(*) from board where b_no = "+ keyword;
				}else {								 // 제목 혹은 내용 검색 : 포함된 값 검색 
					sql ="select count(*) from board where "+key+" like '%"+keyword+"%'";
				}
			}else { // 검색이 없을때				[ 조건 없는 모든 레코드 개수 세기 ]
				sql="select count(*) from board";
			}
			try {
				preparedStatement=connection.prepareStatement(sql);
				resultSet= preparedStatement.executeQuery();	
				if( resultSet.next() ) { return resultSet.getInt(1); }
			}catch (Exception e) {} return 0;
		}
		
		//리플 삭제
				public boolean replydelete(int r_no) {
					
					String sql="DELETE FROM reply WHERE r_num=?";
					try {
						preparedStatement=connection.prepareStatement(sql);
						preparedStatement.setInt(1, r_no);
						preparedStatement.executeUpdate();
						return true;
					} catch (Exception e) {
						System.out.println("replydelete db");
						return false;
					}
				}
		
		//리플 숫자
				public int replycount(int b_num) {
					String sql = "SELECT count(*) from reply where b_num=?";
					
					try {
						preparedStatement=connection.prepareStatement(sql);
						preparedStatement.setInt(1, b_num);
						resultSet=preparedStatement.executeQuery();
						if(resultSet.next()) {
							return resultSet.getInt(1);
						}
					} catch (Exception e) {
						System.out.println("replycount db오류");
					}
					return 0;
					
				}
		
}
























