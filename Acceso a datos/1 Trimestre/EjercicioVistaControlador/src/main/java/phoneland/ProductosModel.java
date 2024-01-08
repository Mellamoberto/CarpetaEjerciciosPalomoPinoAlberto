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
			int id_producto = rs.getInt("ID_Producto");
			int id_proveedor = rs.getInt("ID_Proveedor");
			String nombre = rs.getString("Nombre");
			String fabricante = rs.getString("Fabricante");
			String precio = rs.getString("Precio");
			String pvp = rs.getString("PVP");
			String descripcion = rs.getString("Descripcion");
			String columna8 = rs.getString("Columna 8");
			productos.add(new Productos(id_producto,id_proveedor,nombre,fabricante,precio,pvp,descripcion,columna8));
			}
		stmt.close();
		rs.close();
		return productos;
		}
	public void close() throws SQLException {
		conn.close();
	}
}
