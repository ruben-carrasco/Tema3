package boletin7;

public class Ejer4 {
	public static void main(String[] args) {
		// Variable de la frase a invertir
		String frase = "Hola a todos";
		// Variable de la frase invertida
		String invertida;
		
		// Almacenamos en invertida la frase invertida tras llamar a la funcion
		invertida = invertirFrase(frase);
		
		// Mostramos la frase
		System.out.println(invertida);
	}
	
	public static String invertirFrase(String frase) {
		String invertida = "";
		
		// recorremos la frase de forma inversa
		for (int i = frase.length() - 1; i >= 0; i--) {
			// vamos añadiendo a invertida cada valor
			invertida += frase.charAt(i);
		}
		return invertida;
	}

}
