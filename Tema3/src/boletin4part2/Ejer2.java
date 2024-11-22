package boletin4part2;

import java.util.Arrays;

public class Ejer2 {
	public static void main(String[] args) {
		int tabla[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int transpuesta[][] = new int[0][0];
		
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println(transposición(tabla));
		
		for(int i = 0; i < transpuesta.length; i++) {
			for(int j = 0; j < transpuesta[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	
	}
	
	public static String transposición(int[][] t) {
		
		for(int i = 0; i < t[0].length; i++) {
			for(int j = 0; j < t.length; j++) {
				System.out.print(t[j][i] + "\t");
			}
			System.out.println();
		}
		
		return "Tabla transpuesta";
	}

}
