package conectarBD;

import java.sql.*;

public class InvocarProcedimiento2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		CallableStatement cstmt = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");

			cstmt = conn.prepareCall("call CalculaEdad1(?,?)");
			cstmt.setInt(1, 1977);
			cstmt.registerOutParameter(2, Types.INTEGER);

			cstmt.execute();

			int edad = cstmt.getInt(2);

			System.out.println("Procedimiento invocado");
			System.out.println("la edad es " + edad);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
