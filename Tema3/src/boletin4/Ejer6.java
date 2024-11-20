package boletin4;

import java.util.Arrays;

public class Ejer6 {
	public static void main(String[] args) {
		// Creamos la tabla de prueba
		int t[] = { 10, 1, 5, 8, 9, 2 };
		// Mostramos el resultado de llamar a la variable
		System.out.println(Arrays.toString(suma(t, 3)));

	}

	// Funcion que crea y devuelve una tabla con las sumas de los numElementos
	// elementos consecutivos de t
	public static int[] suma(int t[], int numElementos) {
		// Creamos una tabla para las sumas con la siguiente formula para su longitud
		int tablaSumas[] = new int[t.length - (numElementos - 1)];
		// Variable para suma de los valores
		int sumaValores;

		// for para recorrer la tablaSumas
		for (int i = 0; i < tablaSumas.length; i++) {
			// Inicializamos la variable a 0 en cada iteración
			sumaValores = 0;
			// for que va desde la posicion actual y avanza numElementos veces
			for (int j = i; j < i + numElementos; j++) {
				// Sumamos cada valor de la posicion a sumaValores
				sumaValores += t[j];
			}
			// Asignamos a cada índice el resultado obtenido
			tablaSumas[i] = sumaValores;
		}
		// Devolvemos el resultado
		return tablaSumas;
	}
}
