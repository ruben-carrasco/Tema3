package boletin8part2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// Mapa de categoria con tareas
		HashMap<String, HashSet<String>> tareas = new HashMap<>();
		// Almacena categoria introducida
		String categoria;
		// Almacena tarea introducida
		String tarea;
		// Almacena opcion introducida
		int opcion;
		
		//Scanner
		Scanner reader = new Scanner(System.in);
		
		// Imprimimos menu y pedimos opcion al usuario
		imprimeMenu();
		opcion = reader.nextInt();
	
		// Si la opcion no es 5
		while (opcion != 5) {
			// Reiniciamos buffer
			reader.nextLine();
			
			// Switch para las opciones
			switch (opcion) {
			// Anade categoria
			case 1 ->{
				// Se pide categoria
				System.out.println("Introduzca una categoria: ");
				categoria = reader.nextLine();
				
				// Se anade como valor null
				tareas.put(categoria, null);
				
				// Se hace syso del resultado
				System.out.println(tareas);
			}
			// Funcion para añadir tarea
			case 2 ->{
				// Se pide categoria
				System.out.println("Introduzca una categoria: ");
				categoria = reader.nextLine();
				
				// Se pide tarea
				System.out.println("Introduzca una tarea: ");
				tarea = reader.nextLine();
				
				// Se anade
				añadirTarea(tareas, categoria, tarea);
				
				// Se hace syso del resultado
				System.out.println(tareas);
			}
			// Funcion para eliminar tareas por categoria	
			case 3 ->{
				// Se pide categoria
				System.out.println("Introduzca una categoria: ");
				categoria = reader.nextLine();
				
				// Se pide tarea
				System.out.println("Introduzca una tarea: ");
				tarea = reader.nextLine();
				
				// Se elimina
				eliminarTarea(tareas, categoria, tarea);
				
				// Se hace syso del resultado
				System.out.println(tareas);
			}
			// Listar tareas por categoria
			case 4 ->{
				// Se pide categoria
				System.out.println("Introduzca una categoria: ");
				categoria = reader.nextLine();
				
				// Se hace syso del conjunto contenido como valor
				System.out.println(tareas.get(categoria));
			}
			}
			
			// Imprimimos menu y pedimos opcion al usuario
			imprimeMenu();
			opcion = reader.nextInt();
		}
		// Cerramos Scanner
		reader.close();
		
	}
	
	// Funcion que imprime menu
		public static void imprimeMenu() {
			// Menu
			System.out.println("1. Añadir categoria.");
			System.out.println("2. Añadir tarea a categoria.");
			System.out.println("3. Eliminar tarea de categoria.");
			System.out.println("4. Listar tareas por categoria.");
			System.out.println("5. Salir");
			System.out.println("Introduzca una opcion: ");
		}

		// Funcion para añadir tarea
		public static void añadirTarea (HashMap<String, HashSet<String>> mapa,String categoria, String tarea) {
			// Creamos un conjunto para las tareas
			HashSet<String> tareas = new HashSet<>();
			// Si el valor es null se añade el conjunto como valor
			if (mapa.get(categoria) == null) {
				mapa.put(categoria, tareas);
				// Se añade la tarea
				tareas.add(tarea);
			} else {
				// Si no es null, solo se añade la tarea
				mapa.get(categoria).add(tarea);
			}
		}
		
		// Funcion para eliminar tareas por categoria
		public static void eliminarTarea (HashMap<String, HashSet<String>> mapa,String categoria, String tarea) {			
			HashSet<String> tareas = new HashSet<>();
			// Obtenemos el valor de la clave que es un conjunto
			tareas = mapa.get(categoria);
			// Eliminamos la tarea
			tareas.remove(tarea);
		}

}
