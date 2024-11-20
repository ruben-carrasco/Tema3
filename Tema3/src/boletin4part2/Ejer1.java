package boletin4part2;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
	public static void main(String[] args) {
		// Creamos un array bidimencional de 6 filas por 10 columnas
		int tabla[][] = new int[6][10];
		// Tabla para recoger los valores mínimo y máximo
		int minMax[] = new int[2];
		
		// Creamos el Random
		Random rand = new Random();
		
		// for para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(0,1001);
			}
		}
		
		// Asignamos a minMax el resultado de la función
		minMax = valoresMaxMin(tabla);
		
		// Mostramos el resultado
		System.out.println(Arrays.toString(minMax));
		

	}

	//Funcion que devuelve los valores mínimo y máximos de una tabla bidimencional
	public static int[] valoresMaxMin(int t[][]) {
		// Variable para recoger el mínimo y el máximo
		int minMax[] = new int[2];
		// Variable para almacenar el valor mínimo
		int min = Integer.MAX_VALUE;
		// Variable para almacenar el valor máximo
		int max = Integer.MIN_VALUE;
		
		// for para recorrer la tabla bidimensional
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				if (t[i][j] < min) {
						min = t[i][j];
				} 

				if (t[i][j] > max) {
					max = t[i][j];
				}		
			}
		}
		
		// Asignamos a la primera posición de la tabla el valor min
		minMax[0] = min;
		// Asignamos a la segunda posición de la tabla el valor max
		minMax[1] = max;
		
	return minMax;
}

	
	
	
	
	
	
	
	
	/* Funcion para comprobar que el numero es entero positivo
	public static String error(int n) {
		// Variable para el bucle del error
		boolean error;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		do {
			try {
				System.out.println("Introduzca un numero positivo: ");
				n = reader.nextInt();
				assert n > 0 : "El numero debe ser positivo";
				error = false;
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;
			} catch (InputMismatchException e) {
				System.err.println("El numero no es entero");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Cerramos el Scanner
		reader.close();
		
		return "Numero introducido correctamente";
	}
*/
}
