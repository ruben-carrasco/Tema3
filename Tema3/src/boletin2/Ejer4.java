package boletin2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Tabla de las puntuaciones, cada posicion es un jugador
		int players[] = new int[8];
		// Tabla de las puntuaciones ordenadas
		int orderer[] = new int[8];
		// Variable para almacenar cada puntuacion
		int points;
		// Variable para almacenar la posicion de la tabla
		int p;
		// Variable para almacenar la poscion de las puntuaciones ordenadas
		int pOrderer;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// For para pedir las 8 puntuaciones, asigna una puntuacion a cada posicion del
		// array
		for (int i = 0; i < players.length; i++) {
			System.out.println("Introduzca la puntuacion del jugador " + (i + 1));
			points = reader.nextInt();

			players[i] = points;
		}

		// Ordenamos en orden creciente
		Arrays.sort(players);

		// Ordenamos en orden decreciente
		p = players.length - 1;
		pOrderer = 0;
		while (p >= 0) {
			orderer[pOrderer] = players[p];
			p--;
			pOrderer++;

		}

		// Mostramos la tabla ordenada
		System.out.println(Arrays.toString(orderer));

		// Cerramos el Scanner
		reader.close();
	}

}
