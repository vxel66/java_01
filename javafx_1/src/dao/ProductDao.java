package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import Domain.Product;
import Domain.ProductCategory;
import Domain.ProductDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductDao {
	
	// 필드
	private Connection connection;	//db 연결 인터페이스
	private PreparedStatement preparedStatement; //sql 연결 인터페이스
	private ResultSet resultSet;
	//객체
	public static ProductDao productDao = new ProductDao();
		
	public static ProductDao getProductDao() {
		return productDao;
	}
	
	public ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC","root","1234");
		} catch (Exception e) {		
		}	
	}
	
	//3.메소드
		//1. 제품 등록
		public boolean register( Product product) {
			String sql = "insert into  product(p_name, p_img, p_contents, p_category, p_price, p_activation, m_no)"+"values(?,?,?,?,?,?,?)";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, product.getP_name());
				preparedStatement.setString(2, product.getP_img());
				preparedStatement.setString(3, product.getP_contents());
				preparedStatement.setString(4, product.getP_category());
				preparedStatement.setInt(5, product.getP_price());
				preparedStatement.setInt(6, product.getP_activation());
				preparedStatement.setInt(7, product.getM_no());
				preparedStatement.executeUpdate();
				return true;
			}catch (Exception e) {
				return false;
			}
		}
		//10 회원 id의 회원번호 찾기 메소드
		public int bnocheck(String id) {
			
			String sql = "select m_no from member where m_id =?";
			
			try {
				preparedStatement= connection.prepareStatement(sql);
				preparedStatement.setString(1, id);
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
		public String idcheck(int m_no) {
			
			String sql = "select m_id from member where m_no =?";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, m_no);
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					return resultSet.getString(1);
				}else {
					return "망함";
				}
				
			}catch (Exception e) {
				return "망함";
			}
			
		}
		
		//2. 제품 목록
		public ObservableList<Product> productlist(){
			
			ObservableList<Product> products = FXCollections.observableArrayList();
			String sql = "select *from product order by p_no desc";
			try {
				preparedStatement = connection.prepareStatement(sql);
				
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) { //검색 결과 레코드가 없을대까지 레코드 하나씩 변환
					//해당 레코드르르 객채화
					Product product = new Product( resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),resultSet.getString(5), resultSet.getInt(6), resultSet.getInt(7), resultSet.getString(8),resultSet.getInt(9));
					products.add(product);
					//객체 리스트에 저장
				}return products;
				
			}catch (Exception e) {
				return products;
			}
			
		}
		//3. 제품삭제
		public boolean p_delete(int p_no) {
			
			String sql = "delete from product where p_no=? ";
			try {
				preparedStatement= connection.prepareStatement(sql);
				preparedStatement.setInt(1, p_no);
				preparedStatement.executeUpdate();
				return true ;
			}catch (Exception e) {
				return false;
			}
		}
		
//		//4. 제품수정
		public boolean p_update(Product product ,int p_no) {
			String sql = "update product set p_name =?, p_img=?, p_contents=?, p_category=?, p_price=? where p_no=? ";
			
			try {
				preparedStatement= connection.prepareStatement(sql);
				preparedStatement.setString(1, product.getP_name());
				preparedStatement.setString(2, product.getP_img());
				preparedStatement.setString(3, product.getP_contents());
				preparedStatement.setString(4, product.getP_category());
				preparedStatement.setInt(5, product.getP_price());
				preparedStatement.setInt(6, p_no);
				preparedStatement.executeUpdate();
				return true;
				
				
			}catch (Exception e) {
				return false;
			}
		}
		
		//마이인포 제품리스트
		public ObservableList<Product> myproductlist(int m_no){
			
			ObservableList<Product> products = FXCollections.observableArrayList();
			String sql = "select *from product where m_no=? order by p_no desc";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1,m_no );
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) { //검색 결과 레코드가 없을대까지 레코드 하나씩 변환
					//해당 레코드르르 객채화
					Product product = new Product( resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),resultSet.getString(5), resultSet.getInt(6), resultSet.getInt(7), resultSet.getString(8),resultSet.getInt(9));
					products.add(product);
					//객체 리스트에 저장
				}return products;
				
			}catch (Exception e) {
				return products;
			}
			
		}
		//상태 활성화
		public boolean activationupdate( int p_activation , int p_no) {
			String sql = "update product set p_activation =? where p_no=?";
			try {
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, p_activation);
				preparedStatement.setInt(2, p_no);
				preparedStatement.executeUpdate();
				return true;
				
				
			}catch (Exception e) {
				return false;
			}
			
		}
		
		//날짜별 제품수 변환 
		public ArrayList<ProductDate> productDatelist() {
			
			ArrayList<ProductDate> productDates = new ArrayList<>();
			String sql = "select substring_index(p_date,' ' , 1 ) , "+ 
					"count(*) from product group by substring_index( p_date,' ' , 1 )";
			
			try {
				
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					ProductDate date =new ProductDate(resultSet.getString(1),resultSet.getInt(2));
					
					productDates.add(date);
				}
				return productDates;
			}catch (Exception e) {
				return productDates;
			}
					
			
		}
		
		public HashMap<String, Integer> productcategorylist() {
			
			HashMap<String,Integer> hashmap = new HashMap<String, Integer>();
			
			String sql = "select p_category,count(*) from product group by p_category";
			
			try {
				
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
						
					hashmap.put(resultSet.getString(1), resultSet.getInt(2));
					return hashmap;
					
				}
				return hashmap;
			}catch (Exception e) {
				return hashmap;
			}
					
			
		}
public ArrayList<ProductCategory> productcategorylist1() {
			
			ArrayList<ProductCategory> productDates = new ArrayList<>();
			
			String sql = "select  p_category,count(*) from product group by p_category";
			
			try {
				
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					ProductCategory date =new ProductCategory(resultSet.getString(1),resultSet.getInt(2));
					
					productDates.add(date);
				}
				return productDates;
			}catch (Exception e) {
				return productDates;
			}
					
			
		}
		
}




























