package boletin8;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		HashMap<String, Integer> productos = new HashMap<>();
		int option;
		boolean salir = false;
		String nombre;
		int precio;

		Scanner reader = new Scanner(System.in);

		while (!salir) {
			System.out.println("Productos");
			System.out.println();
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("4. Listar existencias");
			System.out.println("0. Salir");
			System.out.println();

			System.out.println("Introduzca una opcion: ");
			option = reader.nextInt();
			
			reader.nextLine();
			
			switch (option) {
			case 1 -> {
				System.out.println("Nombre del producto: ");
				nombre = reader.nextLine();
				System.out.println("Precio: ");
				precio = reader.nextInt();
				productos.put(nombre, precio);
			}
			case 2 -> { 
				System.out.println("Nombre del producto que desea eliminar");
				nombre = reader.nextLine();
				
				productos.remove(nombre);
			}
			case 4 -> {
				System.out.println(productos);
			}
			default -> {
				salir = true;
			}
			}
		} 

		reader.close();
	}

}
