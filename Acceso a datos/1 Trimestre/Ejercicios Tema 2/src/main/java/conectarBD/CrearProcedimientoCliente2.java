package conectarBD;

import java.sql.*;

public class CrearProcedimientoCliente2 {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement presta = null;
		String dropProcedure = "DROP PROCEDURE IF EXISTS ObtenerCliente2";
		String createProcedure="CREATE PROCEDURE ObtenerCliente2() " +
		"BEGIN " +
		"SELECT * FROM clientes WHERE id = 2;" + 
		"END;";
		
		try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
		
		presta = conn.prepareStatement(dropProcedure);
		presta.executeUpdate();
		
		presta = conn.prepareStatement(createProcedure);
		presta.executeUpdate();
		
		System.out.println("Procedimiento ObtenerCliente2 creado");
		
		conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
