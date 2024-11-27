package boletin5;

public class Ejer1 {
	public static void main(String[] args) {
		// Creamos la tabla de enteros
		int[][] tabla = { { 3, 1, 4, 2 }, { 8, 5, 7, 6 }, { 12, 10, 11, 9 } };

		// Booleano donde almacenamos el resultado de la función
		boolean encontrado;

		// Asignamos a la variable el resultado de la funcion
		encontrado = busquedaValor(tabla, 5);

		// Mostramos el resultado
		System.out.println(encontrado ? "Se ha encontrado el valor" : "No se ha encontrado el valor");

	}

	public static boolean busquedaValor(int t[][], int valor) {
		// Booleano a devolver
		boolean encontrado = false;
		// Indice para las filas
		int indiceFilas = 0;
		// Indice para las columnas
		int indiceColumnas = 0;

		// while para recorrer la tabla
		while (indiceFilas < t.length && !encontrado) {
			while(indiceColumnas < t[indiceFilas].length && !encontrado) {
				// Si lo encuentra sale del bucle
				if (t[indiceFilas][indiceColumnas] == valor) {
					encontrado = true;
				}
				indiceColumnas++;
			}
				indiceFilas++;
				indiceColumnas = 0;
		}

		return encontrado;
	}

}
