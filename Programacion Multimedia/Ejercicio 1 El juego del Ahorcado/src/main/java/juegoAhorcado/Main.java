package juegoAhorcado;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc = new Scanner(System.in);
	        String[] palabras = {"berto","jardin","silla","aleatorio","billete","hielo",
	        		"cemento","equipo","pato","patata"};
	        int intentosMax = 6;
	        int intentos = 0;
	       
	        
	        Random randomizar = new Random();
	        String palabra = palabras[randomizar.nextInt(palabras.length)];
	        
	        
	        char[] palabraAdivinada = new char[palabra.length()];
	        for (int i = 0; i < palabraAdivinada.length; i++) {
	            palabraAdivinada[i] = '_';
	        }
	        
	        HashSet<Character> letrasAdivinadas = new HashSet<>();

	        System.out.println("Empieza el juego");
	        while (intentos < intentosMax) {
	            System.out.print("\nLa palabra es: ");
	            for (int i = 0; i < palabraAdivinada.length; i++) {
	            	char letra = palabraAdivinada[i];
	                System.out.print(letra);
	                if (i < palabraAdivinada.length - 1) {
	                	System.out.print(' ');
	                }
	            }
	            System.out.print("\nDi una letra: ");
	            char letra = sc.next().toLowerCase().charAt(0);
	            
	            
	            if(letrasAdivinadas.contains(letra)) {
	            	System.out.println("Letra repetida, prueba otra.");
	            	continue;
	            }   
	            letrasAdivinadas.add(letra);
	            

	            boolean acierto = false;
	            for (int i = 0; i < palabra.length(); i++) {
	                if (Character.toLowerCase(palabra.charAt(i)) == letra && palabraAdivinada[i] == '_') {
	                    palabraAdivinada[i] = palabra.charAt(i);
	                    acierto = true;
	                }
	            }
	            

	            if (!acierto) {
	                intentos++;
	                System.out.println("Mal. Te quedan " + (intentosMax - intentos) + " intentos.");
	            } else {
	                System.out.println("Bien");
	            }

	            if (String.valueOf(palabraAdivinada).equalsIgnoreCase(palabra)) {
	                System.out.println("Has adivinado la palabra: " + palabra);
	                break;
	            }
	        }

	        if (intentos == intentosMax) {
	            System.out.println("\nPerdiste. La palabra era: " + palabra);
	        }

	        sc.close();
	    }
}
