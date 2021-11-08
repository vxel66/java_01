package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

import Domain.Product;
import Domain.ProductCategory;
import Domain.ProductDate;
import dao.MemberDao;
import dao.ProductDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class HomeController implements Initializable  {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		lbltotalmember.setText(MemberDao.getMemberDao().totalcount("member")+"");
		lbltotalboard.setText(MemberDao.getMemberDao().totalcount("board")+"");
		lbltotalproduct.setText(MemberDao.getMemberDao().totalcount("product")+"");
		// 선 차트
//		XYChart.Series series = new XYChart.Series<>();
//		series.setName("좋아요");
//		XYChart.Data data1 = new XYChart.Data<>("1",30);
//		series.getData().add(data1);
//		
//		series.getData().add(new XYChart.Data<>("2",40));
//		series.getData().add(new XYChart.Data<>("3",50));
//		
//		lc.getData().add(series);
		
//		XYChart.Series series = new XYChart.Series<>(); //계열 생성
//		series.setName("등록수"); // 계열 이름
//			// 데이터
//			ObservableList<Product> products = ProductDao.getProductDao().productlist(); //모든 제품 리스트
//			//날짜로 구분
//			ArrayList<ProductDate> dates = new ArrayList<>(); //날짜별 개수를 저장한는
//			
//			for(Product temp : products) {
//				String date = temp.getP_date().split(" ")[0]; //날짜만
//				boolean check = true; //중복체크
//				for(int i = 0;  i < dates.size(); i++) {
//					if(dates.get(i).getDate().equals(date)) { //만약에 리스트에 동일한 날까가 있으면
//						dates.get(i).setCount(dates.get(i).getCount()+1);
//						 check = false;
//						 break;
//					}
//				}
//				if(check) {
//				dates.add(new ProductDate(date,1));//동일한 날짜가 없으면 리스트 추가
//				}
//			}
//			for(ProductDate date : dates) { //날짜별 리스트에서 ㅅ하나씩 꺼내기
//				XYChart.Data data = new XYChart.Data<>(date.getDate()+"",date.getCount());
//				series.getData().add(data);//계열에 값 넣기
//				
//			}
//			
//		lc.getData().add(series); //차트에 계열 넣기
		
		XYChart.Series series =new XYChart.Series<>();	// 1.계열생성
		series.setName("등록수");	// 2.계열이름
		
		// DB 쿼리[QUERY: select 검색결과 ] : 리스트내 객체 하나씩 꺼내기
		ArrayList<ProductDate> productDates = ProductDao.getProductDao().productDatelist();
		for(ProductDate date : productDates) {
			// 3. 계열 값 넣기 
			XYChart.Data data =  new XYChart.Data<>(date.getDate(),date.getCount());
				//2. 값에 노드 설정	[ data.setNode(컨테이너);]
				AnchorPane anchorPane =new AnchorPane();// 컨테이너 만들기
				
					Label label = new Label(date.getCount()+""); // 2.레이블 생성
					label.setPadding(new Insets(1));	//setpadding (new insets (수치) ) :안쪽 여백
				//	Circle circle = new Circle(6, 0);
					
					anchorPane.getChildren().add(label); // 컨테이너 레이블 넣기
					
			//		anchorPane.getChildren().add(circle);
					
					data.setNode(anchorPane);// 값에 컨테이너 넣기
			
			series.getData().add(data);
		}
		//** y축 설정
		lc.getYAxis().setAutoRanging(false);// y축 자동 설정 끄기
		
		
		lc.getData().add(series);// 4. 계열을 차트에 넣기 
		
		if(productDates.get(productDates.size()-1).getCount()>productDates.get(productDates.size()-2).getCount()) {
			lbldecrease.setVisible(false);
		}else {
			lblincrease.setVisible(false);
		}
		
		XYChart.Series series2 = new XYChart.Series<>();
		series2.setName("카테고리");
		
		ArrayList<ProductCategory> productCategories = ProductDao.getProductDao().productcategorylist1();
		for(ProductCategory category : productCategories) {
			XYChart.Data data = new XYChart.Data<>(category.getP_category(),category.getCount());
			
			series2.getData().add(data);
		}
		
		
		bc.getData().add(series2);
		
		//막대 차트
//		XYChart.Series series2 = new XYChart.Series<>(); //1. 계열 생성
//		
//			
//		// 계열에 값넣기
//			HashMap<String, Integer> hashMap = ProductDao.getProductDao().productcategorylist();
//		// 계열에 계열 넣기
//			String maxcategory = " ";
//			int max =0;
//		for(String key : hashMap.keySet()) {
//				if(hashMap.get(key)> max) {
//					max = hashMap.get(key);
//					maxcategory = key;
//				}
//				
//				XYChart.Data data = new XYChart.Data<>(key,hashMap.get(key));
//				series2.getData().add(data);
//				
//			}
//				
//			bc.getData().add(series2);
//			lblcategory.setText(maxcategory);
			
			ObservableList<Product> list = ProductDao.getProductDao().productlist();
			
			
			ObservableList<PieChart.Data> observableList = FXCollections.observableArrayList();
			for(Product product : list) {
				observableList.add(new PieChart.Data(product.getAct(), 1));
			}
			
			
			pc.setData(observableList);
		
//		XYChart.Series series2 = new XYChart.Series<>();
//		series2.setName("테스트");
//		series2.getData().add(new XYChart.Data<>("2021-11-08 ", 1));
//		lc.getData().add(series2);
		
		
	}
	@FXML
	private PieChart pc;
	
	@FXML
	private Label lblcategory;
	
	@FXML
	private Label lbltotalboard;
	
	@FXML
	private Label lbltotalmember;
	
	@FXML
	private Label lbltotalproduct;
	
	@FXML
	private LineChart lc;

	@FXML
	private Label lblincrease;
	
	@FXML
	private Label lbldecrease;
	
	@FXML
	private BarChart bc;
	

	
}

























