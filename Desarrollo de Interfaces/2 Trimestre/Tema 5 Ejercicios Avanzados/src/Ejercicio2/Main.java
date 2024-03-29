package Ejercicio2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TdJuegos.fxml"));

        Scene scene = new Scene(root, 600, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("menu");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
