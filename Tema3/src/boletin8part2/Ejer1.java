package boletin8part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejer1 {
	public static void main(String[] args) {
		// Lista que almacenara numeros enteros
		ArrayList<Integer> numEnteros = new ArrayList<>();
		// Contador de numeros
		int numero = 1;
		
		// Añadimos 10 numeros
		while (numEnteros.size() < 10) {
			numEnteros.add(numero);
			numero++;
		}
		
		// Se muestra la lista original
		System.out.println(numEnteros);
		
		// Mezclamos
		Collections.shuffle(numEnteros);
		
		// Se muestra lista desordenada
		System.out.println(numEnteros);
		
		
	}

}
