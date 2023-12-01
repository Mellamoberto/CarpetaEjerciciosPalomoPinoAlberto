package ficherotexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class leerFichero02 {

	public static class LeerFichero02 {

		public static void leerFichero(String[] archivos) {
			try {
				for (String arch : archivos) {
					File archivo = new File("c:/prueba1/" + arch);
					System.out.println();
					FileReader fr = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fr);
					String linea;
					while ((linea = br.readLine()) != null) {
						System.out.println(linea);
					}
					br.close();
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Error al leer el archivo");
			}
		}

		public static void main(String[] args) {
			String[] archivos = { "Cordoba.txt", "Malaga.txt", "Granada.txt", "Productos.txt",
					"Ciudades de Andalucia.txt" };

			leerFichero(archivos);
		}
	}
}