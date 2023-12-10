package conectarBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class InvocarProcedimientoCalcularEdad {

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");

            cstmt = conn.prepareCall("{call CalculaEdad(?, ?)}");
            cstmt.setInt(1, 1977); 
            cstmt.registerOutParameter(2, Types.INTEGER); 

            cstmt.execute();

            int edad = cstmt.getInt(2);

            System.out.println("Procedimiento invocado");
            System.out.println("La edad es: " + edad);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cstmt != null) {
                    cstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
