package ficheros;

import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) {

        String ruta = ".\\src/main/java/ficheros/";
        String nombreFichero = "fichero.txt";

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
                    System.out.println("NO");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}