package tiendaPC;

import java.sql.*;

public class Informacion {
	
	static String Login = "root";
	static String password = "";
	String tabla = "productos";
	static String url = "jdbc:mysql://localhost/tiendaPC";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, Login, password);
			if (conn != null) {
				System.out.println("Conexion a BBDD "+ url + " ... Ok");
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("Version del driver JDBC " + meta.getDriverVersion());
				System.out.println("Nombre " + meta.getDatabaseProductName());
				System.out.println("Version " + meta.getDatabaseMajorVersion());
				ResultSet columnas = meta.getColumns("tiendaPC", null, "productos", null);
				System.out.println("consulta realizada");
				System.out.println("BBDD tiendaPC");
				System.out.println("Columna   Tipo    Tamanho");
				System.out.println(".............................");
				while (columnas.next()) {
					String nombrecol = columnas.getString("COLUMN_NAME");
					String tipo = columnas.getString("TYPE_NAME");
					String tamcol = columnas.getString("COLUMN_SIZE");
					System.out.println(nombrecol + " " + tipo + " " + tamcol);
				}
				conn.close();
			}
			
		}catch(SQLException e) {
			System.out.println("Error" + e.getMessage());
		}
	}

}
