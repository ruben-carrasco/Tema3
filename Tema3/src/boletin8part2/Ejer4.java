package boletin8part2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Creamos la lista
		LinkedList<String> nombres = new LinkedList<>();
		// Variable que almacena el nombre introducido por el usuario
		String nombre;
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
		while (option != 5) {
			// Switch para las diferentes opciones
			switch(option) {
			case 1 -> {
				System.out.println("Introduzca un nombre: ");
				nombre = reader.nextLine();
				
				añadirPalabra(nombres,nombre);
			}
			case 2 -> {
				System.out.println("Introduzca un nombre: ");
				nombre = reader.nextLine();
				eliminarPalabra(nombres,nombre);
			}
			case 3 -> {
				ordenaLista(nombres);
			}
			case 4 -> {
				System.out.println("Introduzca un nombre: ");
				nombre = reader.nextLine();
				buscaPalabra(nombres,nombre);
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
		System.out.println("1. Añadir nuevo nombre a la lista.");
		System.out.println("2. Elimina un nombre específico.");
		System.out.println("3. Ordena la lista alfabéticamente.");
		System.out.println("4. Busca si un nombre específico está en la lista.");	
		System.out.println("5. Salir.");		
	}
	
	// Funcion que añade nombre
	public static void añadirPalabra(LinkedList<String> lista,String palabra) {
		// Añade una palabra
		lista.add(palabra);
	}
	// Funcion que elimina nombre
	public static void eliminarPalabra(LinkedList<String> lista,String palabra) {
		// AElimina una palabra
		lista.remove(palabra);
	}
	
	// Funcion que ordena lista
	public static void ordenaLista(LinkedList<String> lista) {
		// Ordena lista
		Collections.sort(lista);
	}
	
	// Funcion que ordena lista
	public static boolean buscaPalabra(LinkedList<String> lista,String palabra) {
		// Booleano para saber si esta
		boolean encontrado;
		// Busca palabra
		encontrado = lista.contains(palabra);
		// Devolvemos resultado
		return encontrado;
		
	}

}
