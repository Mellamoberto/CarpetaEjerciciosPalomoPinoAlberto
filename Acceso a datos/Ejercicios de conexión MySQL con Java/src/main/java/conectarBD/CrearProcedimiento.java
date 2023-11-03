package conectarBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class CrearProcedimiento {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement presta = null;
		String dropProcedure = "DROP PROCEDURE IF EXISTS ObtenerClientes";
		String createProcedure = "CREATE PROCEDURE ObtenerClientes() " + "BEGIN " + "SELECT * FROM clientes;" + "END;";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");

			presta = conn.prepareStatement(dropProcedure);
			presta.executeUpdate();

			presta = conn.prepareStatement(createProcedure);
			presta.executeUpdate();

			System.out.println("Procedimiento creado");

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
