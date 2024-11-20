package boletin4;

import java.util.Arrays;
import java.util.Random;

public class Ejer3 {
	public static void main(String[] args) {

		// Mostramos el resultado de llamar la función
		System.out.println(Arrays.toString(rellenaPares(10, 10)));

	}

	public static int[] rellenaPares(int longitud, int fin) {
		// Variable para almacenar un número random
		int random;
		// Variable para salir del bucle
		boolean par;
		// Variable para la tabla de longitud introducida por el usuario
		int tabla[] = new int[longitud];
		// Creamos el Random
		Random rand = new Random();
		// Creamos un for que recorre la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Inicializamos para entrar al bucle en cada iteracion
			par = false;
			// Bucle del que salimos si
			while (!par) {
				// Asignamos un numero random entre 2 y fin
				random = rand.nextInt(2, fin);
				// Si el numero es par lo asignamos a la posicion, si no lo es volvemos a
				// asignar
				if (random % 2 == 0) {
					tabla[i] = random;
					par = true;
				}
			}
		}
		// Devolvemos la tabla
		return tabla;
	}

}
