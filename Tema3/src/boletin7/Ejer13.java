package boletin7;

import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		// Variable que recoge la palabra 1
				String palabra1;
				// Variable que recoge la palabra 2
				String palabra2;
				// Booleano para saber si son anagramas
				boolean anagrama;
				
				// Creamos el Scanner
				Scanner reader = new Scanner(System.in);
			
				// Pedimos una palabra al usuario y lo almacenamos en la variable
				System.out.println("Introduzca la palabra1: ");
				palabra1 = reader.nextLine();
				
				// Pedimos una palabra al usuario y lo almacenamos en la variable
				System.out.println("Introduzca la palabra2: ");
				palabra2 = reader.nextLine();
				
				// Almacenamos el resultado de la funcion
				anagrama = esAnagrama(palabra1,palabra2);
				
				// Mostramos el resultado
				System.out.println(anagrama ? "Es anagrama" : "No es anagrama");
				
				// Cerramos el Scanner
				reader.close();
	}
	
	public static boolean esAnagrama (String palabra1,String palabra2) {
		// Booleano que almacena si es anagrama o no
		boolean anagrama = true;
		// Index de palabra2 para recorrer cada caracter
		int index = 0;
		// Si no tienen la misma longitud no son anagrama
		if (palabra1.length() != palabra2.length()) {
			anagrama = false;
			// Si la tienen comprobamos que todos los caracteres de palabra2 se encuentren en palabra1
		} else {
			while (anagrama && index < palabra1.length()) {
				// Si un caracter de palabra2 no se encuentra en palabra1 no es anagrama
				if (palabra1.indexOf(palabra2.charAt(index)) == -1) {
					anagrama = false;
				}
				index++;
			}
		}
		
		return anagrama;
	}
	
	

}
