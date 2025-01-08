package boletin7;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		// Variable que recoge la frase que pedimos el usuario
		String frase;
		// Variable que recoge la mayor palabra
		String palabraMayor;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
	
		// Pedimos una frase al usuario y lo almacenamos en la variable
		System.out.println("Introduzca una frase: ");
		frase = reader.nextLine();
		
		// Asignamos la mayor palabra a la variable como resultado de la funcion
		palabraMayor = mayorPalabra(frase);
		
		// Mostramos la palabra y longitud
		System.out.println("Palabra: " + palabraMayor + ". Longitud: " + palabraMayor.length());
		
		// Cerramos el Scanner
		reader.close();
	}
	
	public static String mayorPalabra(String frase) {
		// Almacena la mayor palabra
		String palabra = "";
		// Almacena la longitud de la mayor palabra
		int longitudMayor = Integer.MIN_VALUE;
		// Array que almacena las palabras de la frase separadas
		String[] separadas;
		
		// Separamos las palabras por espacios
		separadas = frase.split(" ");
		
		// Recorremos el Array
		for (int i = 0; i < separadas.length; i++) {
			// Si una palabra es mayor que la anterior asignamos la asignamos a palabra
			if (separadas[i].length() > longitudMayor) {
				longitudMayor = separadas[i].length();
				palabra = separadas[i];
			}
		}
		
		return palabra;
	}

}
