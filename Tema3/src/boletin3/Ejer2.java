package boletin3;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Creamos la tabla para almacenar las notas
		double notas[][] = new double[4][5];
		// Creamos la variable que recoge la nota
		double nota;
		// Nota minima
		double min;
		// Nota máxima
		double max;
		// Suma notas
		double suma;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Preguntamos por las notas a cada usuario
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				// En cada posicion de la tabla pedimos una nota y la guardamos en la variable nota
				System.out.println("Introduzca la nota " + (j + 1) + " del alumno " + (i + 1) + ": ");
				nota = reader.nextDouble();
				// Guardamos el valor de nota en la posición
				notas[i][j] = nota;
			}
		}

		// Imprimimos la tabla, juntos con el minimo, maximo y media
		for (int i = 0; i < notas.length; i++) {
			// Inicializamos las variables al comienzo de cada bucle
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			suma = 0;
			
			// Mostramos el alumno al que pertenecen las notas de cada fila
			System.out.print("Alumno \t" + (i + 1) + "\t");
			
			// for para las columnas de cada fila
			for (int j = 0; j < notas[i].length; j++) {
				
				// Imprimimos las notas de cada alumno
				System.out.print(notas[i][j] + "\t");
				
				// Buscamos el valor minimo y el valor maximo
				if (notas[i][j] < min) {
					min = notas[i][j];
				} else if (notas[i][j] > max) {
					max = notas[i][j];
				}
				
				// Calculamos la suma de toda la fila
				suma += notas[i][j];
			}
			
			// Mostramos los resultados
			System.out.print("Nota minima: " + min);
			System.out.print(" Nota maxima: " + max);
			System.out.print(" Nota media: " + (suma/5));
			System.out.println();
		}
		
		// Cerramos el Scanner
		reader.close();
	}
}
