package boletin2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Variable de la tabla
		int tabla[] = new int[1000];
		// Variable que almacena el valor a buscar
		int valor;
		// Contador de veces que aparece el numero
		int contador = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		// Creamos el Random
		Random rand = new Random();
		
		// for para asignar valores aleatorios a cada posicion de la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rand.nextInt(0, 100);
		}
		
		// Pedimos el valor al usuario y lo guardamos
		System.out.println("Introduzca un valor para buscarlo: ");
		valor = reader.nextInt();
		
		// Ordenamos la tabla
		Arrays.sort(tabla);
		
		// Si encuentra el numero, el valor existe y calculamos cuantas veces
		if (Arrays.binarySearch(tabla, valor) >= 0) {
			System.out.println("El valor existe");
			// Calculamos cuantas veces tabla[i] coincide con el valor introducido
			for (int i = 0; i < tabla.length; i++) {
				if (tabla[i] == valor) {
					contador++;
				}
			}

		} else {
			System.out.println("El valor no existe");
		}
		// Mostramos las veces que aparece
		System.out.println("Aparece " + contador + " veces");
	}
}
