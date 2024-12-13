package boletin7;

public class Ejer7 {
	public static void main(String[] args) {
		// Creamos una variable para recoger el numero de palabras
		int numPalabras;

		// Almacenamos el numero de palabras como resultado de la funcion
		numPalabras = aparicionesPalabra("Hola hola hola y adios ruben ruben", "adios");

		// Imprimimos el numero de palabras
		System.out.println(numPalabras);

	}

	// Funcion que calcula cuantas veces aparece una palabra en una frase
	public static int aparicionesPalabra(String frase, String palabra) {
		// Variable para recoger el numero de palabras
		int numPalabras = 0;
		// Variable para almacenar la posición de una cadena encontrada
		int posCadena = 0;

		// Bucle que se repite si se encuentra la cadena, comienza la busqueda desde la
		// posicion de la cadena encontrada en adelante
		while (frase.indexOf(palabra, posCadena) >= 0) {
			// Aumenta el contador de palabras
			numPalabras++;
			// La posicion en donde empezamos a buscar sera el indice encontrado + 1
			posCadena = frase.indexOf(palabra, posCadena) + 1;
		}
		// Devolvemos el num de palabras
		return numPalabras;
	}

}
