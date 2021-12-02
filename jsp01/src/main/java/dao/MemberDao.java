package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;


public class MemberDao {

	
	// 1. 빌드 -> 라이브러리 추가
	// 2. 프로젝트내 WEB-INF - > lib -> 라이브러리 추가
	
		//1. 자주 사용하는 인터페이스
	private Connection connection;
	private ResultSet resultSet;
	private PreparedStatement preparedStatement;
	
	public MemberDao() {
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
	
	public static MemberDao memberDao = new MemberDao();
	public static MemberDao getmMemberDao() {return memberDao;}
		
	public boolean membersignup(Member member ) {	
		
		String sql = "insert into member(m_id,m_password,m_name,m_brith,m_sex,m_phone,m_address)value(?,?,?,?,?,?,?)";
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, member.getId());
			preparedStatement.setString(2, member.getPassword());
			preparedStatement.setString(3, member.getName());
			preparedStatement.setString(4, member.getBrith());
			preparedStatement.setString(5, member.getSex());
			preparedStatement.setString(6, member.getPhone());
			preparedStatement.setString(7, member.getAdress());
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	//로그인
	
	public boolean memberlogin(String id , String pw ) {
		
		String sql = "select * from member where m_id=? and m_password=?";
		try {
			preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pw);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("memberlogin db 오류");
			return false;
		}		
	}
	
	public boolean idcheck( String id  ) {
		
		String sql = "select * from member where m_id=? ";
		try {
			preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("memberlogin db 오류");
			return false;
		}		
	}
	
	//맴버 정보 가져오기
	public Member memberinfo( String id ) {
		Member member= new Member();
		String sql = "select m_id,m_password,m_name,m_brith,m_sex,m_phone,m_address from member where m_id=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				member = new Member(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
						resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
				return member;
			}
			
		} catch (Exception e) {
			System.out.println("memberinfo db 오류");
		}
		return member;
		
	}
	
	//정보 업데이트 
	public boolean infoupdate(String pw , String name, String address ,String id ) {
		//update 테이블명 set 변경필드 = 값 , 변경필드2 = 값2 where 조건
		String sql = "update member set m_password=? , m_name=? , m_address=? where m_id=? ";
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, pw);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, id);
			preparedStatement.executeQuery();
			return true;
		} catch (Exception e) {
			System.out.println("infoupdate db 오류");
			return false;
		}
	}
	
}





















