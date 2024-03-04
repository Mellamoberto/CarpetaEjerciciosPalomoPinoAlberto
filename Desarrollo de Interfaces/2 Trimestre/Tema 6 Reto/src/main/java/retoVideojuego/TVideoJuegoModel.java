package retoVideojuego;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Ejercicio2.TVideoJuego;

public class TVideoJuegoModel {
	private Connection conn;

	public TVideoJuegoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}
	 public void borrarRegistro(String nombreJuego) throws SQLException {
	        // Sentencia SQL para eliminar el registro con el nombre especificado
	        String sql = "DELETE FROM tvideojuegos WHERE nombre = ?";

	        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
	            // Establece el valor del parámetro en la sentencia preparada
	            preparedStatement.setString(1, nombreJuego);

	            // Ejecuta la sentencia SQL para eliminar el registro
	            int filasAfectadas = preparedStatement.executeUpdate();

	            if (filasAfectadas > 0) {
	                System.out.println("Registro eliminado correctamente.");
	            } else {
	                System.out.println("No se encontró el registro con el nombre especificado.");
	            }
	        }
	    }
	
	
	
	
	public void addVideoJuego(TVideoJuego nuevoJuego) throws SQLException {
	    String query = "INSERT INTO tvideojuegos (nombre, anio, compania, precio, sinopsis, plataforma) VALUES (?, ?, ?, ?, ?, ?)";

	    try (PreparedStatement stmt = conn.prepareStatement(query)) {
	        stmt.setString(1, nuevoJuego.getNombre());
	        stmt.setInt(2, nuevoJuego.getAnio());
	        stmt.setString(3, nuevoJuego.getCompania());
	        stmt.setDouble(4, nuevoJuego.getPrecio());
	        stmt.setString(5, nuevoJuego.getSinopsis());
	        stmt.setString(6, nuevoJuego.getPlataforma());

	        stmt.executeUpdate();
	    }
	}
	
	
	public List<TVideoJuego> getAllVideoJuegos() throws SQLException {
		List<TVideoJuego> videojuegos = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tvideojuegos");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int idjuego = rs.getInt("idjuego");
			String nombre = rs.getString("nombre");
			int anio = rs.getInt("anio");
			String compania = rs.getString("compania");
			double precio = rs.getDouble("precio");
			String sinopsis = rs.getString("sinopsis");
			String plataforma = rs.getString("plataforma");
			videojuegos.add(new TVideoJuego(idjuego, nombre, anio, compania, precio, sinopsis, plataforma));
		}
		stmt.close();
		rs.close();
		return videojuegos;
	}
	
	public void updateVideoJuego(String nombreJuego, TVideoJuego juegoActualizado) throws SQLException {
	    String query = "UPDATE tvideojuegos SET nombre = ?, anio = ?, compania = ?, precio = ?, sinopsis = ?, plataforma = ? WHERE nombre = ?";

	    try (PreparedStatement stmt = conn.prepareStatement(query)) {
	        stmt.setString(1, juegoActualizado.getNombre());
	        stmt.setInt(2, juegoActualizado.getAnio());
	        stmt.setString(3, juegoActualizado.getCompania());
	        stmt.setDouble(4, juegoActualizado.getPrecio());
	        stmt.setString(5, juegoActualizado.getSinopsis());
	        stmt.setString(6, juegoActualizado.getPlataforma());
	        stmt.setString(7, nombreJuego);

	        stmt.executeUpdate();
	    }
	}
	
	public void close() throws SQLException {
		conn.close();
	}

}
