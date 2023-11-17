package simulacro;
import java.sql.SQLException;
import java.util.List;

public class ProductosController {
	private ProductosModel model;
	private ProductosView view;
	
	public ProductosController(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new ProductosModel(dbURL, dbUser, dbPassword);
		view = new ProductosView();
	}
	
	public void mostrarProductos() throws SQLException {
		List<Productos> productos = model.getAllProductos();
		view.mostrarProductos(productos);
	}
	
	public void cerrarConexion() throws SQLException {
		model.close();
	}
}
