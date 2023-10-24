package conectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


		public class CrearTabla {
			public static void main(String[] args) throws Exception {
				// TODO Esbozo de m�todo generado autom�ticamente
				Connection conn = null;
				Statement stmt = null;  	
				String sql="CREATE TABLE Videojuegos (id INT PRIMARY KEY,"
						+ "nombre VARCHAR(60) NOT NULL, "
						+ "genero VARCHAR(40))";   	 
				try {
				  conn = DriverManager.getConnection(
		             "jdbc:mysql://localhost/Nintendo","root","admin");
				  stmt = conn.createStatement();
				  stmt.execute(sql);
				  System.out.println("Creada la tabla Videojuegos");
				  conn.close();
				  stmt.close();
				} catch (SQLException e) {
					// TODO Bloque catch generado autom�ticamente
					e.printStackTrace();
				}
			}
	}
