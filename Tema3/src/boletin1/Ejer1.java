package boletin1;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
	public static void main(String[] args) {
		// Variable para el número random
		int numrand;

		// Creamos la tabla
		int tabla[] = new int[10];

		// Creamos el random
		Random rand = new Random();

		// Creamos el for que recorra la tabla del 0 al 9
		for (int i = 0; i < tabla.length; i++) {
			numrand = rand.nextInt(1, 101);
			tabla[i] = numrand;
		}
		
		// Mostramos el contenido de la tabla
		System.out.println(Arrays.toString(tabla));
	}

}
