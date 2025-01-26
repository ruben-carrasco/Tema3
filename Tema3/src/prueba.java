
public class prueba {
	public static void main(String[] args) {
		int[] tabla = {3,2,3,5,2,4,5,2};
		final char LETRA_A = 'A';
		
		// Imprimir letras como indice
		for (int i = 0; i < tabla.length; i++) {
			System.out.print((char) (LETRA_A + i) + tabla[i]);
			System.out.println();
			System.out.print(tabla[i]);	
		}
	}

}
