package simulacro;

import java.sql.*;

import java.sql.CallableStatement;

public class InvocarProcedimiento2 {

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/simulacro", "root", "");

            cstmt = conn.prepareCall("call CalculaDescuentoIvaTotal(?,?,?,?)");
            cstmt.setDouble(1, 100.0);
            cstmt.registerOutParameter(2, Types.DECIMAL);
            cstmt.registerOutParameter(3, Types.DECIMAL);
            cstmt.registerOutParameter(4, Types.DECIMAL);

            cstmt.execute();

            double descuento = cstmt.getDouble(2);
            double iva = cstmt.getDouble(3);
            double total = cstmt.getDouble(4);

            System.out.println("Procedimiento invocado");
            System.out.println("Descuento: " + descuento);
            System.out.println("IVA: " + iva);
            System.out.println("Total: " + total);

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