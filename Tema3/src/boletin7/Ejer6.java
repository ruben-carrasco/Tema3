package boletin7;

public class Ejer6 {
	public static void main(String[] args) {
		String frase = "Dabale arroz a la zorra el abad";
		boolean palindroma;

		palindroma = esPalindroma(frase);

		System.out.println(palindroma ? "Es palindroma" : "No es palindroma");

	}

	public static boolean esPalindroma(String frase) {
		// Booleano para saber si es palindroma
		boolean palindroma = false;
		// Frase invertida
		String invertida = "";

		// Quitamos los espacios a la frase
		for (int i = 0; i < frase.length(); i++) {
			frase = frase.replace(" ", "");
		}

		// Quitamos los espacios a la frase
		for (int i = frase.length() - 1; i >= 0; i--) {
			invertida += frase.charAt(i);
		}

		// Comparamos si son iguales o no
		if (invertida.equalsIgnoreCase(frase)) {
			palindroma = true;
		}
		return palindroma;
	}
}
