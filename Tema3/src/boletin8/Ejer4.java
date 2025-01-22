package boletin8;

import java.util.Random;
import java.util.TreeSet;

public class Ejer4 {
	public static void main(String[] args) {
		// Creamos un conjunto para almacenar de forma ordenada y sin duplicados
		TreeSet<Integer> numIntRand = new TreeSet<>();
		
		// Creamos el Random
		Random rand = new Random();
		
		// Añade numeros random menores que 100 hasta que el tamaño sea 20
		while (numIntRand.size() < 20) {
			numIntRand.add(rand.nextInt(1,100));
		}
		
		// Imprimimos el resultado
		System.out.println(numIntRand);
		
		
	}

}
