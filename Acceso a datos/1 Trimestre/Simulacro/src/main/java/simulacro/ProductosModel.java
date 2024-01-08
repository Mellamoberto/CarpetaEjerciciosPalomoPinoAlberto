package simulacro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductosModel {
	private Connection conn;
	
	public ProductosModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}
	
	public List<Productos>getAllProductos() throws SQLException {
		List<Productos> productos = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM productos");
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String descripcion = rs.getString("descripcion");
			String fabricante = rs.getString("fabricante");
			int precio = rs.getInt("precio");
			String numeroSerie = rs.getString("numeroSerie");
			productos.add(new Productos(id,nombre,descripcion,fabricante,precio,numeroSerie));
		}
		
		stmt.close();
		rs.close();
		return productos;
	}
	
	public void close() throws SQLException {
		conn.close();
	}

}
