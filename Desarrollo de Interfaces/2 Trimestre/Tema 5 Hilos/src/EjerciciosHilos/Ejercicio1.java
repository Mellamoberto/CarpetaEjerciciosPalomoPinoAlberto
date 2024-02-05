package EjerciciosHilos;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejercicio1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Hola buenas. Soy Berto");
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000);

                Platform.runLater(() -> {
                    btn.setText("Hilo ejecutado");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Ejemplo de hilos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}