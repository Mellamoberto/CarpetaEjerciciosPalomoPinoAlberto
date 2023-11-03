package conectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrearProcedimiento4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement presta = null;
		String dropProcedure = "DROP PROCEDURE IF EXISTS ObtenerAlberto";
		String createProcedure = "CREATE PROCEDURE ObtenerAlberto() " + "BEGIN " + "SELECT * FROM clientes WHERE nombre='Alberto';" + "END;";
		
		try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
		
		presta = conn.prepareStatement(dropProcedure);
		presta.executeUpdate();
		
		presta = conn.prepareStatement(createProcedure);
		presta.executeUpdate();
		
		System.out.println("Procedimiento creado");
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
