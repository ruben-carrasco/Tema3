package boletin1;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		//Variable tabla
		int tabla[] = new int[8];
		// Variable que recoge cada numero introducido por el usuario
		int n;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos un bucle para almacenar los valores en la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos los numeros al usuario y lo guardamos en la variable
			System.out.println("Introduzca un numero: ");
			n = reader.nextInt();
			
			// Almacenamos cada valor en una posicion de la tabla
			tabla[i] = n;
		}
		
		// Bucle para mostrar los numeros
		for (int numero: tabla) {
			// Si numero modulo 2 es 0 es par y lo mostramos, si no impar y lo mostramos
			if (numero % 2 == 0) {
				System.out.println(numero + " par");
			} else {
				System.out.println(numero + " impar");
			}
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
