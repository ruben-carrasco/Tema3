package boletin8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		//Creamos la lista
		ArrayList<Integer> numerosPositivos = new ArrayList<>();
		// Variable que almacena los numeros introducidos por el usuario
		int numeros;
		
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un numero
		System.out.println("Introduzca un numero entero positivo: ");
		numeros = reader.nextInt();
		
		// Mientras el numero introducido sea positivo
		while(numeros > 0) {
			//Añadimos el numero al ArrayList
			numerosPositivos.add(numeros);
			//Pedimos al usuario que introduzca un numero de nuevo
			System.out.println("Introduzca un numero entero positivo: ");
			numeros = reader.nextInt();
		}
		
		//Lo imprimimos
		for (int i : numerosPositivos) {
			System.out.println(i);
		}
		
		// Cierro el Scanner
		reader.close();
		
	}

}
