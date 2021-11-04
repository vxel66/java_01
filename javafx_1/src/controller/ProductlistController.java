package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;


import Domain.Product;
import dao.ProductDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;

public class ProductlistController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { //화면 로드 되었을때 초기화 
		
		
		
//		ObservableList<Product> products = ProductDao.getProductDao().productlist();
//		//2 제ㅜㅁ등록 리스트를 테이블로 옮기기
//		//3.테이블뷰에 필드를 가져와 리스트내 필드와 연결
//		TableColumn tc = productlist.getColumns().get(0);
//		tc.setCellValueFactory(new PropertyValueFactory<>("p_name"));
//		
//		tc = productlist.getColumns().get(1);
//		tc.setCellValueFactory(new PropertyValueFactory<>("p_category"));
//		
//		tc = productlist.getColumns().get(2);
//		tc.setCellValueFactory(new PropertyValueFactory<>("p_price"));
//		
//		tc = productlist.getColumns().get(3);
//		tc.setCellValueFactory(new PropertyValueFactory<>("p_activation"));
//		
//		productlist.setItems(products);
		tableload();
		
		productlist.setOnMouseClicked(e->{
			if(e.getButton().equals(MouseButton.PRIMARY)) {
				product = productlist.getSelectionModel().getSelectedItem();
				Image img = new Image(product.getP_img());
				
				pimg.setImage(img);
			
				lblpname.setText(product.getP_name());
				
				lblpcontents.setText(product.getP_contents());
				
				lblpprice.setText(product.getP_price()+"");
				
				lblmid.setText(ProductDao.getProductDao().idcheck(product.getM_no()));
				
				if(MainpageController.getinstance().getloginid().equals(ProductDao.getProductDao().idcheck(product.getM_no()))) {
					btnupdate.setVisible(true);
					btndelete.setVisible(true);
				}
			}
		});
		
	}
	
	public static Product product;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnregister;

    @FXML
    private Button btnupdate;

    @FXML
    private Label lblmid;

    @FXML
    private Label lblpcontents;

    @FXML
    private Label lblpname;

    @FXML
    private Label lblpprice;

    @FXML
    private ImageView pimg;

    @FXML
    private TableView<Product> productlist;

    @FXML
    void delete(ActionEvent event) {
    
    	
      	Alert alert= new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("삭제?");
    	
    	Optional<ButtonType>optional = alert.showAndWait();
    	
    	if(optional.get()==ButtonType.OK) {
    		ProductDao.getProductDao().p_delete(product.getP_no());
    		Alert alert2 = new Alert(AlertType.INFORMATION);
    		
    		alert2.setHeaderText("삭제되었습니다");
    		tableload();
    	}
    }

    @FXML
    void register(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productregister");
    }

    boolean upcheck = true;
    @FXML
    void update(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productupdate");
    	
    }
    
    public void tableload() {
    	ObservableList<Product> products = ProductDao.getProductDao().productlist();
		//2 제ㅜㅁ등록 리스트를 테이블로 옮기기
		//3.테이블뷰에 필드를 가져와 리스트내 필드와 연결
		TableColumn tc = productlist.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_name"));
		
		tc = productlist.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_category"));
		
		tc = productlist.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_price"));
		
		tc = productlist.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_activation"));
		
		tc = productlist.getColumns().get(4);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_date"));
		
		productlist.setItems(products);
    }
}
























