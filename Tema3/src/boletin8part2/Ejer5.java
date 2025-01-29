package boletin8part2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Creamos la lista
		HashMap<String, Integer> series = new HashMap<>();
		// Variable que almacena el nombre introducido por el usuario
		String nombre;
		// Variable que almacena la valoracion
		int valoracion;
		// Variable que almacena opcion del menu
		int option;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos el menu
		imprimeMenu();

		// Pedimos al usuario que introduzca una opcion y lo almacenamos en la variable
		System.out.println("Introduzca una opcion: ");
		option = reader.nextInt();

		reader.nextLine();

		// Entra si la opcion no es salir
		while (option != 4) {
			// Switch para las diferentes opciones
			switch (option) {
			case 1 -> {
				// Se pide introducir serie y se almacena en variable
				System.out.println("Introduzca una serie: ");
				nombre = reader.nextLine();
				// Se pide introducir valoracion y se almacena en variable
				System.out.println("Introduzca su valoracion: ");
				valoracion = reader.nextInt();
				// Se añade al mapa
				añadirPalabra(series, nombre, valoracion);
				// Se muestra resultado
				System.out.println("Serie " + nombre + " añadida");
				System.out.println(series);
			}
			case 2 -> {
				// Se pide introducir serie y se almacena en variable
				System.out.println("Introduzca una serie: ");
				nombre = reader.nextLine();
				// Se muestra valoracion
				System.out.println("La valoracion de " + nombre + " es: " + buscaPalabra(series, nombre));
			}
			case 3 -> {
				// Se pide introducir serie y se almacena en variable
				System.out.println("Introduzca una serie: ");
				nombre = reader.nextLine();
				// Se elimina
				eliminarPalabra(series, nombre);
				// Se muestra resultado
				System.out.println("Serie " + nombre + " eliminada");
				System.out.println(series);
			}
			}

			// Imprime Menu
			imprimeMenu();

			// Pedimos al usuario que introduzca una opcion y lo almacenamos en la variable
			System.out.println("Introduzca una opcion: ");
			option = reader.nextInt();

			reader.nextLine();
		}

		// Cerrar el Scanner
		reader.close();
	}

	// Funcion que imprime menu
	public static void imprimeMenu() {
		// Menu
		System.out.println("1. Agregar serie.");
		System.out.println("2. Buscar serie.");
		System.out.println("3. Eliminar serie.");
		System.out.println("4. Salir.");
	}

	// Funcion que añade serie
	public static void añadirPalabra(HashMap<String, Integer> mapa, String palabra, Integer numero) {
		// Añade una palabra
		mapa.put(palabra, numero);
	}

	// Funcion que elimina serie
	public static void eliminarPalabra(HashMap<String, Integer> mapa, String palabra) {
		// AElimina una palabra
		mapa.remove(palabra);
	}

	// Funcion que busca serie, muestra valoracion
	public static int buscaPalabra(HashMap<String, Integer> mapa, String palabra) {
		// Booleano para saber si esta
		int valoracion;
		// Busca palabra
		valoracion = mapa.get(palabra);
		// Devolvemos resultado
		return valoracion;

	}

}