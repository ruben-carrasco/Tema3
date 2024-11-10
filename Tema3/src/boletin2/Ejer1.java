package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Variable para el valor del array
		int v;
		// Variable para el tamaño del array
		int t;
		// Variable del Array

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos el tamano de la tabla al usuario y lo guardamos en la variable
		System.out.println("Introduzca el tamaño de la tabla: ");
		t = reader.nextInt();

		// Pedimos el valor de la tabla al usuario y lo guardamos en la variable
		System.out.println("Introduzca el valor de todas las posiciones: ");
		v = reader.nextInt();

		// Creamos la tabla tamano con el valor introducido por el usuario
		int tabla[] = new int[t];
		
		// La inicializamos con el valor introducido por el usuario
		Arrays.fill(tabla, v);
		
		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));

		// Cerramos el Scanner
		reader.close();
	}

}
