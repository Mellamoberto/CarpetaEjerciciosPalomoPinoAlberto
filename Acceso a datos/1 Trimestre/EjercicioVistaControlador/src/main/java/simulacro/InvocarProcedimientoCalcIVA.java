package simulacro;

import java.sql.*;

public class InvocarProcedimientoCalcIVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		CallableStatement cstmt = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/simulacro", "root", "");

			cstmt = conn.prepareCall("call CalculaIVA()");

			cstmt.execute();

			ResultSet rs = cstmt.getResultSet();
			
			while (rs.next()) {
				String nombre = rs.getString("nombre");
				int precio = rs.getInt("precio");
				float iva = rs.getFloat("iva");
				float total = rs.getFloat("total");
				float descuento = rs.getFloat("descuento");
				float precioConDescuento = rs.getFloat("precioConDescuento");
				System.out.println("nombre: " + nombre
						+ ", precio: " + precio
						+ ", iva: "+ iva
						+ ", total: "+ total
						+ ", descuento: "+ descuento
						+ ", precioConDescuento: "+precioConDescuento);
			}
			
			System.out.println();
			
			System.out.println("Procedimiento invocado");

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
