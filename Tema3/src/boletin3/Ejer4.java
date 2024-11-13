package boletin3;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Variable para crear la tabla
		int tabla[][] = new int[10][10];
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos las tablas de multiplicar
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (i + 1) * (j + 1);
			}
		}
		
		// Imprimimos la tabla 
			for (int i = 0; i < tabla.length; i++) {
				System.out.print("Tabla del " + (i+1) + ":\t");
				for (int j = 0; j < tabla[i].length; j++) {
					System.out.print(tabla[i][j] + "\t");
				}
				System.out.println();
			}
		
		
		// Cerramos el Scanner
		reader.close();
	}

}
