package english;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// We create the array which stores the intergers
		int table[] = new int[10];
		// Variable which storage the user option.
		String option;
		// Variable which storage the value of the array position
		int v;
		// Variable which storage the position
		int p;
		
		// We create the Scanner
		Scanner reader = new Scanner(System.in);
		
		// If the answer is not c
		do {
			// We create the menu
			System.out.println("MENU");
			System.out.println();
			System.out.println("a. Show values");
			System.out.println("b. Introduce a value");
			System.out.println("c. Exit");
			System.out.println();
			
			// We request an option to the user
			System.out.print("Introduce an option: ");
			option = reader.next();
			
			// Switch for each option
			switch (option) {
				case "a" -> {
					// It shows the array values
					System.out.println("Values: " + Arrays.toString(table));
					System.out.println();
				}
				case "b" -> {
					// Ask for a value and storage into the variable
					System.out.println("Introduce a value: ");
					v = reader.nextInt();
					
					// Ask for a position and storage into the variable
					System.out.println("Introduce a position: ");
					p = reader.nextInt();
					
					// We assign v value to the p position
					table[p] = v;
					
					System.out.println();
				}
				case "c" -> {
					System.out.println("Saliendo...");
				}
				default -> {
					System.out.println("Introduzca una opcion del menu.");
					System.out.println();
				}
			}
			
		} while (!option.equals("c"));
		
		// We close the Scanner
		reader.close();
	}

}
