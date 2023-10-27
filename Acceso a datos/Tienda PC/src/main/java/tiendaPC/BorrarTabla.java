package tiendaPC;

import java.sql.*;

public class BorrarTabla {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		String sql = "DROP TABLE productos";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tiendaPC","root","");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Borrada la tabla productos");
			conn.close();
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
