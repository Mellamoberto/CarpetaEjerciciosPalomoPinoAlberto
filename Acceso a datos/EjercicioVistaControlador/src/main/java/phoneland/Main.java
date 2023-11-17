package phoneland;

import java.sql.SQLException;

import simulacro.ProductosController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL =  "jdbc:mysql://localhost/simulacro";
		String dbUser = "root";
		String dbPassword = "";
		
		try {
			ProductosController controller = new ProductosController(dbURL, dbUser, dbPassword);
			controller.mostrarProductos();
			controller.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
