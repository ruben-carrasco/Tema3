package boletin7;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Variable que recoge la contraseña a adivinar
		String contraseña;
		// Variable que recoge el intento de adivinar contraseña
		String intento = "";
		// Variable que recoge si es menor o mayor alfabeticamente
		int alfabeto;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al jugador 1 la contraseña y la guardamos en la variable
		System.out.println("Jugador 1, introduzca la contraseña: ");
		contraseña = reader.nextLine();

		// Bucle que pide contraseña hasta que se adivina
		while (!intento.equals(contraseña)) {
			// Pedimos al jugador 2 la contraseña y la guardamos en la variable
			System.out.println("Jugador 2, intente adivinar la contraseña: ");
			intento = reader.nextLine();

			// Guardamos en alfabeto la posicion en alfabeto de la cadena invocante
			alfabeto = intento.compareTo(contraseña);
			// Si es menor a 0, el intento es menor
			if (alfabeto < 0) {
				System.out.println("La contraseña introducida es menor alfabeticamente");
				// Si es mayor a 0, el intento es mayor
			} else if (alfabeto > 0) {
				System.out.println("La contraseña introducida es mayor alfabeticamente");
				// Son iguales por lo que imprime ganaste
			} else {
				System.out.println("Ganaste!!!");
			}
		}

		// Cerramos el Scanner
		reader.close();
	}
}
