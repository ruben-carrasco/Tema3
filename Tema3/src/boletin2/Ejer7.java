package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		// Tabla del array
		int tabla[] = new int[55];
		// Posicion
		int index = 0;
		
		// Creamos Scanner
		Scanner reader = new Scanner(System.in);
		
		// Iteracion para cada numero
		for (int i = 1; i <= 10; i++) {
				Arrays.fill(tabla, index, index + i, i);
				index += i;
			}
		
		// Mostramos resultado
		System.out.println(Arrays.toString(tabla));
		
		// Cerramos Scanner
		reader.close();
	}

}
