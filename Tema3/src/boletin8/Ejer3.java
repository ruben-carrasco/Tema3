package boletin8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejer3 {
	public static void main(String[] args) {
		// Creamos la colección que almacenará los 30 numeros aleatorios
		ArrayList<Integer> numerosRand = new ArrayList<>();
		
		// Creamos el Random
		Random rand = new Random();
		
		//Recorremos el Array 30 veces
		while (numerosRand.size() < 30) {
			numerosRand.add(rand.nextInt(1,11));
		}
		
		//Ordenamos la colección
		Collections.sort(numerosRand);
		
		// Pintamos la colección
		System.out.println(numerosRand);
	}

}
