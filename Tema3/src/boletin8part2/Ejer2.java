package boletin8part2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejer2 {
	public static void main(String[] args) {
		// Conjunto que almacena los numeros enteros random
		LinkedHashSet<Integer> numerosRandom = new LinkedHashSet<>();
		
		// Creamos el Random
		Random rand = new Random();
		
		// Bucle para almacenar numeros random
		while (numerosRandom.size() < 10) {
			numerosRandom.add(rand.nextInt(1,21));
		}
		
		// Mostramos el resultado
		System.out.println(numerosRandom);
	}

}
