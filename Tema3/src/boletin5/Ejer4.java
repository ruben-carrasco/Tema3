package boletin5;

import java.util.Arrays;

public class Ejer4 {
	public static void main(String[] args) {
		// Creamos una variable para almacenar el resultado del ajedrez
		char tabla[][];

		// Asignamos el tablero resultante a la variable tabla
		tabla = ajedrez(4, 4, 'C');

		// Imrprimimos el tablero
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}

	}

	// Función general para elegir pieza
	public static char[][] ajedrez(int posFila, int posColumna, char pieza) {
		// Variable tablero donde mostraremos el resultado
		char tablero[][] = new char[8][8];

		// Elegimos de que pieza queremos ver los movimientos
		switch (pieza) {
		case 'T' -> {
			tablero = torre(posFila, posColumna);
		}
		case 'A' -> {
			tablero = alfil(posFila, posColumna);
		}
		case 'D' -> {
			tablero = dama(posFila, posColumna);
		}
		case 'C' -> {
			tablero = caballo(posFila, posColumna);
		}
		}

		return tablero;
	}

	// Función para la torre
	public static char[][] torre(int posFila, int posColumna) {
		// Creamos el tablero
		char tablero[][] = new char[8][8];
		// Constante para la pieza
		final char TORRE = 'T';
		// Constante para los movimientos
		final char MOVIMIENTO = 'X';

		// Linea vertical
		for (int i = 0, j = posColumna; i < 8; i++) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Linea horizontal
		for (int i = posFila, j = 0; j < 8; j++) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Ponemos la pieza en su posición
		tablero[posFila][posColumna] = TORRE;

		return tablero;
	}

	// Función para el alfil
	public static char[][] alfil(int posFila, int posColumna) {
		// Creamos el tablero
		char tablero[][] = new char[8][8];
		// Constante para la pieza
		final char ALFIL = 'A';
		// Constante para el movimiento
		final char MOVIMIENTO = 'X';

		// Movimiento diagonal: arriba izquierda
		for (int i = posFila - 1, j = posColumna - 1; i >= 0 && j >= 0; i--, j--) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Movimiento diagonal: arriba derecha
		for (int i = posFila - 1, j = posColumna + 1; i >= 0 && j < 8; i--, j++) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Movimiento diagonal: abajo izquierda
		for (int i = posFila + 1, j = posColumna - 1; i < 8 && j >= 0; i++, j--) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Movimiento diagonal: abajo derecha
		for (int i = posFila + 1, j = posColumna + 1; i < 8 && j < 8; i++, j++) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Ponemos la pieza en su posición
		tablero[posFila][posColumna] = ALFIL;

		return tablero;
	}

	// Función para la dama
	public static char[][] dama(int posFila, int posColumna) {
		// Creamos el tablero
		char tablero[][] = new char[8][8];
		// Constante para la pieza
		final char DAMA = 'D';
		// Constante para el movimiento
		final char MOVIMIENTO = 'X';

		// Movimiento diagonal: arriba izquierda
		for (int i = posFila - 1, j = posColumna - 1; i >= 0 && j >= 0; i--, j--) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Movimiento diagonal: arriba derecha
		for (int i = posFila - 1, j = posColumna + 1; i >= 0 && j < 8; i--, j++) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Movimiento diagonal: abajo izquierda
		for (int i = posFila + 1, j = posColumna - 1; i < 8 && j >= 0; i++, j--) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Movimiento diagonal: abajo derecha
		for (int i = posFila + 1, j = posColumna + 1; i < 8 && j < 8; i++, j++) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Linea vertical
		for (int i = 0, j = posColumna; i < 8; i++) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Linea horizontal
		for (int i = posFila, j = 0; j < 8; j++) {
			tablero[i][j] = MOVIMIENTO;
		}

		// Ponemos la pieza en su posición
		tablero[posFila][posColumna] = DAMA;

		return tablero;
	}

	// Función para el caballo
	public static char[][] caballo(int posFila, int posColumna) {
		// Creamos el tablero
		char tablero[][] = new char[8][8];
		// Constante para la pieza
		final char CABALLO = 'C';
		// Constante para el movimiento
		final char MOVIMIENTO = 'X';
		
		//Posición de las piezas
		for (int i = -2; i <= 2; i += 4) {
			for (int j = -1; j <= 1; j += 2) {
				//Comprobamos límites
				if (posFila + i < tablero.length && posColumna + j < tablero.length && posFila + i >= 0
						&& posColumna + j >= 0) {

					tablero[posFila + i][posColumna + j] = MOVIMIENTO;

				}
				//Comprobamos límites
				if (posFila + j >= 0 && posColumna + i >= 0 && posFila + j < tablero.length
						&& posColumna + i < tablero.length)

					tablero[posFila + j][posColumna + i] = MOVIMIENTO;
			}

		}

		// Ponemos la pieza en su posición
		tablero[posFila][posColumna] = CABALLO;

		return tablero;
	}

}
