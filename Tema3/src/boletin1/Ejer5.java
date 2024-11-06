package boletin1;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// VAriable de la tabla
		double tabla[] = new double[12];
		// Variable del numero introducido por el usuario
		double n;
		// Variable para la suma total
		double suma = 0;
		// Variable numero maximo
		double max = Integer.MIN_VALUE;
		// Variable numero minimo
		double min = Integer.MAX_VALUE;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// COn for asignamos los valores a la tabla
		for (int i = 0; i < tabla.length; i++) {
			// PEdimos el numero al usuario y lo guardamos en la variable
			System.out.println("Introduzca un numero: ");
			n = reader.nextDouble();
			
			// Vamos guardando cada numero en una posicion
			tabla[i] = n;
		}
		
		// Pedimos los numeros y vamos sumando
		for (double numero: tabla) {
			// Suma
			suma += numero;
			// Valor maximo
			// Valor max
			if (numero > max) {
				max = numero;
			} 
			// Valor minimo
			if (numero < min) {
				min = numero;
			}
			
		}
		
		// Mostramos los resultados
		System.out.println("La suma total es: " + suma);
		System.out.println("El maximo valor es " + max + " y el minimo " + min);
		
		// Cerramos el Scanner
		reader.close();
	}

}
