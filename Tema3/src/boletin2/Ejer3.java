package boletin2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Creamos el array de 30 enteros
		int tabla[] = new int[30];
		// Variable para almacenar el numero random
		int numrand;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		// Creamos el Random
		Random rand = new Random();
		
		// Creamos un for para asignar numeros aleatorios a cada posicion de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Asigna un numero aleatorio a la variable numrand entre 0 y 9
			numrand = rand.nextInt(0,10);
			// Asignamos ese valor en cada posicion de la tabla
			tabla[i] = numrand;
		}
		
		// Mostramos la tabla sin ordenar
		System.out.println("Tabla desordenada: " + Arrays.toString(tabla));
		
		// Ordenamos y mostramos la tabla
		Arrays.sort(tabla);
		System.out.println("Tabla ordenada: " + Arrays.toString(tabla));
		
		// Cerramos el Scanner
		reader.close();
	}

}
