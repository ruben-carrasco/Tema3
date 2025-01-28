package boletin8part2;

import java.util.TreeMap;

public class Ejer3 {
	public static void main(String[] args) {
		// Mapa que almacena las letras que aparecen y la frecuencia
		TreeMap<String, Integer> frecuenciaLetras = new TreeMap<>();
		// Cadena de texto
		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		// Variable que almacena cada caracter de la frase
		char caracter;
		// variable que almacena valor de la clave del mapa
		int valor;
			
		// for para recorrer la frase
		for (int i = 0; i < texto.length(); i++) {
			// Asignamos a caracter el charAt de la frase
			caracter = texto.toUpperCase().charAt(i);
			
			// Si el caracter es una letra
			if (Character.isLetter(caracter)) {
				// Si el mapa ya contiene la letra
				if (frecuenciaLetras.containsKey("" + caracter)) {
					// Obtenemos el valor de la letra
					valor = frecuenciaLetras.get("" + caracter);
					// Le sumamos 1
					frecuenciaLetras.put("" + caracter, valor + 1);
				} else { // Si no la tiene, añadimos la letra y valor 1
					frecuenciaLetras.put("" + caracter, 1);
				}
			}
		}
		
		// Imprimimos el resultado
		System.out.println(frecuenciaLetras);
	}

}
