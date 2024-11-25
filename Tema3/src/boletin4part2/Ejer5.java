package boletin4part2;

public class Ejer5 {
	public static void main(String[] args) {
		// Tabla sin rotar
		int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		// Variable para almacernar la funcion
		int girada[][];
		
		// Imprimimos la tabla sin rotar
		for (int fila[] : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		// Asignamos a girada el resultado de la funcion
		girada = gira90(tabla);

		// Mostramos la tabla girada
		for (int fila[] : girada) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] gira90(int tablaInicio[][]) {
		// Variable de la tabla
		int girada[][] = new int[tablaInicio.length][tablaInicio[0].length];

		// Bucle para girar la tabla)
		for (int i = 0; i < girada.length; i++) {
			for (int j = 0; j < girada[i].length; j++) {
				// Cambiamos las posiciones de las filas a las columnas empezando por el final
				girada[j][girada.length - 1 - i] = tablaInicio[i][j];
			}
		}

		return girada;
	}

}
