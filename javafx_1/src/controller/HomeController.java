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
		// �� ��Ʈ
//		XYChart.Series series = new XYChart.Series<>();
//		series.setName("���ƿ�");
//		XYChart.Data data1 = new XYChart.Data<>("1",30);
//		series.getData().add(data1);
//		
//		series.getData().add(new XYChart.Data<>("2",40));
//		series.getData().add(new XYChart.Data<>("3",50));
//		
//		lc.getData().add(series);
		
//		XYChart.Series series = new XYChart.Series<>(); //�迭 ����
//		series.setName("��ϼ�"); // �迭 �̸�
//			// ������
//			ObservableList<Product> products = ProductDao.getProductDao().productlist(); //��� ��ǰ ����Ʈ
//			//��¥�� ����
//			ArrayList<ProductDate> dates = new ArrayList<>(); //��¥�� ������ �����Ѵ�
//			
//			for(Product temp : products) {
//				String date = temp.getP_date().split(" ")[0]; //��¥��
//				boolean check = true; //�ߺ�üũ
//				for(int i = 0;  i < dates.size(); i++) {
//					if(dates.get(i).getDate().equals(date)) { //���࿡ ����Ʈ�� ������ ��� ������
//						dates.get(i).setCount(dates.get(i).getCount()+1);
//						 check = false;
//						 break;
//					}
//				}
//				if(check) {
//				dates.add(new ProductDate(date,1));//������ ��¥�� ������ ����Ʈ �߰�
//				}
//			}
//			for(ProductDate date : dates) { //��¥�� ����Ʈ���� ���ϳ��� ������
//				XYChart.Data data = new XYChart.Data<>(date.getDate()+"",date.getCount());
//				series.getData().add(data);//�迭�� �� �ֱ�
//				
//			}
//			
//		lc.getData().add(series); //��Ʈ�� �迭 �ֱ�
		
		XYChart.Series series =new XYChart.Series<>();	// 1.�迭����
		series.setName("��ϼ�");	// 2.�迭�̸�
		
		// DB ����[QUERY: select �˻���� ] : ����Ʈ�� ��ü �ϳ��� ������
		ArrayList<ProductDate> productDates = ProductDao.getProductDao().productDatelist();
		for(ProductDate date : productDates) {
			// 3. �迭 �� �ֱ� 
			XYChart.Data data =  new XYChart.Data<>(date.getDate(),date.getCount());
				//2. ���� ��� ����	[ data.setNode(�����̳�);]
				AnchorPane anchorPane =new AnchorPane();// �����̳� �����
				
					Label label = new Label(date.getCount()+""); // 2.���̺� ����
					label.setPadding(new Insets(1));	//setpadding (new insets (��ġ) ) :���� ����
				//	Circle circle = new Circle(6, 0);
					
					anchorPane.getChildren().add(label); // �����̳� ���̺� �ֱ�
					
			//		anchorPane.getChildren().add(circle);
					
					data.setNode(anchorPane);// ���� �����̳� �ֱ�
			
			series.getData().add(data);
		}
		//** y�� ����
		lc.getYAxis().setAutoRanging(false);// y�� �ڵ� ���� ����
		
		
		lc.getData().add(series);// 4. �迭�� ��Ʈ�� �ֱ� 
		
		if(productDates.get(productDates.size()-1).getCount()>productDates.get(productDates.size()-2).getCount()) {
			lbldecrease.setVisible(false);
		}else {
			lblincrease.setVisible(false);
		}
		
		XYChart.Series series2 = new XYChart.Series<>();
		series2.setName("ī�װ�");
		
		ArrayList<ProductCategory> productCategories = ProductDao.getProductDao().productcategorylist1();
		for(ProductCategory category : productCategories) {
			XYChart.Data data = new XYChart.Data<>(category.getP_category(),category.getCount());
			
			series2.getData().add(data);
		}
		
		
		bc.getData().add(series2);
		
		//���� ��Ʈ
//		XYChart.Series series2 = new XYChart.Series<>(); //1. �迭 ����
//		
//			
//		// �迭�� ���ֱ�
//			HashMap<String, Integer> hashMap = ProductDao.getProductDao().productcategorylist();
//		// �迭�� �迭 �ֱ�
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
//		series2.setName("�׽�Ʈ");
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

























