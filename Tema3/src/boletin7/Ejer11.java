package boletin7;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		// String del conjunto1
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// String del conjunto2
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		// variable que recoge cadena a codificar
		String cadenaSinCodificar;
		// variable que recoge la cadena a codificada
		String cadenaCodificada = "";
		// Variable que recoge cada caracter de la cadena
		char caracter;

		// Creamos Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario la cadena y la almacenamos en la variable
		System.out.println("Introduzca una cadena: ");
		cadenaSinCodificar = reader.next().toLowerCase();

		// Bucle que recorre cada caracter de la cadena
		for (int i = 0; i < cadenaSinCodificar.length(); i++) {
			// Almacena en caracter el caracter de la posición i
			caracter = cadenaSinCodificar.charAt(i);
			// Añade a cadenaCodificada el caracter ya codificado
			cadenaCodificada += codifica(conjunto1, conjunto2, caracter);
		}

		// Muestra la cadena codificada
		System.out.println(cadenaCodificada);

		// Cerramos Scanner
		reader.close();
	}

	// Funcion que devuelve un caracter codificado
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		// Variable que recoge al caracter codificado
		char codificado = ' ';
		// Variable booleano para cuando el caracter es encontrado en el conjunto
		boolean encontrado = false;
		// Variable que recoge el indice
		int index = 0;

		// Mientras no encuentre un caracter en la cadena o no se recorra el array se
		// repite
		while (!encontrado && index < conjunto2.length) {
			// Si en una posicion del conjunto1 se encuentra el caracter le asignamos a
			// codificado la correspondencia en la cadena2 y salimos del bucle
			if (conjunto2[index] == c) {
				codificado = conjunto1[index];
				encontrado = true;
			// Si no se asigna el valor de la variable sin codificar
			} else {
				codificado = c;
			}
			// Aumentamos el indice
			index++;
		}

		return codificado;
	}
}
