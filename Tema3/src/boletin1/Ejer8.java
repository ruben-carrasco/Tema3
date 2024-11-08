package boletin1;

import java.util.Random;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// Creamos el array de 100 enteros
		int tabla[] = new int[100];
		// Variable para almacenar el numero random
		int numrand;
		// Variable para buscar valor
		int n;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		// Creamos el Random
		Random rand = new Random();
		
		// Creamos un for para asignar numeros aleatorios a cada posicion de la tabla
		for (int i = 0; i < tabla.length; i++) {
			numrand = rand.nextInt(1,11);
			tabla[i] = numrand;
		}
		
		System.out.println("Introduzca un numero para saber sus posiciones: ");
		n = reader.nextInt();
			
		while (n != tabla[i])
		
		// Cerramos el Scanner
		reader.close();
	}

}
