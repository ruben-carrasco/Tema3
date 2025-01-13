package boletin7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		// Creamos la variable que almacenara la frase introducida por el usuario
		String frase;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario la frase
		System.out.println("Introduzca una frase: ");
		// Almacenamos la frase en minusculas dentro de la variable frase
		frase = reader.nextLine().toLowerCase();
		
		// Llamamos a la funcion
		cuentaLetras(frase);
		
		// Cerramos el Scanner
		reader.close();
	}
	
	//Funcion que cuenta las veces que aparece una letra y lo muestra por pantalla
	public static void cuentaLetras (String frase) {
		// Array que almacena todos los caracteres de la frase
		char[] caracteres;
		// Array que almacena todas las letras del abecedario
		char[] letras = new char[26];
		// Array que almacena el numero de veces que aparece cada letra
		int[] recuento = new int[26];
		
		// Rellenamos el array con las letras de la A a la Z
		for (int i = 0; i < letras.length; i++) {
			letras[i] = (char) ('a' + i);
		}
		
		// Pasamos la frase introducida como parametro de entrada a un array
		caracteres = frase.toCharArray();
		
		// 26 iteraciones, 1 para cada letra del abecedario
		for (int i = 0; i < letras.length; i++) {
			// Recorremos la frase
			for (int j = 0; j < caracteres.length; j++) {
				// Si aparece la letra dentro del array de la frase sumamos 1 al recuento de la letra
				if (caracteres[j] == letras[i]) {
					recuento[i] += 1;
				}
			}
			// Imprimimos el recuento de la letra si es mayor que 0
			if (recuento[i] > 0) {
				System.out.println(letras[i] + ": " + recuento[i] + (recuento[i] == 1 ? " vez" : " veces"));
			}
		}
	
		
	}
	
	
}
