package phoneland;

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
			int id_producto = rs.getInt("id_producto");
			int id_proveedor = rs.getInt("id_proveedor");
			String nombre = rs.getString("nombre");
			String fabricante = rs.getString("fabricante");
			float precio = rs.getFloat("precio");
			String descripcion = rs.getString("descripcion");
			productos.add(new Productos(id_producto,id_proveedor,nombre,fabricante,precio,descripcion));
			}
		stmt.close();
		rs.close();
		return productos;
		}
	public void close() throws SQLException {
		conn.close();
	}
}
