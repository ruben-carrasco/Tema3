package boletin4part2;

public class Ejer4 {
	public static void main(String[] args) {
		// Creamos la tabla magica
		int[][] tablaMagica = {
			    {8, 1, 6},
			    {3, 5, 7},
			    {4, 9, 2}
			};
		// Variable booleana para almacenar el resultado de la funcion
		boolean magica;
		
		// Asignamos a la variable el resultado de la funcion
		magica = esMagica(tablaMagica);
		
		// Mostramos el resultado
		System.out.println(magica ? "La tabla es magica" : "La tabla no es magica");
		
	}
	
	public static boolean esMagica(int tabla[][]) {
		// Booleano para saber si es magica o no
		boolean magica = true;
		// Variable que recoge la suma total de fila anterior
		int sumaFilaAnterior = 0;
		// Variable que recoge la suma total de la fila actual de la iteracion
		int sumaFilaActual;
		// Variable que recoge la suma total de la columna anterior
		int sumaColumnaAnterior = 0;
		// Variable que recoge la suma total de la columna actual de la iteracion
		int sumaColumnaActual;
		
		// Recorremos la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Al comienzo de cada iteracion la suma de la fila y columna actual
			sumaFilaActual = 0;
			sumaColumnaActual = 0;
			for(int j = 0; j < tabla[i].length; j++) {
				// Hacemos la suma de cada fila y columna actual
				sumaFilaActual += tabla[i][j];
				sumaColumnaActual += tabla[j][i];
			}
			
			// Si estamos en la fila 1, inicializamos las variables al la primera suma de cada fila y columna
			if (i == 0) {
				sumaFilaAnterior = sumaFilaActual;
				sumaColumnaAnterior = sumaColumnaActual;
			}
			
			// Si en algún momento no coincide la suma de una fila con su anterior o de una columna, la tabla no es mágica
			if (sumaFilaActual != sumaFilaAnterior || sumaColumnaActual != sumaColumnaAnterior) {
				magica = false;
				
			}
			
			// Tras la comparacion actualizamos el valor de la Fila anterior con el de la actual
			sumaFilaAnterior = sumaFilaActual;
			sumaColumnaAnterior = sumaColumnaActual;
		}
		

		
		
		return magica;
	}

}
