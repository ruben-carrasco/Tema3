package boletin7;

import java.util.Scanner;

public class Ejer18 {
	public static void main(String[] args) {
		// Variable que recoge el titulo de la pagina
		String titulo;
		// Variable que recoge el contenido de la pagina
		String contenido;
		// Variable que recoge la pagina con el contenido
		String pagina;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		//Pedimos al usuario el titulo de la pagina y lo guardamos en la variable
		System.out.println("Introduzca el titulo de la pagina: ");
		titulo = reader.nextLine();
		
		//Pedimos al usuario el contenido de la pagina y lo guardamos en la variable
		System.out.println("Introduzca el contenido de la pagina: ");
		contenido = reader.nextLine();
		
		// Pasamos la funcion y almacenamos el resultado en la variable pagina
		pagina = html(titulo,contenido);
		
		System.out.println(pagina);
		
		// Cerramos el Scanner
		reader.close();
	}
	
	// Funcion que almacena el codigo html
	public static String html(String titulo, String contenido) {
		// String que contiene el codigo html
		String pagina = "<!DOCTYPE html>\r\n"
				+ "\r\n"
				+ "<html lang=\"es\"\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"utf-8\" />\r\n"
				+ "    <title>Ejer18</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>titulo</h1>\r\n"
				+ "    <p>contenido</p>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		// Reemplazamos con los parametros de entrada
		pagina = pagina.replace("titulo", titulo);
		pagina = pagina.replace("contenido", contenido);
		
		// Devolvemos el String
		return pagina;
	}
}
