package boletin7;

public class Ejer3 {
	public static void main(String[] args) {
		// Creamos una variable para guardar frases
		String frase = "hola soy ruben";
		// para contar espacios
		int cantidadEspacios;
		
		// almacenamos el resultado de llamar a al funcion
		cantidadEspacios = espaciosBlanco(frase);
		
		// Mostramos el numero de espacios
		System.out.println(cantidadEspacios);
		
	}

	// Funcion que devuelve cuantos espacios en blanco tiene una frase
	public static int espaciosBlanco(String frase) {
		// Variable para contar espacios
		int cantidadEspacios = 0;
		// bucle para recorrer la frase
		for (int i = 0; i < frase.length(); i++) {
			// si el caracter es un espacio aumentamos el contador
			if (frase.charAt(i) == ' ') {
				cantidadEspacios++;
			}
		}
		// Devolvemos la cantidad
		return cantidadEspacios;
	}
}
