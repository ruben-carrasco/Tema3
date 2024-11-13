package boletin3;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Creamos el Array
		int tabla[][] = new int[4][5];
		// Variable de la suma de cada fila
		int sumaFila;
		// Variable de la suma de cada columna
		int sumaCol;
		// VAriable de la suma Total
		int total = 0;
		
		// Creamos el Scanner y el Random
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		
		// Asignamos los valores
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(100,1000);
			}
		}
		
		// Creamos la tabla para las filas
		for (int i = 0; i < tabla.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
				// Suma filas
				sumaFila += tabla[i][j];
			}
			// Al final de cada fila imprimimos la suma de la misma
			System.out.print(sumaFila);
			System.out.println();
		}
		
		// Tabla para las columnas
		for (int i = 0; i < tabla[0].length; i++) {
			sumaCol = 0;
			for (int j = 0; j < tabla.length; j++) {
				sumaCol += tabla[j][i];
			}
			// Suma total
			total += sumaCol;
			// Imprimimos al final de cada columna la suma de los valores
			System.out.print(sumaCol + "\t");
		}
		
		// Imprimimos el total
		System.out.print(total);
		
		// Cerramos el Scanner
		reader.close();
		
	}

}
