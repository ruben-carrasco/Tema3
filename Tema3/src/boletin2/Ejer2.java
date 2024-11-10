package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// VAriable para cada valor de la tabla
		int v;
		// Variable de la tabla 1
		int tabla1[] = {0};
		// Variable de la tabla 2
		int tabla2[] = {0};
		// Variable para la tabla actual a la que se asignan valores
		int actual[] = new int[10];
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Tabla 1: ");
		
		// for para pedir dos veces los 10 numeros
		for (int veces = 1; veces <= 2; veces++) {
			
			// Almacenamos 10 numeros en la tabla actual
			for (int i = 0; i < actual.length; i++) {
				// Pedimos los numeros al usuario y los guardamos en la variable
				System.out.println("Introduzca un valor para la posicion: " + i);
				v = reader.nextInt();
				// Asignamos un numero a cada posicion;
				actual[i] = v;
				
			}
			
			// Asignamos a cada tabla sus valores
			if (veces == 1) {
				tabla1 = Arrays.copyOf(actual, actual.length);
				System.out.println();
				System.out.println("Tabla 2: ");
			} else {
				tabla2 = Arrays.copyOf(actual, actual.length);
			}
		}
		
		// Mostramos el contenido de cada tabla
		System.out.println("Tabla 1: " + Arrays.toString(tabla1));
		System.out.println("Tabla 2: " + Arrays.toString(tabla2));
		
		// Comparamos si las tablas son iguales o no
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales");
		} else {
			System.out.println("Las tablas no son iguales");
		}

			// Cerramos el Scanner
			reader.close();

	}

}
