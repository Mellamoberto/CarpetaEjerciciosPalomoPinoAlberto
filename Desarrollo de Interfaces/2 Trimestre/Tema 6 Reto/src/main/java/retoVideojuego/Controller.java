package retoVideojuego;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;

import Ejercicio2.TVideoJuego;

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
    private ChoiceBox<String> choiceCompania;

    @FXML
    private TextField precioTextField;

    @FXML
    private TextField sinopsisTextField;

    @FXML
    private ChoiceBox<String> choicePlataforma;

    @FXML
    private Button btnAgregarJuego;
    
    @FXML
    private Button btnBorrarJuego;

    private TVideoJuegoModel model;

    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new TVideoJuegoModel(dbURL, dbUser, dbPassword);
        
        // Configura las columnas de la TableView
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        anioColumn.setCellValueFactory(cellData -> cellData.getValue().anioProperty().asObject());
        companiaColumn.setCellValueFactory(cellData -> cellData.getValue().companiaProperty());
        precioColumn.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
        sinopsisColumn.setCellValueFactory(cellData -> cellData.getValue().sinopsisProperty());
        plataformaColumn.setCellValueFactory(cellData -> cellData.getValue().plataformaProperty());
        
        
        // Al inicializar el controlador, carga los juegos desde la base de datos
        try {
            cargarJuegos();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Configura el botón de agregar juego
        btnAgregarJuego.setOnAction(event -> agregarJuego());

        // Configura los desplegables
        cargarCompanias();
        cargarPlataformas();

        // Al inicializar el controlador, carga los juegos desde la base de datos
        
    }

    private void cargarJuegos() throws SQLException {
        // Limpiar la TableView antes de cargar nuevos datos
        tableViewVideojuegos.getItems().clear();

        List<TVideoJuego> videojuegos = model.getAllVideoJuegos();
    
        // Agrega los datos a la TableView
        tableViewVideojuegos.getItems().addAll(videojuegos);
    }
    
    
    private void cargarCompanias() {
        // Puedes obtener la lista de compañías desde la base de datos o definirla estáticamente
        // Por ahora, la definiremos estáticamente
        List<String> companias = List.of("EA", "Ubisoft", "Activision", "Nintendo", "Sony", "Microsoft");

        // Configura el ComboBox con las compañías
        choiceCompania.setItems(FXCollections.observableArrayList(companias));
    }

    private void cargarPlataformas() {
        // Puedes obtener la lista de plataformas desde la base de datos o definirla estáticamente
        // Por ahora, la definiremos estáticamente
        List<String> plataformas = List.of("PC", "PlayStation", "Xbox", "Nintendo Switch");

        // Configura el ChoiceBox con las plataformas
        choicePlataforma.setItems(FXCollections.observableArrayList(plataformas));
    }
    
    public void refreshTableView() {
        try {
            // Vuelve a cargar los datos desde la base de datos
            cargarJuegos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void agregarJuego() {
        // Obtener los valores de los campos de texto y desplegables
        String nombre = nombreTextField.getText();
        int anio = Integer.parseInt(anioTextField.getText());
        String compania = choiceCompania.getValue();
        double precio = Double.parseDouble(precioTextField.getText());
        String sinopsis = sinopsisTextField.getText();
        String plataforma = choicePlataforma.getValue();

        // Crear un nuevo TVideoJuego
        TVideoJuego nuevoJuego = new TVideoJuego(0, nombre, anio, compania, precio, sinopsis, plataforma);

        // Agregar el juego a la base de datos y actualizar la TableView
        try {
            model.addVideoJuego(nuevoJuego);
          
            refreshTableView();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Mostrar un mensaje indicando que el juego ha sido añadido
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

        // Limpiar los campos después de agregar el juego
        limpiarCampos();
    }
    @FXML
    private void limpiarCampos() {
        nombreTextField.clear();
        anioTextField.clear();
        choiceCompania.setValue(null);
        precioTextField.clear();
        sinopsisTextField.clear();
        choicePlataforma.setValue(null);
    }
    @FXML
    private void borrarRegistro() {
    	 String nombreJuego = nombreTextField.getText();
    	 try {
    	        model.borrarRegistro(nombreJuego);
    	        tableViewVideojuegos.getItems().removeIf(juego -> juego.getNombre().equals(nombreJuego));
    	        cargarJuegos();
    	        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	        alert.setTitle("Juego borrado");
    	        alert.setHeaderText(null);
    	        alert.setContentText("ha borrado el juego "+nombreJuego);
    	        alert.showAndWait();
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    }
    	  limpiarCampos();
    }
    
    
    @FXML
    private void actualizarJuego() {
        // Obtener el nombre del juego a actualizar
        String nombreJuegoActualizar = nombreTextField.getText();

        // Obtener los nuevos valores para el juego
        String nombre = nombreTextField.getText();
        int anio = obtenerValorNumerico(anioTextField.getText());
        String compania = choiceCompania.getValue();
        double precio = obtenerValorNumerico(precioTextField.getText());
        String sinopsis = sinopsisTextField.getText();
        String plataforma = choicePlataforma.getValue();

        if (nombre.isEmpty() || compania == null || plataforma == null) {
            mostrarError("Todos los campos son obligatorios.");
            return;
        }

        // Crear un nuevo TVideoJuego con los valores actualizados
        TVideoJuego juegoActualizado = new TVideoJuego(0, nombre, anio, compania, precio, sinopsis, plataforma);

        // Llamar al método de actualización en el modelo
        try {
            model.updateVideoJuego(nombreJuegoActualizar, juegoActualizado);

            // Actualizar la TableView
            refreshTableView();

            // Mostrar mensaje de éxito
            mostrarMensaje("Juego actualizado con éxito.");
        } catch (SQLException e) {
            mostrarError("Error al actualizar el juego.");
            e.printStackTrace();
        }

        // Limpiar los campos después de actualizar el juego
        limpiarCampos();
    }
    
    private void mostrarError(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Éxito");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    
    private int obtenerValorNumerico(String valor) {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            mostrarError("Ingrese un valor numérico válido.");
            return 0;
        }
    }
    
    
    @FXML
    private void cerrarConexion() {
        // Cierra la conexión a la base de datos
        try {
            model.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}