package boletin8part2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Creamos un mapa para almacenar personas, junto a un conjunto de telefonos
		HashMap<String, HashSet<Integer>> libreta = new HashMap<>();
		// Variable que almacena opcion de menu
		int opcion;
		// Variable que almacena el nombre de una persona
		String nombre;
		// Variable que almacena el telefono de una persona
		int telefono;

		// Scanner
		Scanner reader = new Scanner(System.in);

		// Imprime el menu
		imprimeMenu();
		// Opcion de menu introducida por el usuario
		opcion = reader.nextInt();

		// Reiniciamos buffer
		reader.nextLine();

		while (opcion != 6) {
			switch (opcion) {
			// Añadir persona
			case 1 -> {
				// Se pide el nombre de la persona y se guarda en variable
				System.out.println("Introduzca el nombre de la persona para añadir: ");
				nombre = reader.nextLine();
				// Se añade una entrada con el nombre y un nuevo conjunto para
				libreta.put(nombre, null);
				
				System.out.println(libreta);
			}
			// Telefono a persona
			case 2 -> {
				// Se pide el nombre de la persona y se guarda en variable
				System.out.println("Introduzca el nombre de la persona: ");
				nombre = reader.nextLine();
				// Se pide telefono y se guarda en variable
				System.out.println("Introduzca un telefono: ");
				telefono = reader.nextInt();
				// Se añade el telefono al conjunto
				añadirTelefono(libreta,nombre,telefono);
				
				System.out.println(libreta);
			}
			// Mostrar telefonos de una persona
			case 3 -> {
				// Se pide el nombre de la persona y se guarda en variable
				System.out.println("Introduzca el nombre de la persona: ");
				nombre = reader.nextLine();	
				// Se muestran los telefonos
				System.out.println(libreta.get(nombre));
			}
			// Eliminar telefono de una persona
			case 4 -> {
				// Se pide el nombre de la persona y se guarda en variable
				System.out.println("Introduzca el nombre de la persona: ");
				nombre = reader.nextLine();
				// Se pide telefono y se guarda en variable
				System.out.println("Introduzca un telefono a eliminar: ");
				telefono = reader.nextInt();
				// Se elimina persona
				System.out.println(eliminarTelefono(libreta,nombre,telefono) ? "Exito" : "No exito"); ;
			}
			// Eliminar una persona
			case 5 -> {
				// Se pide el nombre de la persona y se guarda en variable
				System.out.println("Introduzca el nombre de la persona: ");
				nombre = reader.nextLine();
				// Se borra persona
				libreta.remove(nombre);
			}
			}

			// Imprime el menu
			imprimeMenu();
			// Opcion de menu introducida por el usuario
			opcion = reader.nextInt();

			// Reiniciamos buffer
			reader.nextLine();
		}
		// Cerramos Scanner
		reader.close();

	}

	// Funcion que imprime menu
	public static void imprimeMenu() {
		// Menu
		System.out.println("1. Añadir persona.");
		System.out.println("2. Añadir teléfono a persona.");
		System.out.println("3. Mostrar teléfono de persona.");
		System.out.println("4. Eliminar teléfono de persona.");
		System.out.println("5. Eliminar persona");
		System.out.println("6. Salir");
		System.out.println("Introduzca una opcion: ");
	}

	// Funcion para añadir telefono
	public static void añadirTelefono (HashMap<String, HashSet<Integer>> mapa,String nombre, int telefono) {
		// Creamos un conjunto para los telefonos
		HashSet<Integer> telefonos = new HashSet<>();
		// Si el valor es null se añade el conjunto como valor
		if (mapa.get(nombre) == null) {
			mapa.put(nombre, telefonos);
			// Se añade el telefono
			telefonos.add(telefono);
		} else {
			// Si no es null, solo se añade el telefono
			mapa.get(nombre).add(telefono);
		}
	}
	
	// Funcion para eliminar telefono
	public static boolean eliminarTelefono (HashMap<String, HashSet<Integer>> mapa,String nombre, int telefono) {
		boolean eliminado;
		HashSet<Integer> telefonos = new HashSet<>();
		// Obtenemos el valor de la clave que es un conjunto
		telefonos = mapa.get(nombre);
		// Eliminamos y almacenamos el booleano resultante
		eliminado = telefonos.remove(telefono);
		// Devuelve truesi se realiza el remove correctamente
		return eliminado;
	}

}
