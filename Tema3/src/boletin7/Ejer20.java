package boletin7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer20 {
	public static void main(String[] args) {
		// Variable que recoge la palabra
		String palabra;
		// Variable que recoge la secuencia
		int secuencia;
		// Variable que recoge el resultado
		String[] resultado;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario la palabra y la almacenamos en la variable
		System.out.println("Introduzca la palabra: ");
		palabra = reader.nextLine();
		
		// Pedimos al usuario la secuencia y la almacenamos en la variable
		System.out.println("Introduzca la secuencia: ");
		secuencia = reader.nextInt();
		
		// Pasamos la funcion
		resultado = divide(palabra,secuencia);
		
		// Mostramos el resultado
		System.out.println(Arrays.toString(resultado));
		
		// Cerramos el Scanner
		reader.close();
	}
	
	// Funcion que divide la palabra segun la secuencia
	public static String[] divide(String palabra, int secuencia) {
		String[] dividida = new String[(palabra.length() / secuencia)];
		int inicioSubcadena = 0;
		
		for (int i = 0; i < dividida.length; i++) {
			dividida[i] = palabra.substring(inicioSubcadena,inicioSubcadena + secuencia);
			inicioSubcadena += secuencia;
		}
		
		return dividida;
	}
	
}
