package boletin8;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer7 {
	public static void main(String[] args) {
		// Boolean para salir del menu
		boolean salir = false;
		// TreeMap para almacenar las parejas de palabras ordenadas
		TreeMap<String, String> diccionario = new TreeMap<>();
		// Variable que almacena la opcion de menú elegida por el usuario
		int opcion;
		// Variable que almacena una palabra en español insertada
		String palabraEsp;
		// Variable que almacena su traduccion
		String ingles;
		// Variable que almacena la palabra que deseamos consultar en el diccionario
		String traducir;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		while (!salir) {
			// Menu
			System.out.println();
			System.out.println("1. Insertar palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("3. Salir");

			// Pedimos al usuario que elija una opción
			System.out.print("Elija una opción: ");
			opcion = reader.nextInt();
			
			// Limpieamos Buffer
			reader.nextLine();
			
			System.out.println();
			
			// Switch para las diferentes opciones
			switch (opcion) {
			case 1 -> {
				// Pedimos al usu la palabra en español y almacenamos en variable
				System.out.print("Introduzca una palabra en español: ");
				palabraEsp = reader.nextLine();
				
				// Pedimos al usu la palabra en ingles y almacenamos en variable
				System.out.print("Introduzca su traduccion en ingles: ");
				ingles = reader.nextLine();

				// Añadimos el par al mapa
				diccionario.put(palabraEsp, ingles);
			}
			case 2 -> {
				// Pedimos al usurio que introduzca la palabra que deseamos buscar su traduccion
				// y la almacenamos
				System.out.print("Mostrar traducción de: ");
				traducir = reader.nextLine();

				// Devolvemos el valor asociado e imprimimos el resultado
				System.out.println("Traducción: " + diccionario.get(traducir));

			}
			default -> {
				// Si pulsas 3, sale
				salir = true;
			}
			}
		}
		
		System.out.println("Saliste");

		// Cerramos Scanner
		reader.close();
	}

}
