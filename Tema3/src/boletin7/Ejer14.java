package boletin7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		String frase;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		frase = reader.nextLine().toLowerCase().replace(" ", "");
		
		reader.close();
	}
	
	public static void cuentaCaracter (String frase) {
		char[] caracteres;
		caracteres = frase.toCharArray();
		Arrays.sort(caracteres);
		
		for (int i = 0; i < caracteres.length; i++) {
			if ()
		}
	}
	
	
}
