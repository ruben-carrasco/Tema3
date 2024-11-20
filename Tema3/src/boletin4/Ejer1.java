package boletin4;

public class Ejer1 {
	public static void main(String[] args) {
		// Creamos la tabla
		int tabla[] = { 1, 7, 4, 2, 5, 2, 10 };
		// Mostramos el resultado de la función
		System.out.println(suma(tabla));

	}

	// Creamos la función
	public static int suma(int tabla[]) {
		// Variable que recoge la suma de los valores
		int sumaTotal = 0;
		// for para ir sumando cada valor a sumaTotal
		for (int valor : tabla) {
			sumaTotal += valor;
		}
		// Devolvemos el resultado
		return sumaTotal;
	}

}
