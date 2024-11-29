package boletin5;

import java.util.Arrays;

public class Ejer4 {
	public static void main(String[] args) {
		char tabla[][];
		
		tabla = ajedrez(4,4,'T');
		
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
		
		//Linea hacia arriba
		for(int i = posFila - 1, j = posColumna; i >= 0; i--) {
			tablero[i][j] = MOVIMIENTO;
		}
		
		//Linea hacia abajo
		for(int i = posFila + 1, j = posColumna; i < tablero.length; i++) {
			tablero[i][j] = MOVIMIENTO;
		}
		
		// Linea hacia la izquierda
		for(int i = posFila, j = posColumna - 1; j >= 0; j--) {
			tablero[i][j] = MOVIMIENTO;
		}
		
		// Linea hacia la derecha
		for (int i = posFila, j = posColumna + 1; j < tablero.length; j++) {
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
		
		
		
		
		
		
		// Ponemos la pieza en su posición
		tablero[posFila][posColumna] = DAMA;

		return tablero;
	}

	// Función para el caballo
	public static char[][] caballo(int posFila, int posColumna) {
		// Creamos el tablero
		char tablero[][] = new char[8][8];
		final char CABALLO = 'C';
		
		// Ponemos la pieza en su posición
		tablero[posFila][posColumna] = CABALLO;

		return tablero;
	}

}
