package Ejercicio2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio2 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Ejercicio2.fxml"));
	        Parent root = loader.load();
	        primaryStage.setTitle("Mi Aplicacion JavaFX");
	        primaryStage.setScene(new Scene(root, 600, 300));
	        primaryStage.show();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		launch(args);
	}
}