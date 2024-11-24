package boletin4part2;

public class Ejer4 {
	public static void main(String[] args) {
		int[][] tablaMagica = {
			    {8, 1, 6},
			    {3, 5, 7},
			    {4, 9, 2}
			};
		
		boolean magica;
		
		magica = esMagica(tablaMagica);
		
		System.out.println(magica ? "La tabla es magica" : "La tabla no es magica");
		
	}
	
	public static boolean esMagica(int tabla[][]) {
		boolean magica = true;
		int sumaFila = 0;
		int sumaFilaActual;
		int sumaColumna = 0;
		int sumaColumnaActual;
		
		// Recorremos la tabla
		for (int i = 0; i < tabla.length; i++) {
			sumaFilaActual = 0;
			sumaColumnaActual = 0;
			for(int j = 0; j < tabla[i].length; j++) {
				sumaFilaActual += tabla[i][j];
				sumaColumnaActual += tabla[j][i];
			}
			
			if (i == 0) {
				sumaFila = sumaFilaActual;
				sumaColumna = sumaColumnaActual;
			}
			
			if (sumaFilaActual != sumaFila || sumaColumna != sumaColumnaActual) {
				magica = false;
				
			}
			
			sumaFila = sumaFilaActual;
			sumaColumna = sumaColumnaActual;
		}
		

		
		
		return magica;
	}

}
