package conectarBD;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class CrearBD {
		public static void main(String[] args) throws SQLException {
			// TODO Esbozo de m�todo generado autom�ticamente
			Connection conn = null;
			Statement stmt = null;  	
			String sql="CREATE DATABASE Nintendo;";  	 

			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","admin");
				stmt = conn.createStatement();
				stmt.execute(sql);
				System.out.println("Creada la base de datos Nintendo");
					
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Bloque catch generado autom�ticamente
				e.printStackTrace();
			}
		}
	}