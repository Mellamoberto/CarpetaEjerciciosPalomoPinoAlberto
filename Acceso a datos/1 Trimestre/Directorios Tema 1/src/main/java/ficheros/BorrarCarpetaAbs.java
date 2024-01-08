package ficheros;

import java.io.*;
import org.apache.commons.io.FileUtils;

public class BorrarCarpetaAbs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File carpeta = new File(".\\src/main/java\\ficheros\\ejercicio1\\");

		if (carpeta.exists() && carpeta.isDirectory()) {
			System.out.println("El directorio existe");
			FileUtils.deleteDirectory(carpeta);
			System.out.println("El directorio ha sido borrado");
		} else {
			System.out.println("El directorio no existe");
		}
	}
}
