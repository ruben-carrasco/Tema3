package boletin4;

import java.util.Arrays;

public class Ejer5 {
	public static void main(String[] args) {
		// Creamos una tabla
		int tabla[] = { 3, 5, 4, 3, 2, 4, 4, 7, 10, 11, 2 };
		// Mostramos el resultado de llamar a la función
		System.out.println(Arrays.toString(buscarTodos(tabla, 4)));

	}

	// Funcion para saber el tamaño que tendrá la tabla
	public static int tamañoTabla(int t[], int valor) {
		int tamaño = 0;
		// Comprobamos cuantas veces se repite el valor y por cada vez aumentamos el
		// tamaño
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				tamaño++;
			}
		}
		return tamaño;
	}

	// Funcion para crear la tabla
	public static int[] buscarTodos(int t[], int valor) {

		// Variable para la nueva tabla con los indices del valor
		int tabla[] = new int[tamañoTabla(t, valor)];
		// Indice de la tabla con los indices del valor
		int indice = 0;

		// Recorremos la tabla y si el valor de una posición coincide con el introducido
		// a tabla
		// le asignamos como valor la posición
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				tabla[indice] = i;
				indice++;
			}
		}

		return tabla;

	}

}
