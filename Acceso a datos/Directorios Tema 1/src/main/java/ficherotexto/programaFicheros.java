package ficherotexto;

import java.util.Scanner;
import java.io.*;
import org.apache.commons.io.FileUtils;

public class programaFicheros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		File directorio = new File("");

        System.out.println("Bienvenido.");

        short eleccion = 0;
        
        while(eleccion != 7) {
        	
        	System.out.println("Dime: ¿qué quieres hacer? (Elige el numero correspondiente)"
                    + "\n\t 1 - Crear directorio/carpeta."
                    + "\n\t 2 - Borrar directorio/carpeta."
                    + "\n\t 3 - Crear archivo."
                    + "\n\t 4 - Borrar archivo."
                    + "\n\t 5 - Escribir archivo."
                    + "\n\t 6 - Leer archivo."
                    + "\n\t 7 - Salir del programa");
			eleccion = Short.parseShort(sc.nextLine());
			switch (eleccion) {

			case 1:
				System.out.println();
				System.out.println("Seleccionaste Crear directorio/carpeta.");
				String ruta = "c:/";
				System.out.print("Dime el nombre de la carpeta que quieres crear: ");
				String carpeta = sc.nextLine();
				directorio = new File(ruta + carpeta);
				if (directorio.exists() == true) {
					System.out.println("La carpeta existe");
				} else {
					directorio.mkdir();
					System.out.println("Carpeta creada");
				}
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.println("Seleccionaste Borrar directorio/carpeta.");
				ruta = "c:/";
				System.out.print("Dime el nombre de la carpeta que quieres borrar: ");
				carpeta = sc.nextLine();
				directorio = new File(ruta + carpeta);
				if (directorio.exists() && directorio.isDirectory()) {
					System.out.println("El directorio existe");
					FileUtils.deleteDirectory(directorio);
					System.out.println("El directorio ha sido borrado");
				} else {
					System.out.println("El directorio no existe");
				}
				System.out.println();
				break;
			case 3:
				System.out.println();
				System.out.println("Seleccionaste Crear archivo.");

				if (directorio != null) {
					ruta = directorio.getPath();
					System.out.print("Dime el nombre del fichero: ");
					String nombreFichero = sc.nextLine();
					String rutaFichero = ruta + File.separator + nombreFichero;

					File fichero = new File(rutaFichero);

					if (fichero.exists()) {
						System.out.println("El fichero ya existe");
					} else {
						try {
							boolean creado = fichero.createNewFile();
							if (creado) {
								System.out.println("El fichero ha sido creado");
							} else {
								System.out.println("No se ha podido crear el fichero");
							}
						} catch (IOException e) {
							System.err.println("No se encontro la ruta especificada");
						}
					}
				} else {
					System.out.println("Primero debes crear un directorio antes de crear un archivo.");
				}
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("Seleccionaste Borrar archivo.");
				if (directorio != null) {
					ruta = directorio.getPath();
					System.out.print("Dime el nombre del fichero: ");
					String nombreFichero = sc.nextLine();
					String rutaFichero = ruta + File.separator + nombreFichero;

					File fichero = new File(rutaFichero);

					if (fichero.exists()) {
						boolean borrado = fichero.delete();
						if (borrado) {
							System.out.println("El fichero se borro");
						} else {
							System.out.println("No se pudo borrar el fichero");
						}
					} else {
						System.out.println("El fichero no existe en esa ubicacion");
					}
					System.out.println("Seleccionaste Borrar archivo.");
					break;
				}
				System.out.println();
			case 5:
				System.out.println("Seleccionaste Escribir archivo.");
				break;
			case 6:
				System.out.println("Seleccionaste Leer archivo.");
				break;
			case 7:
				System.out.println("Saliendo del programa.");
				break;
			default:
				System.out.println("Opción no válida. Por favor, elige un número del 1 al 7.");
			}
		}
		sc.close();
	}
}