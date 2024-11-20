package boletin4;

public class Ejer2 {
	public static void main(String[] args) {
		// Creamos una tabla
		int t[] = { 2, 5, 3, 3, 6, 3, 6, 10 };
		// Mostramos el resultado de la función
		System.out.println(maximo(t));

	}

	// Creamos la función
	public static int maximo(int t[]) {
		// Creamos la variable max inicializada con el minimo valor
		int max = Integer.MIN_VALUE;
		// for para recorrer toda la tabla
		for (int i = 0; i < t.length; i++) {
			// Si un valor es mayor que max, max se actualiza con ese valor
			if (t[i] > max) {
				max = t[i];
			}
		}
		// Devolvemos Max
		return max;
	}

}
