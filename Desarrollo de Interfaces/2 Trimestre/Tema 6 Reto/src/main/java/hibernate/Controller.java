package hibernate;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// el error esta en que no esta cargando estos metodos, ni inicializar
//ni cargarfabricanteasyn


public class Controller implements Initializable{

    @FXML
    private TableView<Fabricante> tableViewFabricantes;

    @FXML
    private TableColumn<Fabricante, Integer> idColumn;

    @FXML
    private TableColumn<Fabricante, String> nombreColumn;

    private SessionFactory sessionFactory;

    // ExecutorService para cargar los datos en un hilo separado
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    private void inicializar() {
    	  System.out.println("Cantidad de fabricantes recuperados: ");
        sessionFactory = new Configuration().configure().buildSessionFactory();
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        System.out.println("Inicializando Controller...");
        cargarFabricantesAsync();
    }

    private void cargarFabricantesAsync() {
        executorService.submit(() -> {
            try (Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                List<Fabricante> fabricantes = session.createQuery("from Fabricante", Fabricante.class).list();
                System.out.println("Cantidad de fabricantes recuperados: " + fabricantes.size());
                // Actualizar la tabla en el hilo de la interfaz de usuario
                tableViewFabricantes.getItems().clear();
                tableViewFabricantes.getItems().addAll(fabricantes);
                System.out.println("Cantidad de fabricantes recuperados: " + fabricantes.size());
                session.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    private void cerrarConexion() {
        executorService.shutdown();
        sessionFactory.close();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		inicializar();
	}
}