package ficherotexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ficheroTexto02Array {
	public static void main(String[] args) {
		String ruta = "c:\\prueba1\\";
		String nombreArchivo = "ciudades.txt";
		String[] contenido = { "Malaga", "Cadiz", "Huelva", "Sevilla", "Cordoba", "Jaen", "Almeria", "Granada" };

		try (BufferedWriter fw = new BufferedWriter(new FileWriter(ruta + nombreArchivo))) {
			System.out.println("Archivo ciudades.txt creado correctamente.");

			for (String content : contenido) {
				fw.write(content + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error");
		}
	}
}