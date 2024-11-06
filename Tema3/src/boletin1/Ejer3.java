package boletin1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Variable tabla
		int tabla[] = new int[5];
		// Variable que recoge el numero introducido por el usuario
		int n;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// for para pedir numeros y almacenarlos
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos el numero al usuario y lo almacenamos en la variable
			System.out.println("Introduzca un número decimal: ");
			n = reader.nextInt();
			// Vamos guardando cada numero en una posicion
			tabla[i] = n;
		}
		
		// for para mostrar los resultados en orden invertido
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
