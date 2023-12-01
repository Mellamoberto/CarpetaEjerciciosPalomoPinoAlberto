package ficherotexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class leerFichero01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File archivo = new File("c:/prueba1/Ciudades de Andalucia.txt");
			if (!archivo.exists()) {
				System.out.println("El archivo Ciudades de Andalucia.txt no existe");
				return;
			}
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
