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
		private Connection connection;	//db 연결 인터페이스
		private PreparedStatement preparedStatement; //sql 연결 인터페이스
		private ResultSet resultSet;				// sql 결과(쿼리) 연결
		
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
			//DML [조작어]
			//1. SQL 작성 [SQL : DB 조작어 DML]
					// 삽입 :insert info 테이블명( 필드1 , 필드2 ) + values(값1,값2) 
						//모든 필드 삽입 : insert into 테이블명 value(값1,값2) - 필드명 생략
			//2.검색: select 필드명 from 테이블명 wehere 조건
					//*모든필드 겁색 : select*from 테이블명 where 조건
					//*모든필드 검색시 : *(와일드카드)
			//3.삭제 delet
			//4.수정 update
			
			//*키워드	
				//1.where :조건
				//2.and :이면서 
				//3.or : 또는
			
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
		
		//아이디 체크 메소드
		
		public boolean idcheck(String id) {
			try {
			String sql = "select m_id from member where m_id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			}else {
				return false;
			}			
			}catch (Exception e) {
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
		//포인트 증감 메소드
		public boolean pointupdate(String id, int point) {
			String sql = "update member set m_point = m_point+? where m_id =?";
			try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, point);
			preparedStatement.setString(2, id);
			preparedStatement.executeUpdate();
			return true;
			}
			catch (Exception e) {
				return false;
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
		public boolean update( String name, String email, String id) {
			String sql = "update member set m_name = ? ,m_email =? where m_id = ?";
			
			try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, id);
			preparedStatement.executeUpdate();
			return true;
			}catch (Exception e) {
				return false;
			}
			
		}
		
		
		//6. 회원탈퇴 메소드
		public boolean delete(String id) {
			String sql = "delete  from member where m_email=?";
						//delete from 테이블명
						//delete from 테이블명 where 조건			
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, id);
				preparedStatement.executeUpdate();
				return true; //삭제 성공시 true
				
			} catch (SQLException e) {
				return false;
			}
			
		}
		
		//7.회원조회 메소드 [회원 아이디를 인수로받아 회원정보를 반환
		public Member getmember(String loginid) {
			
			//1.sql 작성
			String sql = "select * from member where m_id=?";
			//2.sql 연결
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, loginid);
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					//패스워드를 제외한 회원정보 변환
					Member member = new Member(resultSet.getString(1), resultSet.getString(2), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				return member;
				}else {
					return null;
				}
				
				
			} catch (SQLException e) {
				return null;
			}
			//3.sql조작
			
			//4.sql 조작
			
			//5.sql 결과
			
		}
		
		//12 회원수 변환 메소드
//		public int membercount (int a) {
//			String b = null;
//			if( a==1) {
//				b = "member";
//			}
//			if(a==2) {
//				b = "board";
//			}
//			if(a==3) {
//				b = "product";
//			}
//			String sql = "select count(*) from "+b;
//			
//			try {
//				preparedStatement= connection.prepareStatement(sql);
//				resultSet = preparedStatement.executeQuery();
//				
//				if(resultSet.next()) {
//					return resultSet.getInt(1);
//				}else {
//					return 0;
//				}
//			}catch (Exception e) {
//				return 0;
//			}
//			
//		}
		
		public int totalcount (String a) {
	
			String sql = "select count(*) from "+a;
			
			try {
				preparedStatement= connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next()) {
					return resultSet.getInt(1);
				}else {
					return 0;
				}
			}catch (Exception e) {
				return 0;
			}
			
		}
		
		
		
}























