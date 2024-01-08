package ficherotexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ficheroTexto01 {
	public static void main(String[] args) {
        String ruta = "c:\\prueba1\\";
        String nombreArchivo = "Malaga.txt";
        String contenido = "Malaga es lo mejor del mundo";

        try (BufferedWriter fw = new BufferedWriter(new FileWriter(ruta + nombreArchivo))) {
            System.out.println("Archivo Malaga.txt creado correctamente.");
            fw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error");
        }
    }
}