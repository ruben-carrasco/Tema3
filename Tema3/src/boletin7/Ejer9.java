package boletin7;

import java.util.Scanner;

public class Ejer9 {
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
		String[] separar;

		if (frase.indexOf("Javalín, javalón") == 0) {
			separar = frase.split("  ");
			separar = frase.split("\t\t");
			fraseTraducida = separar[separar.length - 1].trim();
			
		} else if (frase.indexOf("javalén, len, len") == frase.length() - 17) {
			separar = frase.split("  ");
			separar = frase.split("\t\t");
			fraseTraducida = separar[0].trim();
			
		} else {
			fraseTraducida = "No está en un dialecto de Javalandia";
		}

		return fraseTraducida;
	}

}
