package boletin7;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Creamos las variables para cada frase
		String frase1;
		String frase2;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos la primera frase y la guardamos en la variable frase1
		System.out.println("Introduzca la primera frase: ");
		frase1 = reader.nextLine();

		// Pedimos la segunda frase y la guardamos en la variable frase2
		System.out.println("Introduzca la segunda frase: ");
		frase2 = reader.nextLine();

		// Obtenemos la longitud con .length y comprobamos con if cual es menor o si son
		// iguales
		if (frase1.length() < frase2.length()) {
			System.out.println("La primera frase es menor");
		} else if (frase2.length() < frase1.length()) {
			System.out.println("La segunda frase es menor");
		} else {
			System.out.println("Tienen la misma longitud");
		}

		// Cerramos el Scanner
		reader.close();
	}

}
