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
			// Asigna un numero aleatorio a la variable numrand entre 1 y 10
			numrand = rand.nextInt(1,11);
			// Asignamos ese valor en cada posicion de la tabla
			tabla[i] = numrand;
		}
		
		// Pedimos el numero n que vamos a localizar
		System.out.println("Introduzca un numero para saber sus posiciones: ");
		n = reader.nextInt();
		
		// Mensaje de posiciones
		System.out.println("Posiciones dentro del Array: ");
		
		// For para saber si esta en alguna posicion el numero
		for (int i = 0; i < tabla.length; i++) {
			// Si el numero es igual al valor en i posicion de la tabla, imprime la posicion
			if (n == tabla[i]) {
				System.out.print(i + " ");
			}
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
