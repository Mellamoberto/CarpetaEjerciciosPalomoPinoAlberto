package tiendaPC;

import java.sql.*;

public class CrearUnaTabla {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		String sql = "CREATE TABLE productos (id INT PRIMARY KEY," 
		+ "nombreProduct VARCHAR(40) NOT NULL,"
		+ "fabricante VARCHAR(30))";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tiendaPC", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla productos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
