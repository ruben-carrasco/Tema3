package boletin3;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Variable que recoge el numero de filas
		int filas = 0;
		// Variable que recoge el numero de columnas
		int columnas = 0;
		// Variable de la tabla
		int tabla[][];
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos al usuario el numero de filas y lo guardamos en la variable
		System.out.println("Introduzca el numero de filas: ");
		filas = reader.nextInt();
		
		// Le pedimos al usuario el numero de columnas y lo guardamos en la variable
		System.out.println("Introduzca el numero de columnas: ");
		columnas = reader.nextInt();
		
		// Se asignamos a la tabla el numero de filas y columnas
		tabla = new int [filas][columnas];
		
		// Rellenamos la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = 10 * i + j;
			}
		}
		
		// Imprimimos la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
