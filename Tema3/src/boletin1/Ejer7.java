package boletin1;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		// Variable tabla
		int meses[] = new int[12];
		// Variable del mes que corresponde
		String mes;
		// Variable de la temperatura
		int temperatura;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos un for para rellenar la tabla
		for (int i = 0; i < meses.length; i++) {
			
			// Switch para nombrar cada mes
			mes = switch (i) {
			case 0 -> {yield "Enero";}
			case 1 -> {yield "Febrero";}
			case 2 -> {yield "Marzo";}
			case 3 -> {yield "Abril";}
			case 4 -> {yield "Mayo";}
			case 5 -> {yield "Junio";}
			case 6 -> {yield "Julio";}
			case 7 -> {yield "Agosto";}
			case 8 -> {yield "Septiembre";}
			case 9 -> {yield "Octubre";}
			case 10 -> {yield "Noviembre";}
			default -> {yield "Diciembre";}
			};
			
			// Pedimos la temperatura y la guardamos en la variable
			System.out.println("Introduzca la temperatura de " + mes);
			temperatura = reader.nextInt();
			
			// Rellenamos cada posicion con una temperatura
			meses[i] = temperatura;
			
		}
		
		// For para contruir el diagrama (cada linea)
		for (int i = 0; i < meses.length; i++) {
			
			// Switch para nombrar cada mes
			mes = switch (i) {
			case 0 -> {yield "Enero: ";}
			case 1 -> {yield "Febrero: ";}
			case 2 -> {yield "Marzo: ";}
			case 3 -> {yield "Abril: ";}
			case 4 -> {yield "Mayo: ";}
			case 5 -> {yield "Junio: ";}
			case 6 -> {yield "Julio: ";}
			case 7 -> {yield "Agosto: ";}
			case 8 -> {yield "Septiembre: ";}
			case 9 -> {yield "Octubre: ";}
			case 10 -> {yield "Noviembre: ";}
			default -> {yield "Diciembre: ";}
			};
			
			// Decimos el mes en cada linea
			System.out.print(mes);
			
			// Repetimos asteriscos tantas veces como la temperatura
			for (int j = 1; j <= meses[i]; j++) {
				System.out.print("*");
			}
			// Salto para cada linea
			System.out.println();
		}
		
		// Cerramos el Scanner
		reader.close();
				
	}

}
