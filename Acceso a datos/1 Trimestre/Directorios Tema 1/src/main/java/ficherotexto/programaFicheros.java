package ficherotexto;

import java.util.Scanner;
import java.io.*;
import org.apache.commons.io.FileUtils;

public class programaFicheros {
	
	public static void leerFichero(String[] archivos) {
		try {
			for (String arch : archivos) {
				File archivo = new File("c:/hola/" + arch);
			
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				String linea;
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
				System.out.println();
				br.close();
				fr.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error al leer el archivo");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		File directorio = new File("");
		
		String ruta = "C:\\";

        System.out.println("Bienvenido.");

        short eleccion = 0;
        
        while(eleccion != 8) {
        	
        	System.out.println("Dime: ¿qué quieres hacer? (Elige el numero correspondiente)"
                    + "\n\t 1 - Crear directorio/carpeta."
                    + "\n\t 2 - Borrar directorio/carpeta."
                    + "\n\t 3 - Crear archivo."
                    + "\n\t 4 - Borrar archivo."
                    + "\n\t 5 - Escribir archivo."
                    + "\n\t 6 - Leer archivo."
                    + "\n\t 7 - Leer varios archivos"
                    + "\n\t 8 - Salir del programa");
			eleccion = Short.parseShort(sc.nextLine());
			switch (eleccion) {

			case 1:
				System.out.println();
				System.out.println("Seleccionaste Crear directorio/carpeta.");
				
		
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
				
				System.out.print("Dime primero el nombre del directorio"
						+ " donde quieres crear el archivo: ");
				carpeta = sc.nextLine();
				directorio = new File(ruta+carpeta);

				if (directorio.exists()) {
					System.out.print("Dime el nombre que le quieres poner al fichero: ");
					String nombreFichero = sc.nextLine();
					String rutaFichero = directorio + File.separator + nombreFichero;

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
				
				System.out.print("Dime primero el nombre del directorio"
						+ " donde quieres borrar el archivo: ");
				carpeta = sc.nextLine();
				directorio = new File(ruta+carpeta);
				
				if (directorio.exists()) {
					System.out.print("Dime el nombre del fichero que quieres borrar: ");
					String nombreFichero = sc.nextLine();
					String rutaFichero = directorio + File.separator + nombreFichero;

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
					System.out.println("");
					break;
				}
				System.out.println();
			case 5:
				System.out.print("Dime primero el nombre del directorio" 
						+ " donde esta el archivo: ");
				carpeta = sc.nextLine();
				directorio = new File(ruta + carpeta);

				if (directorio.exists()) {
					System.out.print("Dime el nombre del fichero que quieres escribir: ");
					String nombreFichero = sc.nextLine();
					String rutaFichero = directorio + File.separator + nombreFichero;

					File fichero = new File(rutaFichero);

					if (fichero.exists()) {
						System.out.println("Cuantas lineas vas a escribir?");
						short lineas = Short.parseShort(sc.nextLine());
						System.out.println("Quieres escribir "+lineas+" dentro del archivo.");
						
						try (BufferedWriter fw = new BufferedWriter(new FileWriter(rutaFichero))) {
						for (short i = 0; i < lineas; i++) {
							System.out.println("Contenido de la linea "+(i+1)+": ");
						    String contenido = sc.nextLine();
						        fw.write(contenido);
						        fw.newLine(); 
							}
						System.out.println("Archivo bien escrito");
						} catch (IOException e) {
							e.printStackTrace(); 
							System.err.println("Error al escribir sobre el archivo.");
						    }
						} else {
							System.out.println("Fichero no existe o no encontrado");
						}
/*
						System.out.println("Que quieres escribir dentro del fichero " + nombreFichero + "?");
						String contenido = sc.nextLine();
						try (BufferedWriter fw = new BufferedWriter(new FileWriter(rutaFichero))) {
							System.out.println("Archivo " + nombreFichero + " escrito correctamente.");
							fw.write(contenido);
						} catch (IOException e) {
							e.printStackTrace();
							System.err.println("Error al escribir en el archivo " + ruta + nombreFichero);
						}
					}
				} else {
					System.out.println("Primero debes crear un directorio antes de crear un archivo.");
				}
*/
					} else {
						System.out.println("Directorio no encontrado");
					}
				System.out.println();
				break;
			case 6:
				System.out.println();
				System.out.println("Seleccionaste Leer archivo.");
				
				System.out.print("Dime primero el nombre del directorio" 
						+ " donde esta el archivo: ");
				carpeta = sc.nextLine();
				
				directorio = new File(ruta + carpeta);
				
				if (directorio.exists()) {
				System.out.println("Dime el fichero del que quieres leer el contenido: ");
				String nombreFichero = sc.nextLine();
				String rutaFichero = directorio + File.separator + nombreFichero;
				File fichero = new File(rutaFichero);

				if (fichero.exists()) {
					try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
						String linea;
						while ((linea = br.readLine()) != null) {
							System.out.println(linea);
						}
					} catch (IOException e) {
						System.err.println("No se puede leer el fichero " + nombreFichero);
					}
				} else {
					System.out.println("El fichero " + nombreFichero + " no existe o no se ha encontrado.");
				}

			} else {
				System.out.println("Directorio no encontrado.");
			}
			System.out.println();
			break;
			case 7:
				String[] archivos = { "holita.txt", "alberto.txt"};

				leerFichero(archivos);
			break;
			case 8:
				System.out.println("Saliendo del programa.");
				break;
			default:
				System.out.println("Opción no válida. Por favor, elige un número del 1 al 7.");
			}
		}
		sc.close();
	}
}