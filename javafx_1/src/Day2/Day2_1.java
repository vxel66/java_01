package Day2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day2_1 extends Application {

@Override
	public void start(Stage stage) throws Exception {
		//¾Àºô´õ ÆÄÀÏ °¡Á®¿À±â
			//1. parent 
		Parent parent = FXMLLoader.load(getClass().getResource("test01.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
	
		stage.show();
		
	}	
	
	public static void main(String[] args) {
		launch(args);
		
	}

}
