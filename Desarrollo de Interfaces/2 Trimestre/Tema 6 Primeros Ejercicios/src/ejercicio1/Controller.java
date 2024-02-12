package ejercicio1;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.sql.SQLException;
import java.util.List;


public class Controller {


    @FXML
    private TableView<TVideoJuego> tableViewVideojuegos;


    @FXML
    private TableColumn<TVideoJuego, String> nombreColumn;


    @FXML
    private TableColumn<TVideoJuego, Integer> anioColumn;


    @FXML
    private TableColumn<TVideoJuego, String> companiaColumn;


    @FXML
    private TableColumn<TVideoJuego, Double> precioColumn;


    @FXML
    private TableColumn<TVideoJuego, String> sinopsisColumn;


    @FXML
    private TableColumn<TVideoJuego, String> plataformaColumn;


    private TVideoJuegoModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new TVideoJuegoModel(dbURL, dbUser, dbPassword);


        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        anioColumn.setCellValueFactory(cellData -> cellData.getValue().anioProperty().asObject());
        companiaColumn.setCellValueFactory(cellData -> cellData.getValue().companiaProperty());
        precioColumn.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
        sinopsisColumn.setCellValueFactory(cellData -> cellData.getValue().sinopsisProperty());
        plataformaColumn.setCellValueFactory(cellData -> cellData.getValue().plataformaProperty());


        try {
            cargarJuegos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void cargarJuegos() throws SQLException {
        tableViewVideojuegos.getItems().clear();


        List<TVideoJuego> videojuegos = model.getAllVideoJuegos();
    
        tableViewVideojuegos.getItems().addAll(videojuegos);
    }


    @FXML
    private void cerrarConexion() {
        try {
            model.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
