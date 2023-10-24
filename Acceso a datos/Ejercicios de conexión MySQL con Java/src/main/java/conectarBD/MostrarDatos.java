package conectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatos {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String sql = "SELECT * FROM Videojuegos";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/Nintendo", "root", "admin");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String genero = rs.getString("genero");
				System.out.println("id: " + id + "\nNombre: " + nombre + "\nGenero: " + genero);
			}
			rs.close();
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}