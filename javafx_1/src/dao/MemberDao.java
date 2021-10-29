package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Domain.Member;


public class MemberDao {

	//jdbc �ֿ� �������̽� , Ŭ����
		//1.Connection : DB���� �������̽� [DriverManager Ŭ����]
	//1.�ʵ�
		private Connection connection;
		private PreparedStatement preparedStatement; //sql ���� �������̽�
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
	
		//�⺻ �޼ҵ�
		//1. ȸ������ �޼ҵ�
		public boolean signup (Member member) {
			
			//1. SQL �ۼ� [SQL : DB ���۾� DML]
			String sql = "insert into member(m_id, m_password, m_name, m_email, m_point)" + "values(?,?,?,?,?)";
			
			//2. SQL --> DB����  [ PreparedStatement �������̽� : ����� DB�� SQL ����]
			try {
				preparedStatement = connection.prepareStatement(sql);
				
				//3.sql ���� [?�� ������ �ֱ�]
				preparedStatement.setString(1, member.getM_id() );
				preparedStatement.setString(2, member.getM_password());
				preparedStatement.setString(3, member.getM_name());
				preparedStatement.setString(4, member.getM_email());
				preparedStatement.setInt(5, member.getM_point());
				
				//4. 
				preparedStatement.executeUpdate();
				//5.���
				return true; //db���� ������ true ��ȯ
				
				
				
				
			} catch (Exception e) {
				return false;
			}
			
			
			
			
		}
		
		//2. �α��� �޼ҵ�
		public boolean login(String id, String password) {
			//1.SQL ����
			String sql = "select * from member where m_id=? and m_password=?";
			//2.SQL db���� ������ ���ܹ߻�
			try {
				preparedStatement = connection.prepareStatement(sql);
				//3.SQL ���� ���� �޼ҵ�� ���� �μ��� ? ����
				preparedStatement.setString(1, id);
				preparedStatement.setString(2, password);
				//4.SQL ���� [Query : ���� ������]
				resultSet = preparedStatement.executeQuery();
				//5.SQL ��� [�˻���� ����]
				if(resultSet.next()) { //���� ����� ���빰�� ������ true ������ fasle
					return true; //�α��� ����
				}else {
					return false;
				}
				
				
				
				
			} catch (Exception e) {
				return false;// db����
			}
			
			
			
			
			
		}
		
		//3. ���̵� ã�� �޼ҵ�
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
		//4. �н����� ã�� �޼ҵ�
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
		//5.ȸ������ �޼ҵ�
		
		//6. ȸ��Ż�� �޼ҵ� 
		
		
}























