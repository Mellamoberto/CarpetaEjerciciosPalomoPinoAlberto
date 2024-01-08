package simulacro;

import java.sql.*;

public class CrearTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		Statement stmt=null;
		
		String sql = "CREATE TABLE productos (id INT primary key,"
				+ "nombre VARCHAR(20) NOT NULL,"
				+ "descripcion VARCHAR(100) NOT NULL,"
				+ "fabricante VARCHAR(30),"
				+ "precio INT,"
				+ "numeroSerie VARCHAR(10))";
		
		try {
			conn=DriverManager.getConnection(
					"jdbc:mysql://localhost/simulacro","root","");
			stmt=conn.createStatement();
			stmt.execute(sql);
				System.out.println("Creada la tabla productos");
				conn.close();
				stmt.close();
			
		}
		catch (SQLException e)
		{ e.printStackTrace();	
			}
	}

}
