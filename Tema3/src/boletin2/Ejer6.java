package boletin2;

import java.io.Reader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Array de la primitiva generada
		int primitiva[] = new int[6];
		// Array de la primitiva ganadora
		int ganadora[] = {21, 32, 12, 5, 28, 8};
		// Contador de aciertos
		int aciertos = 0;
		
		// Creamos el Scanner y el Random
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		
		// Ordenamos la combinacion ganadora
		Arrays.sort(ganadora);
		
		// Mostramos la combinacion ganadora
		System.out.println("La combinacion ganadora es: " + Arrays.toString(ganadora));
		
		// Creacion primitiva
		for (int i = 0; i < primitiva.length; i++) {
			primitiva[i] = rand.nextInt(1,50);
		}
		
		// Mostramos la primitiva
		System.out.println("Tu primitiva es: " + Arrays.toString(primitiva));
		
		// Contamos los aciertos
		for (int i = 0; i < primitiva.length; i++) {
			if (primitiva[i] == ganadora[i]) {
				aciertos++;
			}
		}
		
		// Mostramos el numero de aciertos
		System.out.println("Tienes " + aciertos + " aciertos");
		
		// Cerramos el Scanner
		reader.close();
	}

}
