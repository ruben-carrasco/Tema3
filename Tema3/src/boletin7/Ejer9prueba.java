package boletin7;

import java.util.Scanner;

public class Ejer9prueba {
	public static void main(String[] args) {
		String frase;
		String fraseTraducida;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca un mensaje: ");
		frase = reader.nextLine();
		reader.nextLine();

		fraseTraducida = traductor(frase);

		System.out.println(fraseTraducida);

		reader.close();
	}

	public static String traductor(String frase) {
		String fraseTraducida = "";
		String separar = "";

		if (frase.indexOf("Javalín, javalón") == 0 && (frase.indexOf("  ") == 16 || frase.indexOf("\t\t") == 16)) {
			// Reemplazamos las muletillas con cadena vacía para eliminarlas
			separar = frase.replace("Javalín, javalón", "");
			// Quitamos espacios al comienzo / final de la cadena
			fraseTraducida = separar.trim();
		} else if (frase.indexOf("javalén, len, len") == frase.length() - 17
				&& (frase.lastIndexOf("  ") == (frase.length() - 19) || frase.lastIndexOf("\t\t") == (frase.length() - 19))) {
			// Reemplazamos las muletillas con cadena vacía para eliminarlas
			separar = frase.replace("javalén, len, len", "");
			// Quitamos espacios al comienzo / final de la cadena
			fraseTraducida = separar.trim();
			// Si no cumple con esas condiciones devuelve "No está en un dialecto de Javalandia"
		} else {
			fraseTraducida = "No está en un dialecto de Javalandia";
		}

		return fraseTraducida;
	}

}
