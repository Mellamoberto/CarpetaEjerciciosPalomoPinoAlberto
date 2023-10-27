package tiendaPC;

import java.sql.*;

public class MostrarDatosTabla {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		String sql = "SELECT * FROM productos";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tiendaPC","root","");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombreProduct");
				String fabricante = rs.getString("fabricante");
				System.out.println("id: " + id +
						", nombreProduct: " + nombre +
						", fabricante: " + fabricante);
			}
			rs.close();
			conn.close();
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
