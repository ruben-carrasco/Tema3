package boletin8;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// Boolean para salir del menu
		boolean salir = false;
		// TreeMap para almacenar las parejas de palabras ordenadas
		HashMap<String, String> detallesLog = new HashMap<>();
		// Variable que almacena la opcion de menú elegida por el usuario
		int opcion;
		// Variable que almacena un usuario para introducir en el mapa
		String usu;
		// Variable que almacena su contrasena
		String pass;
		// Variable que almacena el usuario de logeo
		String usuLog;
		// Variable que almacena el pass de logeo
		String passLog;
		// S
		boolean exito;
		//
		int contador;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		while (!salir) {
			// Menu
			System.out.println();
			System.out.println("1. Registro");
			System.out.println("2. Login");
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
				// Pedimos al usu que introduzca su usuario
				System.out.print("Introduzca un usuario: ");
				usu = reader.nextLine();
				
				// Pedimos al usu que introduzca una contrasena
				System.out.print("Introduzca password para completar el registro: ");
				pass = reader.nextLine();

				// Añadimos el par al mapa
				detallesLog.put(usu, pass);
			}
			case 2 -> {
				contador = 0;
				exito = false;
				while (contador < 3 && !exito) {
				// Pedimos al usurio que introduzca el usuario de login
				System.out.print("Usuario: ");
				usuLog = reader.nextLine();
				
				// Pedimos al usurio que introduzca al contrasena de login
				System.out.print("Contrasena: ");
				passLog = reader.nextLine();
				
				if (!detallesLog.replace(usuLog, passLog, passLog)) contador++;
				
				exito = detallesLog.replace(usuLog, passLog, passLog);}
				
				if (exito) {
					System.out.println("Ha accedido al área restringida");
				} else {
					System.out.println("Lo siento, no tiene acceso al área restringida");
				}
				

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
