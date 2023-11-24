package ficheros;

import java.io.File;

public class CrearDirectorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta = ".\\src/main/java\\ficheros\\";
		String carpeta = "ejercicio1";
		File directorio = new File(ruta + carpeta);
		if (directorio.exists() == true) {
			System.out.println("la carpeta existe");
		} else {
			directorio.mkdir();
			System.out.println("carpeta creada");
		}
	}
}
