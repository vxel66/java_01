package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.member_tbl_02_DTO;

public class member_tbl_02_DAO {	//1. db 연동 클래스
	
	private PreparedStatement ps;	//2. sql 조작 인터페이스
	private Connection con;			//3. db 연결 인터페이스
	private ResultSet rs;			//4. sql 결과 인터페이스
	
	public member_tbl_02_DAO(){	//db 클래스 생성자
		try {
			con = getConnection();						//아래에 있는 연결 메소드의 반환타입을 con 에 저장
				//반환 결과 예외처리 옴
			System.out.println("연동성공");
		} catch (Exception e) {}
	}
	
	public static Connection getConnection() throws Exception {
												// 예외처리 던지기
		Class.forName("oracle.jdbc.OracleDriver");	//db 드라이브 연결	[ 무조건 예외처리 발생 ]
		// 특정 db 연결
		Connection con  = DriverManager.getConnection	
				("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
		return con; //연결된 인터페이스 반환
	}
	
	// 1. 마지막번호 +1 
	public int getcustno() {
		
		String sql = "select max(custno) from member_tbl_02";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1)+1;
			}
			}catch (Exception e) {}
		return -1;
	}
	
	public boolean join(member_tbl_02_DTO dto) {
		
		String sql = "INSERT INTO MEMBER_TBL_02 VALUES(?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getCustno());
			ps.setString(2, dto.getCustname());
			ps.setString(3, dto.getPhone());
			ps.setString(4, dto.getAddress());
			ps.setString(5, dto.getJoindate());
			ps.setString(6, dto.getGrade());
			ps.setString(7, dto.getCity());
			ps.executeUpdate();
			return true;
			
		}catch (Exception e) {
		}
		return false;
	}
	
	public ArrayList<member_tbl_02_DTO> getlist(){
		
		ArrayList<member_tbl_02_DTO> list = new ArrayList<>();
		String sql = "select * from member_tbl_02";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				member_tbl_02_DTO dto = new member_tbl_02_DTO(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7)
						);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}return null;
	}

	
	public member_tbl_02_DTO getmember(String custno) {
		
		String sql = "select * from member_tbl_02 where custno=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, custno);
			rs = ps.executeQuery();
			if(rs.next()) {
				member_tbl_02_DTO dto = new member_tbl_02_DTO(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7)
						);
				return dto;
			}
			}catch (Exception e) {}
		return null;
	}
	
	public boolean update(member_tbl_02_DTO dto) {
		
		String sql = "UPDATE member_tbl_02 SET custno = ?, custname=?, phone=?,address=?,joindate=?,grade=?,city=?"
				+ " WHERE custno="+dto.getCustno();
		
		try {
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getCustno());
				ps.setString(2, dto.getCustname());
				ps.setString(3, dto.getPhone());
				ps.setString(4, dto.getAddress());
				ps.setString(5, dto.getJoindate());
				ps.setString(6, dto.getGrade());
				ps.setString(7, dto.getCity());
				ps.executeUpdate();
			}catch (Exception e) {}
		return false;
	}
	
	
	public ArrayList<member_tbl_02_DTO> getsales() {
		ArrayList<member_tbl_02_DTO> arrayList = new ArrayList<member_tbl_02_DTO>();
		String sql = "select A.custno , A.custname , A.grade , SUM(B.PRICE)  from member_tbl_02 A join money_tbl_02 B on A.custno = B.custno GROUP BY (A.CUSTNO , A.CUSTNAME , A.GRADE) ORDER BY SUM(B.PRICE) DESC";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				member_tbl_02_DTO dto = new member_tbl_02_DTO(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)
						);
				arrayList.add(dto);
			}
			return arrayList;
			}catch (Exception e) {}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
