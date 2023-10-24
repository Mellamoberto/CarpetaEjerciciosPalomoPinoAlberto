package conectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;  	
		String sql = "INSERT INTO Videojuegos (id, nombre, genero) " +
	             "VALUES (1, 'Super Mario Wonder', 'Plataformas')";
	try {
	  conn = DriverManager.getConnection(
	         "jdbc:mysql://localhost/Nintendo","root","admin");
	  stmt = conn.createStatement();
	  stmt.executeUpdate(sql);
	  System.out.println("Datos insertados en la tabla clientes");
	  conn.close();
	  stmt.close();
	} catch (SQLException e) {
	  e.printStackTrace();
	}
	}
}
