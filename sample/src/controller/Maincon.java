package controller;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class Maincon {
	
	public static Maincon ins;
	public Maincon() {
		ins=this;
	}
	public static Maincon getmain() {
		return ins;
	}
	
	@FXML
    private TextArea txtid;

    @FXML
    private TextArea txtpw;
	
		@FXML
	    private Button btnb;

	    @FXML
	    private BorderPane mainp;
	    
	    public String id;

	    @FXML
	    void btn(ActionEvent event) {
	    	boolean login = MemberDao.getMemberDao().login(txtid.getText(), txtpw.getText());
	    	
	    	if(login) {
	    		id = txtid.getText();
		    	
		    	loadpage("boardlist");
	    	}
	    	
	    	
	    }
	    
	    public void loadpage(String page) {
	    	try {
	    		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/"+page+".fxml"));
	    		mainp.setCenter(parent);
	    	}catch (Exception e) {
				
			}
	    }
}



