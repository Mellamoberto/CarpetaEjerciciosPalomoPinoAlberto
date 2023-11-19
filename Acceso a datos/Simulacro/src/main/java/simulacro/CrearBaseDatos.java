package simulacro;

import java.sql.*;

public class CrearBaseDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE DATABASE simulacro";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("La base de datos simulacro se ha creado");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
