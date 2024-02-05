package EjerciciosHilos;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejercicio2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Hola soy Berto");
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Hilo 1
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000);

                Platform.runLater(() -> {
                    btn.setText("Hilo 1 ejecutado");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Hilo 2
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(4000);

                Platform.runLater(() -> {
                    btn.setText("Hilo 2 hecho");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                Thread.sleep(6000);

                Platform.runLater(() -> {
                    btn.setText("Hilo 3 ejecutado");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Thread ejemplo con muchoas hilos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}