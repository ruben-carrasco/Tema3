package boletin4;

public class Ejer4 {
	public static void main(String[] args) {
		// Creamos una tabla
		int t[] = new int[] { 5, 5, 4, 3, 5 };
		// Mostramos el resultado de llamar a la funcion
		System.out.println(buscar(t, 4));
	}

	// Creamos la funcion
	public static int buscar(int t[], int clave) {

		// Variable que almacena el indice de la tabla
		int indice = 0;
		// Variable que almacena el resultado
		int resultado = -1;

		// Bucle que se realiza hasta que sea encontremos el valor clave o se recorra la
		// tabla
		while (resultado != indice && indice < t.length) {
			// Si el valor de una posicion coincide con clave le asignamos la posicion a
			// resultado
			if (t[indice] == clave) {
				resultado = indice;
			}
			// Pasamos a la siguiente posicion
			indice++;
		}
		// Devolvemos la posicion o -1
		return resultado;
	}

}
