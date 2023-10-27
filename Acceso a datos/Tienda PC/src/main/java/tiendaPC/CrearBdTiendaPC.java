package tiendaPC;

import java.sql.*;

public class CrearBdTiendaPC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		String sql="CREATE DATABASE tiendaPC";
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la BD tiendaPC");
			
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
