module java2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires mail;
	requires activation;
	
	
	opens Domain to mail , activation,javafx.base;
	opens dao to java.sql,javafx.base;
	opens app to javafx.graphics, javafx.fxml,javafx.base;
	opens controller to javafx.graphics, javafx.fxml,javafx.base;
	opens Day2 to javafx.graphics, javafx.fxml,javafx.base;
}
