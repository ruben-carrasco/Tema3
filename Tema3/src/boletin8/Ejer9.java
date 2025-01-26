package boletin8;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer9 {
	
	public static void main(String[] args) {

		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();
		int numUsu;
		int cont = 0;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca 5 numeros: ");

		while (cont < 5) {
			numUsu = reader.nextInt();
			cuentaNumeros(numUsu, numeros);
			cont++;
		}
		
			System.out.println(numeros);
			
			cont = 0;
			
			System.out.println("Introduzca 2 estrellas");
			while (cont < 2) {
				numUsu = reader.nextInt();
				cuentaNumeros(numUsu, estrellas);
				cont++;
			}
			
			System.out.println(estrellas);

			reader.close();

		}
	
		public static void cuentaNumeros(int numUsu, TreeMap<Integer,Integer> mapa) {
			if (mapa.get(numUsu) == null) {
				mapa.put(numUsu, 1);
			} else {
				mapa.put(numUsu, mapa.get(numUsu) + 1);
			}
		}

	}

