package ejercicio2;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.SQLException;
import ejercicio2.Controller;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Mi Aplicación JavaFX");
        primaryStage.setScene(new Scene(root, 900, 300));
        primaryStage.show();

        String dbURL = "jdbc:mysql://localhost/tienda";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Controller controller = loader.getController();
            controller.inicializar(dbURL, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
