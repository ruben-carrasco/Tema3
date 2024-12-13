package boletin7;

import java.util.Arrays;

public class Ejer8 {
	public static void main(String[] args) {
		// Variable para almacenar la frase ordenada
		String[] fraseOrdenada;
		
		// Almacenamos el resultado de ordenar la frase con la función
		fraseOrdenada = ordenaFrase("Hola yo soy tu amigo Ruben y me gustan mucho las magdalenas");
		
		// Lo imprimimos
		System.out.println(Arrays.toString(fraseOrdenada));
		
	}
	
	// Funcion que ordena una frase por palabras alfabeticamente
	public static String[] ordenaFrase (String frase) {
		// Array para almacenar las palabras separadas
		String[] fraseOrdenada;
		
		// La pasamos a miniscula y separamos palabras por espacios
		fraseOrdenada = frase.toLowerCase().split(" ");
		
		// Ordenamos la frase
		Arrays.sort(fraseOrdenada);
		
		// Devolvemos la frase ordenada
		return fraseOrdenada;
	}

}
