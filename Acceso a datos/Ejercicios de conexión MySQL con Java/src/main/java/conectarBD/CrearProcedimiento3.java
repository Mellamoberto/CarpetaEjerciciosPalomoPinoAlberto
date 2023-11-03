package conectarBD;

import java.sql.*;

public class CrearProcedimiento3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement presta = null;
		String dropProcedure = "DROP PROCEDURE IF EXISTS ObtenerMayores25";
		String createProcedure = "CREATE PROCEDURE ObtenerMayores25() " + "BEGIN " + "SELECT * FROM clientes WHERE edad>25;" + "END;";
		
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
