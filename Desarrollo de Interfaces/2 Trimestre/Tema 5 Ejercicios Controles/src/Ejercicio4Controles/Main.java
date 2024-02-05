package Ejercicio4Controles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Ejercicio4Controles.fxml"));

        Scene scene = new Scene(root, 600, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GridPane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
