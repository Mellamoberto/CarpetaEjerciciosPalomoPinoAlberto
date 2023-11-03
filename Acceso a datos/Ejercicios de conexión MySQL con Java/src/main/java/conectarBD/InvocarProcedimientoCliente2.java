package conectarBD;

import java.sql.*;

public class InvocarProcedimientoCliente2 {
	
	public static void main(String[] args) {

	Connection conn = null;
    CallableStatement cstmt = null;

    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");

        cstmt = conn.prepareCall("call ObtenerCliente2()");
        
        ResultSet resultSet = cstmt.executeQuery();
        
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nombre = resultSet.getString("nombre");
            String edad = resultSet.getString("edad");

            System.out.println("Cliente 2:");
            System.out.println("id: " + id);
            System.out.println("nombre: " + nombre);
            System.out.println("edad: " + edad);
        }

        System.out.println("Procedimiento Invocado");

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

	}

}
