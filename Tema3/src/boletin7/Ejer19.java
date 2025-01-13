package boletin7;

import java.util.Scanner;

public class Ejer19 {
	public static void main(String[] args) {
		// Variable que recoge la frase que pasaremos a camel
		String frase;
		// Variable para la frase convertida en Camel
		String fraseCamel;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario que introduzca una frase y la guardamos en la variable
		System.out.println("Introduzca una frase: ");
		frase = reader.nextLine().toLowerCase();

		// La convertimos
		fraseCamel = convierteCamel(frase);

		// Mostramos la frase
		System.out.println(fraseCamel);

		// Cerramos el Scanner
		reader.close();
	}

	// Funcion que convierte una frase a Camel
	public static String convierteCamel(String frase) {
		// Array que almacena las palabras de la frase
		String[] palabras;

		// Almacenamos la frase en el array separando las palabras por espacios
		palabras = frase.split(" ");

		// For que recorre cada palabra
		for (int i = 0; i < palabras.length; i++) {
			// Si no es la primera posicion pasamos a mayusculas el primer caracter
			if (i != 0) {
				palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
			}
		}

		// Devolvemos el String en camel uniendo las palabras del array
		return String.join("", palabras);
	}
}
