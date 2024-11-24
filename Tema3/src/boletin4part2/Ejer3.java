package boletin4part2;

public class Ejer3 {
	
	public static void main(String[] args) {
		// Creamos una tabla simetrica
		int tabla[][] = {
			    {1, 2, 3},
			    {2, 4, 5},
			    {3, 5, 6}
			};
		// Variable para almacenar si es simetrica o no
		boolean simetrica;
		
		// Asignamos a simetrica el resultado de la funcion
		simetrica = esSimetrica(tabla);
		
		// Mostramos el resultado
		System.out.println(simetrica ? "La tabla es simetrica" : "La tabla no es simetrica");
	}

	public static boolean esSimetrica (int[][] t) {
		boolean simetrica = true;
		
		// Recorremos la tabla
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				// Si t[i][j] no es igual a t[j][i]
				if (t[i][j] != t[j][i]) {
					simetrica = false;
				}
			}
		}
		
		return simetrica;
	}
	
}
