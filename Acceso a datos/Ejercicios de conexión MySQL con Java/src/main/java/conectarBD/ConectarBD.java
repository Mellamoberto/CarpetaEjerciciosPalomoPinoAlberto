package conectarBD;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConectarBD {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

        Connection conect = null;
        try {
            conect = DriverManager.getConnection("jdbc:mysql://localhost/Nintendo", "root", "admin");
            if (conect != null) {
                System.out.println("Conexion a base de datos ok");
                conect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
