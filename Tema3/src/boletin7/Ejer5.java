package boletin7;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		//Variable para almacenar las palabras
		String palabra;
		// Variable para almacenar la frase
		String frase = "";
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca una palabra y lo guardamos en la variable
		System.out.println("Introduzca una palabra: ");
		palabra = reader.next();
		
		while(!palabra.equalsIgnoreCase("fin")) {
			// Añadimos la palabra y un espacio a la frase
			frase += (palabra + " ");
			
			// Volvemos a pedir una palabra
			System.out.println("Introduzca una palabra: ");
			palabra = reader.next();
		}
		// Mostramos la frase
		System.out.println(frase);
		
		
		// Cerramos el Scanner
		reader.close();
	}
}
