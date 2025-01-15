package boletin8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Creamos el Array
		ArrayList<Integer> numerosRandom = new ArrayList<>();
		// Variable que almacena el tamaño del ArrayList
		int tamaño;
		// Variable que recoge la suma
		int suma = 0;
		// Variable que recoga la media
		double media;
		// Variable que recoge el maximo
		int maximo = Integer.MIN_VALUE;
		// Variable que recoge el minimo
		int minimo = Integer.MAX_VALUE;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos el Random
		Random rand = new Random();

		// Declaramos el tamaño del arrayList
		tamaño = rand.nextInt(5, 11);

		// Mientras no tenga el tamaño añadimos numeros
		while (numerosRandom.size() < tamaño) {
			// Añadimos numeros random entre 0 y 100
			numerosRandom.add(rand.nextInt(0, 101));
		}
		
		// Recorremos el Array
		for (int i : numerosRandom) {
			System.out.print(i + "\t");
			// SUMA
			suma += i;
			// MAXIMO
			if (i > maximo) {
				maximo = i;
			}
			// MINIMO
			if (i < minimo) {
				minimo = i;
			}
		}
		
		// Realizamos la media
		media = (double) suma / tamaño;
		
		System.out.println();
		
		// Mostramos los resultados
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Maximo: " + maximo);
		System.out.println("Minimo: " + minimo);
		
		// Cerramos el Scanner
		reader.close();
	}

}
