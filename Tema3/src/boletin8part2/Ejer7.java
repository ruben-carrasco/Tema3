package boletin8part2;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejer7 {
	public static void main(String[] args) {
		// Mapa que almacena posiciones y las longitudes de las palabras
		TreeMap<Integer, TreeSet<String>> longitudes = new TreeMap<>();
		// Palabra introducida por el usuario
		String palabra;
		
		// Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos palabra al usuario y se almacena
		System.out.println("Intruzca la palabra: ");
		palabra = reader.nextLine();
		
		while(!palabra.equals("end")) {
			// Anadimos la palabra usando la funcion
			anadirPalabra(longitudes,palabra);
			// Mostramos el mapa
			System.out.println(longitudes);
			// Pedimos palabra al usuario y se almacena
			System.out.println("Intruzca la palabra: ");
			palabra = reader.nextLine();	
		}
		
		// Cerramos Scanner
		reader.close();
		
		
		
	}
	
	// Funcion que anade conjuntos de palabras agrupadas por longitud en un mapa
	public static void anadirPalabra(TreeMap<Integer, TreeSet<String>> longitudes, String palabra) {
		// Creamos el Conjunto
		TreeSet<String> palabras = new TreeSet<>();
		// Variable que almacena longitud
		int longitud;
		//Longitud es igual a la longitud de la palabra introducida por el usuario
		longitud = palabra.length();
		
		// Si ya existe se anade la palabra al conjunto
		if (longitudes.containsKey(longitud)) {
			longitudes.get(longitud).add(palabra);
			// Si no existe se anade la key junto con un nuevo conjunto
		} else {
			longitudes.put(longitud, palabras);
			// Se anade la palabra
			longitudes.get(longitud).add(palabra);
		}
		
		
		
	}

}
