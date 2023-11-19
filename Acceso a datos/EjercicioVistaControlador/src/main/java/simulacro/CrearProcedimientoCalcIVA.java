package simulacro;

import java.sql.*;

public class CrearProcedimientoCalcIVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement presta = null;
		
		try {
		String dropProcedure = "DROP PROCEDURE IF EXISTS CalculaIVA";
		String createProcedure = "CREATE PROCEDURE CalculaIVA() " 
				+ "BEGIN "
				+ "SELECT nombre, precio, precio * 0.21 AS iva, precio * 1.21 AS total, precio * 0.10 AS descuento, precio * 1.10 AS precioConDescuento FROM productos; " 
				+ "END";
		
		
			conn = DriverManager.getConnection("jdbc:mysql://localhost/simulacro", "root", "");

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
