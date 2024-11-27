package boletin5;

import java.util.Random;

public class Ejer3 {
	public static void main(String[] args) {
		// Creamos una variable para la tabla ordenada
		int tabla[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		// La desordenamos
		desordenar(tabla);
		
		// Imprimimos la tabla ya desordenada
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
 	}
	
	public static int[][] desordenar(int t[][]) {
		// Variable auxiliar
		int aux;
		
		// Variable para el indice i aleatorio
		int posI;
		
		// Variable para el indice j aleatorio
		int posJ;
		
		// Creamos el Random
		Random rand = new Random();
		
		// Recorremos la tabla
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				// Posicion aleatoria
				posI = rand.nextInt(0,t.length);
				posJ = rand.nextInt(0,t[i].length);
				
				// A la variable auxiliar le asignamos el valor de la posición actual
				aux = t[i][j];
				
				// Asignamos a la posición actual el valor de la aleatoria
				t[i][j] = t[posI][posJ];
				
				// Asignamos a la posición aleatoria el valor de la posición actual
				t[posI][posJ] = aux;
			}
		}
		
		
		return t;
	}

}
