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
		private Connection connection;	//db ���� �������̽�
		private PreparedStatement preparedStatement; //sql ���� �������̽�
		private ResultSet resultSet;				// sql ���(����) ����
		
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
			//DML [���۾�]
			//1. SQL �ۼ� [SQL : DB ���۾� DML]
					// ���� :insert info ���̺��( �ʵ�1 , �ʵ�2 ) + values(��1,��2) 
						//��� �ʵ� ���� : insert into ���̺�� value(��1,��2) - �ʵ�� ����
			//2.�˻�: select �ʵ�� from ���̺�� wehere ����
					//*����ʵ� �̻� : select*from ���̺�� where ����
					//*����ʵ� �˻��� : *(���ϵ�ī��)
			//3.���� delet
			//4.���� update
			
			//*Ű����	
				//1.where :����
				//2.and :�̸鼭 
				//3.or : �Ǵ�
			
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
		
		//���̵� üũ �޼ҵ�
		
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
		//����Ʈ ���� �޼ҵ�
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
		
		
		//6. ȸ��Ż�� �޼ҵ�
		public boolean delete(String id) {
			String sql = "delete  from member where m_email=?";
						//delete from ���̺��
						//delete from ���̺�� where ����			
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, id);
				preparedStatement.executeUpdate();
				return true; //���� ������ true
				
			} catch (SQLException e) {
				return false;
			}
			
		}
		
		//7.ȸ����ȸ �޼ҵ� [ȸ�� ���̵� �μ��ι޾� ȸ�������� ��ȯ
		public Member getmember(String loginid) {
			
			//1.sql �ۼ�
			String sql = "select * from member where m_id=?";
			//2.sql ����
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, loginid);
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					//�н����带 ������ ȸ������ ��ȯ
					Member member = new Member(resultSet.getString(1), resultSet.getString(2), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				return member;
				}else {
					return null;
				}
				
				
			} catch (SQLException e) {
				return null;
			}
			//3.sql����
			
			//4.sql ����
			
			//5.sql ���
			
		}
		
		//12 ȸ���� ��ȯ �޼ҵ�
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























