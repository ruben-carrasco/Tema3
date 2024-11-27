package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejer2 {
	public static void main(String[] args) {
		//Variable de la tabla ordenada
		int tabla[] = {1,2,3,4,5};
		
		desordenar(tabla);
		
		// Mostramos la tabla desordenada
		System.out.println(Arrays.toString(tabla));
	}
	
	// Funcion para desordenar tabla
	public static int[] desordenar(int t[]) {
		//Variable auxiliar para almacenar un valor
		int aux;
		
		//Variable para el indice i aleatorio
		int posI;
		
		// Creamos el random
		Random rand = new Random();
		
		// Recorremos la tabla
		for (int i = 0; i < t.length; i++) {
			// Genero una posición aleatoria para intercambiar su valor con la posición actual
			posI = rand.nextInt(0,t.length);
			// En la variable auxiliar guardo el valor de la posición actual
			aux = t[i];
			// A la posición actual le asignamos el valor de la posición aleatoria
			t[i] = t[posI];
			// A la posición aleatoria le asignamos el valor de la posición actual almacenado en la variable auxiliar.
			t[posI] = aux;
		}
		
		return t;
	}
	
	

}
