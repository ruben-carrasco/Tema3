package boletin4part2;

import java.util.Arrays;

public class Ejer2 {
	public static void main(String[] args) {
		// Creamos la tabla que vamos a transponer
		int tabla[][] = {{1,2,3},{4,5,6},{7,8,9}};
		// Variable para almacenar la tabla transpuesta
		int transpuesta[][] = new int[0][0];
		
		
		// Imprimimos la tabla sin transponer
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// A la tabla transpuesta le asignamos el resultado de transponer tabla
		transpuesta = transposición(tabla);
		
		for(int i = 0; i < transpuesta.length; i++) {
			for(int j = 0; j < transpuesta[i].length; j++) {
				System.out.print(transpuesta[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	
	}
	
	public static int[][] transposición(int[][] t) {
		
		// Creamos una variable para la tabla transpuesta
		int[][] transpuesta = new int[t.length][t[0].length];
		
		//Recorremos la tabla t y de forma inversa vamos asignando los valores a la tabla transpuesta
		 for (int i = 0; i < t.length; i++) {
	            for (int j = 0; j < t[0].length; j++) {
	                transpuesta[j][i] = t[i][j];
	            }
	        }
		
		return transpuesta;
	}

}
