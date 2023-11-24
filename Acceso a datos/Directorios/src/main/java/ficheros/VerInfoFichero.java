package ficheros;

import java.io.*;

public class VerInfoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INFORMACION SOBRE EL DIRECTORIO");
		File direc = new File(".\\src/main/java\\ficheros\\VerInfoFichero.java");

		if (direc.exists()) {
			System.out.println("Nombre del directorio: " + direc.getName());
			System.out.println("Ruta: " + direc.getPath());
			System.out.println("Ruta absoluta: " + direc.getAbsolutePath());
			System.out.println("Lectura: " + direc.canRead());
			System.out.println("Escritura: " + direc.canWrite());
			System.out.println("Tamanho: " + direc.length() + " Kb");
			System.out.println("Directorio: " + direc.isDirectory());
			System.out.println("Fichero: " + direc.isFile());
			System.out.println("Nombre del directorio padre: " + direc.getParent());
		}
	}
}