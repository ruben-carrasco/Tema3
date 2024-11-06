package boletin1;

import java.util.Arrays;

public class Ejer4 {
	public static void main(String[] args) {
		// Creamos la tabla
		int tabla[] = new int[12];
		
		// Damos los valores
		tabla[0] = 39;
		tabla[1] = -2;
		tabla[4] = 0;
		tabla[6] = 14;
		tabla[8] = 5;
		tabla[9] = 15;
		
		// Mostramos el contenido
		System.out.println(Arrays.toString(tabla));
		
		// Resultado: a las posiciones no inicializadas se les asigna 0
	}

}
