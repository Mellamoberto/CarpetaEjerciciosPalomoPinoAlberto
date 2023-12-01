package ficherotexto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ficheroTexto00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "c:\\prueba1\\";
		File fichero = new File(ruta);
		
		if(fichero.mkdir()) {
			System.out.println("Carpeta creada");
		} else {
			System.err.println("No se pudo crear");
			if (fichero.exists()) {
			System.err.println("La carpeta ya existe");
			}
		}
	}
}
	
		


