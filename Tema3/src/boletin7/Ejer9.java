package boletin7;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		// Variable que almacena la frase introducida por el usuario
		String frase;
		// Variable que almacena la frase traducida
		String fraseTraducida;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos un mensaje lo almacenamos en la variable frase
		System.out.println("Introduzca un mensaje: ");
		frase = reader.nextLine();
		reader.nextLine();
		
		// Almacenamos en fraseTraducida el resultado de traducir frase
		fraseTraducida = traductor(frase);
		
		// Imprimimos
		System.out.println(fraseTraducida);
		
		// Cerramos Scanner
		reader.close();
	}

	public static String traductor(String frase) {
		// Variable que almacena la frase traducida
		String fraseTraducida = "";
		// Variable que almacena la frase sin muletillas
		String separar = "";

		// Si en la cadena encontramos Javalín, javalón al comienzo y 2
		// espacios/tabuladores o mas en la poscición 16
		if (frase.indexOf("Javalín, javalón") == 0 && (frase.indexOf("  ") == 16 || frase.indexOf("\t\t") == 16)) {
			// Reemplazamos las muletillas con cadena vacía para eliminarlas
			separar = frase.replace("Javalín, javalón", "");
			// Quitamos espacios al comienzo / final de la cadena
			fraseTraducida = separar.trim();
			// Si en la cadena encontramos javalén, len, len al final y 2
			// espacios/tabuladores o mas en la poscición longitud - 19
		} else if (frase.indexOf("javalén, len, len") == frase.length() - 17
				&& (frase.lastIndexOf("  ") == (frase.length() - 19)
						|| frase.lastIndexOf("\t\t") == (frase.length() - 19))) {
			// Reemplazamos las muletillas con cadena vacía para eliminarlas
			separar = frase.replace("javalén, len, len", "");
			// Quitamos espacios al comienzo / final de la cadena
			fraseTraducida = separar.trim();
			// Si no cumple con esas condiciones devuelve "No está en un dialecto de
			// Javalandia"
		} else {
			fraseTraducida = "No está en un dialecto de Javalandia";
		}

		return fraseTraducida;
	}

}