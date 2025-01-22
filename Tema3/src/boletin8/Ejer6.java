package boletin8;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejer6 {
	public static void main(String[] args) {
		// Creamos un conjunto para almacenar nombres no duplicados por orde de insersión
		TreeSet<String> nombres = new TreeSet<>();
		// Variable que almacena los nombres introducidos por el usuario
		String nombre;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca un nombre y lo guardamos en la variable
		System.out.println("Introduzca un nombre: ");
		nombre = reader.nextLine();
		
		// Bucle que sale cuando salir es false
		while(!nombre.equals("fin")) {
			// Añadimos el nombre al conjunto
			nombres.add(nombre);
			
			// Pedimos al usuario que introduzca un nombre y lo guardamos en la variable de nuevo
			System.out.println("Introduzca un nombre: ");
			nombre = reader.nextLine();
		}
		
		System.out.println(nombres);
		
		//Cerramos el Scanner
		reader.close();
		
	}

}
