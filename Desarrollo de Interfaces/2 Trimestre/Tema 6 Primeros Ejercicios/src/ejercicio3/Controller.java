package ejercicio3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


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


    @FXML
    private TextField nombreTextField;


    @FXML
    private TextField anioTextField;


    @FXML
    private ComboBox<String> cmbCompania;


    @FXML
    private TextField precioTextField;


    @FXML
    private TextField sinopsisTextField;


    @FXML
    private ChoiceBox<String> choicePlataforma;


    @FXML
    private Button btnAgregarJuego;


    private TVideoJuegoModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new TVideoJuegoModel(dbURL, dbUser, dbPassword);
          


        btnAgregarJuego.setOnAction(event -> agregarJuego());


        cargarCompanias();
        cargarPlataformas();


        
    }


  
    private void cargarCompanias() {
        List<String> companias = List.of("EA", "Ubisoft", "Activision", "Nintendo", "Sony", "Microsoft");


        cmbCompania.setItems(FXCollections.observableArrayList(companias));
    }


    private void cargarPlataformas() {
        List<String> plataformas = List.of("PC", "PlayStation", "Xbox", "Nintendo Switch");


        choicePlataforma.setItems(FXCollections.observableArrayList(plataformas));
    }


    @FXML
    private void agregarJuego() {
        String nombre = nombreTextField.getText();
        int anio = Integer.parseInt(anioTextField.getText());
        String compania = cmbCompania.getValue();
        double precio = Double.parseDouble(precioTextField.getText());
        String sinopsis = sinopsisTextField.getText();
        String plataforma = choicePlataforma.getValue();


        TVideoJuego nuevoJuego = new TVideoJuego(0, nombre, anio, compania, precio, sinopsis, plataforma);


        try {
            model.addVideoJuego(nuevoJuego);
          
        } catch (SQLException e) {
            e.printStackTrace();
        }


        String mensaje = "Juego añadido:\n" +
                "Nombre: " + nombre + "\n" +
                "Año: " + anio + "\n" +
                "Compañía: " + compania + "\n" +
                "Precio: " + precio + "\n" +
                "Sinopsis: " + sinopsis + "\n" +
                "Plataforma: " + plataforma;


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Juego Añadido");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();


        limpiarCampos();
    }


    @FXML
    private void limpiarCampos() {
        nombreTextField.clear();
        anioTextField.clear();
        cmbCompania.setValue(null);
        precioTextField.clear();
        sinopsisTextField.clear();
        choicePlataforma.setValue(null);
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
