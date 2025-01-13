package boletin7;

import java.util.Random;
import java.util.Scanner;

public class Ejer16 {
	public static void main(String[] args) {
		// Variable que almacena la cadena a adivinar
		String original;
		// Variable que almacena el anagrama
		String anagrama;
		// Intento del jugador 2
		String intento;
		// Variable que muestra los caracteres acertados
		String coincidencias;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		do {// Pedimos al jugador 1 que introduzca la cadena a adivinar
			System.out.println("Jugador 1 introduzca la frase a adivinar: ");
			// Lo almacenamos en la variable
			original = reader.nextLine();
		} while (original.equals("")); // Vuelve a pedirla si es cadena vacia.

		// Desordenamos la frase con la funcion desordenar y lo almacenamos en la
		// variable anagrama
		anagrama = desordenarCadena(original);

		// Pedimos al jugador 2 que adivine la frase original y le mostramos el anagrama
		System.out.println("Jugador 2, Cual es la frase original?: " + anagrama);
		intento = reader.nextLine();
		
		// Si falla
		while (!intento.equals(original)) {
			
			// Muestra las coincidencias
			coincidencias = muestraCoincidencias(intento, original);
			System.out.println("Coincidencias: " + coincidencias);
			
			// Imprime que falla
			System.out.println("Fallaste");
			
			// Juega de nuevo
			System.out.println("Jugador 2, Cual es la frase original?: " + anagrama);
			intento = reader.nextLine();
		}

		// Mostramos al jugador que gano
		System.out.println("Ganaste!!");

		// Cerramos el Scanner
		reader.close();
	}

	// Creamos la funcion que desordena el anagrama
	public static String desordenarCadena(String cadena) {
		// Array que almacena la cadena desordenada
		char[] anagrama;
		// Variable que almacena el caracter auxiliar
		char aux;
		// Array que almacena la cadena sin desordenar
		// Variable para almacenar una posicion aleatoria
		int posRand;

		// Creamos el random
		Random rand = new Random();

		// Pasamos la cadena a array
		anagrama = cadena.toCharArray();

		// Recorremos el array
		for (int i = 0; i < anagrama.length; i++) {
			posRand = rand.nextInt(0, anagrama.length);
			// Guardamos el caracter auxiliar
			aux = anagrama[i];
			// Intercambiamos el caracter original por otro de una posicion aleatoria
			anagrama[i] = anagrama[posRand];
			// A la posicion le asignamos el caracter auxiliar
			anagrama[posRand] = aux;
		}

		// Devolvemos el anagrama
		return String.valueOf(anagrama);
	}

	// Funcion que muestra los caracteres que coinciden entre dos cadenas
	public static String muestraCoincidencias(String intento, String original) {
		// Cadena que muestra las coincidencias
		String coincidencias = "";
		
		// Recorremos el intento y vemos cuales caracteres coinciden
		for (int i = 0; i < intento.length(); i++) {
			// Si coinciden se anade a coincidencias el caracter
			if (intento.charAt(i) == original.charAt(i)) {
				coincidencias += original.charAt(i);
			} else { // Si no un asterisco
				coincidencias += "*";
			}

		}
		// Devolvemos el resultado
		return coincidencias;
	}

}
