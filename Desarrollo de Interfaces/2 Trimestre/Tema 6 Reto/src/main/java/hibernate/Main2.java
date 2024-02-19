package hibernate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main2 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Ejercicio2.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 900, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi Aplicación JavaFX");
        primaryStage.show();
        System.out.println("inicializando el formulario");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
