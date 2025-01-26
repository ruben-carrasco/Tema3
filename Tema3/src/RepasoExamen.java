import java.util.Arrays;
import java.util.Random;

public class RepasoExamen {
	public static void main(String[] args) {
		char tabla[][] = new char[12][11];

		// Rellenamos la tabla
		rellenarTabla(tabla, '-');

		imprimirTablero(tabla);
	}

	// Funcion para rellenar la tabla
	public static char[][] rellenarTabla(char tabla[][], char contenido) {
		// Rellenamos la tabla
		for (int i = 0; i < tabla.length; i++) {
			Arrays.fill(tabla[i], contenido);
		}

		return tabla;
	}

	// Funcion para imprimir tablero con indices
	public static void imprimirTablero(char tabla[][]) {
		final char LETRA_A = 'A';
		
		// Imprimir indice de las columnas
		//Tabulador
		System.out.print("\t");
		//Letras
		for (int j = 0; j < tabla[0].length; j++) {
			System.out.print((char) (LETRA_A + j) + "\t");
		}
		System.out.println();
		
		// Imprimir filas con sus indices
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(i + 1 + "\t");
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
