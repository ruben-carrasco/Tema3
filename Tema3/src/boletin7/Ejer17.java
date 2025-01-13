package boletin7;

import java.util.Scanner;

public class Ejer17 {
	public static void main(String[] args) {
		// Variable que recoge el codigo c
		String codigoC;
		// Variable que almacena el codigo sin comentarios
		String sinComent;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el codigo y lo guardamos en la variable
		System.out.println("Introduzca el codigo en c comentado: ");
		codigoC = reader.nextLine();
		
		//Quitamos los comentarios usando la funcion
		sinComent = quitaComent(codigoC);
		
		//Mostramos el resultado
		System.out.println(sinComent);
		
		// Cerramos el Scanner
		reader.close();
	}
	
	//Funcion que quita los comentarios
	public static String quitaComent(String codigoC) {
		// Variable que recoge al cadena sin los comentarios
		String noComents;
		
		// Quitamos los comentarios usando la siguiente expresion regular
		noComents = codigoC.replaceAll("/\\*.*?\\*/","").trim();
		
		return noComents;
	}

}
