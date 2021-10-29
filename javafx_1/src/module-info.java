module java2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires mail;
	requires activation;
	
	
	
	opens Domain to mail , activation;
	opens dao to java.sql;
	opens app to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml;
	opens Day2 to javafx.graphics, javafx.fxml;
}
