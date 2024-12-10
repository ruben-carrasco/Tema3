package boletin7;

import java.util.Scanner;

public class Ejer2Avanzado {
	public static void main(String[] args) {
		// Variable que recoge la contraseña a adivinar
		String contraseña;
		// Variable que recoge el intento de adivinar contraseña
		String intento = "";
		// caracter de contraseña
		char charContraseña;
		// caracter de intento
		char charIntento;
		// Pista con asteriscos 
		String pista;

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
			
			// Inicializados a cadena vacía la pista
			pista = "";
			
			// for para construir la pista, recorre cada caracter de las cadenas
			for (int i = 0; i < contraseña.length(); i++) {
				charContraseña = contraseña.charAt(i);
				charIntento = intento.charAt(i);
				
				// Si los caracteres son iguales los añade a pista, si no añade asterisco
				if (charContraseña == charIntento) {
					pista += charContraseña;
				} else {
					pista += '*';
				}
			}
			
			// Si adivina imprime Ganaste, si no muestra la pista
			if (intento.equals(contraseña)) {
				System.out.println("Ganaste, era " + intento);
			} else {
				System.out.println(pista);
			}
		}

		// Cerramos el Scanner
		reader.close();
	}
}
