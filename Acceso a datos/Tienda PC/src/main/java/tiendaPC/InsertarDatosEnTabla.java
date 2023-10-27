package tiendaPC;

import java.sql.*;

public class InsertarDatosEnTabla {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		String sql = "INSERT INTO productos (id, nombreProduct, fabricante) " +
				"VALUES (1, 'Portatil', 'HP'), (2, 'Tablet', 'Lenovo')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tiendaPC", "root", "");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Datos insertados en la tabla productos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
