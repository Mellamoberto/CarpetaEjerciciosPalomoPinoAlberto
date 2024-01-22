package Ejercicio1;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Ejercicio1 extends Application {
	@Override
	public void init() throws Exception {
		super.init();
		System.out.println("Metodo init() llamado.");
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println("Metodo start() llamado.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void stop() throws Exception  {
		super.stop();
		System.out.println("Metodo stop() llamado.");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
