package ficheros;

import java.io.File;

public class BorrarFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta = ".\\src/main/java\\ficheros\\";
		String nombreFichero="fichero.txt";
		
		String rutaFichero = ruta + File.separator + nombreFichero;
		
		File fichero = new File(rutaFichero);
		
		if(fichero.exists()) {
			boolean borrado = fichero.delete();	
			if (borrado) {
				System.out.println("El fichero se borro");
			}else {
			System.out.println("No se pudo borrar el fichero");
			}
		} else {
			System.out.println("El fichero no existe en esa ubicacion");
		}
	}
}
