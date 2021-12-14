package dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import dto.Product;

public class ProductDao extends DB {

	public ProductDao() {
		super();
	}	
	
	public static ProductDao productDao =new ProductDao();
	
	public static ProductDao getprProductDao() {
		return productDao;
	}
	
	//1.제품 등록 메소드 
	public boolean productwrite(Product product) {
		
		String sql = "insert into product(p_name,p_price,p_category,p_made,"
				+ "p_activation,p_size,p_count,p_img,p_contents) value("
				+ "?,?,?,?,?,?,?,?,?)";

		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getP_name());
			preparedStatement.setInt(2, product.getP_price());
			preparedStatement.setString(3, product.getP_category());
			preparedStatement.setString(4, product.getP_made());
			preparedStatement.setInt(5, product.getP_activation());
			preparedStatement.setInt(6,product.getP_size());
			preparedStatement.setInt(7, product.getP_count());
			preparedStatement.setString(8, product.getP_img());
			preparedStatement.setString(9,product.getP_contents());
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("productwrite db 오류");
			return false;
		}
	}
	//2.제품 모든 출력 메소드
	public ArrayList<Product> getproduct(){
		ArrayList<Product> arrayList = new ArrayList<Product>();
		String sql="select * from product";
		
		try {
			preparedStatement= connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getInt(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6),
						resultSet.getInt(7),
						resultSet.getInt(8),
						resultSet.getString(9),
						resultSet.getString(10),
						resultSet.getString(11)
						);
				arrayList.add(product);
			}
			return arrayList;
		} catch (Exception e) {
			System.out.println("getproduct db오류");
			return arrayList;
		}
		
	}
	//3.제품 조건 출력 메소드
	public ArrayList<Product> getproduct2(String key,String keyword){
		ArrayList<Product> productlList = new ArrayList<Product>();
		String sql="select * from product";
		if(key!=null&&keyword!=null) {
			sql = "select * from product where "+key+" like '%"+keyword+"%'";
		}
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				Product product = new Product(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getInt(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6),
						resultSet.getInt(7),
						resultSet.getInt(8),
						resultSet.getString(9),
						resultSet.getString(10),
						resultSet.getString(11)
						);
				productlList.add(product);
			}
			return productlList;
		} catch (Exception e) {
			System.out.println("product2 db 오류");
			return productlList;
		}
	}
	//4.제품 수정 메소드
	
	//5.제품 삭제 메소드
	public boolean productdelete(int p_num) {
		String sql="delete from product where p_num=?";
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, p_num);
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("productdelete db 오류");
			return false;
		}
	}
	
	//6 제품 상태변경
	public boolean productact(int p_num ,int p_act) {
		String sql="UPDATE product SET  p_activation= ? WHERE p_num=?";
		try {
			preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, p_act);
			preparedStatement.setInt(2, p_num);
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("productact db 오류");
			return false;
		}
	}
	
	public int productnumact(int p_num) {
		String sql = "SELECT p_activation FROM product WHERE p_num=?";
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, p_num);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				return resultSet.getInt(1);
			}else {
				return 0;
			}
			
		} catch (Exception e) {
			System.out.println("productnumact db 오류");
			return 0 ;
		}
	}
	
	//선택 상품 찾기
	public ArrayList<Product> getproduct3(int p_num){
		ArrayList<Product> arrayList = new ArrayList<Product>();
		String sql="select * from product where p_num=?";
		
		try {
			preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, p_num);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				Product product = new Product(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getInt(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6),
						resultSet.getInt(7),
						resultSet.getInt(8),
						resultSet.getString(9),
						resultSet.getString(10),
						resultSet.getString(11)
						);
				arrayList.add(product);
			}
			return arrayList;
		} catch (Exception e) {
			System.out.println("getproduct3 db오류");
			return arrayList;
		}
		
	}
	
	//제품 수정
	//1.제품 등록 메소드 
		public boolean productupdate(Product product , int p_num) {
			//UPDATE 테이블명 SET 칼럼명 = '변경할값' WHERE 조건
			String sql = "update product set p_name=?, p_price=?, p_category=?, p_made=?, p_size=?, p_count=?,  "
					+ " p_img=?,  p_contents=? where p_num=?";

			try {
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, product.getP_name());
				preparedStatement.setInt(2, product.getP_price());
				preparedStatement.setString(3, product.getP_category());
				preparedStatement.setString(4, product.getP_made());
				preparedStatement.setInt(5,product.getP_size());
				preparedStatement.setInt(6, product.getP_count());
				preparedStatement.setString(7, product.getP_img());
				preparedStatement.setString(8,product.getP_contents());
				preparedStatement.setInt(9, p_num);
				preparedStatement.executeUpdate();
				return true;
			} catch (Exception e) {
				System.out.println("productwrite db 오류");
				return false;
			}
		}
	//제품 번호 받아 검색
		public Product getproduct(int p_num) {
			String sql = "select * from product where p_num="+p_num;
			try {
				preparedStatement=connection.prepareStatement(sql);
				resultSet=preparedStatement.executeQuery();
				if(resultSet.next()) {
					Product product = new Product(
							resultSet.getInt(1),
							resultSet.getString(2),
							resultSet.getInt(3),
							resultSet.getString(4),
							resultSet.getString(5),
							resultSet.getInt(6),
							resultSet.getInt(7),
							resultSet.getInt(8),
							resultSet.getString(9),
							resultSet.getString(10),
							resultSet.getString(11)
							);
					return product;
				}
			} catch (Exception e) {
				return null;
			}
			return null;
		}
		
		
		
		// 제품 좋아요 메소드
				public int plikeupdate(int p_num,int m_num) {
					//1.좋아요 버튼 -> 좋아요 [제품번호 , 회원번호 ]
					//2.제품번호와 회원번호가 일치한 좋아요 없으면 좋아요 생성
					//3.제품번호와 회원번호가 일치한 좋아요 있으면 좋아요 삭제
					String sql = null;
					sql = "select * from plike where p_num="+p_num+" and m_num="+m_num;
					try {
						preparedStatement=connection.prepareStatement(sql);
						resultSet = preparedStatement.executeQuery();
						if(resultSet.next()) {
							sql="delete from plike where p_num="+p_num+" and m_num="+m_num;
							preparedStatement=connection.prepareStatement(sql);
							preparedStatement.executeUpdate();
							return 1;	//좋아요 제거
						}else {
							sql="insert into plike(p_num,m_num) value("+p_num+","+m_num+")";
							preparedStatement=connection.prepareStatement(sql);
							preparedStatement.executeUpdate();
							return 2; 	//좋아요 추가
						}
					} catch (Exception e) {
						return 0;
					}
				}
		
		// 8. 좋아요 확인 메소드
				public boolean plikecheck(int p_num,int m_num) {
					//1.좋아요 버튼 -> 좋아요 [제품번호 , 회원번호 ]
					//2.제품번호와 회원번호가 일치한 좋아요 없으면 좋아요 생성
					//3.제품번호와 회원번호가 일치한 좋아요 있으면 좋아요 삭제
					String sql = null;
					sql = "select * from plike where p_num="+p_num+" and m_num="+m_num;
					try {
						preparedStatement=connection.prepareStatement(sql);
						resultSet = preparedStatement.executeQuery();
						if(resultSet.next()) {
							return true;
						}else {
							return false;
						}
					} catch (Exception e) {
						return false;
					}
				}
		
		
		
		
	
}


































