package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Domain.Member;


public class MemberDao {

	//jdbc 주요 인터페이스 , 클래스
		//1.Connection : DB변경 인터페이스 [DriverManager 클래스]
	//1.필드
		private Connection connection;
		private PreparedStatement preparedStatement; //sql 연결 인터페이스
		private ResultSet resultSet;				//
		
		private static MemberDao memberDao =new MemberDao();
		
		public MemberDao() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC","root","1234");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public static MemberDao getMemberDao() {
			return memberDao;
		}
	
		//기본 메소드
		//1. 회원가입 메소드
		public boolean signup (Member member) {
			
			//1. SQL 작성 [SQL : DB 조작어 DML]
			String sql = "insert into member(m_id, m_password, m_name, m_email, m_point)" + "values(?,?,?,?,?)";
			
			//2. SQL --> DB연결  [ PreparedStatement 인터페이스 : 연결된 DB에 SQL 조작]
			try {
				preparedStatement = connection.prepareStatement(sql);
				
				//3.sql 조작 [?에 데이터 넣기]
				preparedStatement.setString(1, member.getM_id() );
				preparedStatement.setString(2, member.getM_password());
				preparedStatement.setString(3, member.getM_name());
				preparedStatement.setString(4, member.getM_email());
				preparedStatement.setInt(5, member.getM_point());
				
				//4. 
				preparedStatement.executeUpdate();
				//5.결과
				return true; //db저장 성공시 true 반환
				
				
				
				
			} catch (Exception e) {
				return false;
			}
			
			
			
			
		}
		
		//2. 로그인 메소드
		public boolean login(String id, String password) {
			//1.SQL 설정
			String sql = "select * from member where m_id=? and m_password=?";
			//2.SQL db설정 코조건 예외발생
			try {
				preparedStatement = connection.prepareStatement(sql);
				//3.SQL 설정 현재 메소드로 들어온 인수를 ? 대입
				preparedStatement.setString(1, id);
				preparedStatement.setString(2, password);
				//4.SQL 실행 [Query : 쿼리 실행결과]
				resultSet = preparedStatement.executeQuery();
				//5.SQL 결과 [검색결과 연결]
				if(resultSet.next()) { //쿼리 결과의 내용물이 있으면 true 없으면 fasle
					return true; //로그인 성공
				}else {
					return false;
				}
				
				
				
				
			} catch (Exception e) {
				return false;// db오류
			}
			
			
			
			
			
		}
		
		//3. 아이디 찾기 메소드
		public String findid(String name, String email) {
		
		try {	
			String sql = "select m_id from member where m_name =? and m_email=?";
			preparedStatement =connection.prepareStatement(sql);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return resultSet.getString(1);
			}else {
				return null;
			}
			
			
		}catch (Exception e) {
			return null;
		}
		}
		//4. 패스워드 찾기 메소드
		public String findpassword(String id, String email) {
			
			try {	
				String sql = "select m_id from member where m_id =? and m_email=?";
				preparedStatement =connection.prepareStatement(sql);
				
				preparedStatement.setString(1, id);
				preparedStatement.setString(2, email);
				
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					return resultSet.getString(1);
				}else {
					return null;
				}
				
				
			}catch (Exception e) {
				return null;
			}
			}
		//5.회원수정 메소드
		
		//6. 회원탈퇴 메소드 
		
		
}























