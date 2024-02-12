package ejercicio2;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.sql.SQLException;
import java.util.List;


public class Controller {


    @FXML
    private TableView<Producto> tableViewProductos;

    @FXML
    private TableColumn<Producto, String> nombreColumn;


    @FXML
    private TableColumn<Producto, Double> precioColumn;


    @FXML
    private TableColumn<Producto, Integer> codigoFabricanteColumn;


    private ProductoModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new ProductoModel(dbURL, dbUser, dbPassword);

        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        precioColumn.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
        codigoFabricanteColumn.setCellValueFactory(cellData -> cellData.getValue().codigoFabricanteProperty().asObject());

        try {
            cargarProductos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void cargarProductos() throws SQLException {
        tableViewProductos.getItems().clear();


        List<Producto> productos = model.getAllProductos();
    
        tableViewProductos.getItems().addAll(productos);
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