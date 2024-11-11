package english;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// VAriable for the array
		int table[];
		// VAriable for the length array
		int length;
		// Variable for the array value
		int value;
		// Variable for the increases
		int increases;
		
		// create Scanner
		Scanner reader = new Scanner(System.in);
		
		// We ask the for the length and storage it
		System.out.println("Introduce the quantity of numbers: ");
		length = reader.nextInt();
		
		// We assigh the length to the array
		table = new int[length];
		
		// Initial value
		System.out.println("Introduce the value of first number: ");
		value = reader.nextInt();
		
		// First value = value introduced by the user
		table[0] = value;
		
		// Increases
		System.out.println("Introduce the increases of a value: ");
		increases = reader.nextInt();
		
		// We build the array
		for (int i = 1; i < table.length; i++) {
			table[i] = table[i-1] + increases;
		}
		
		// Final result
		System.out.println(Arrays.toString(table));
		
		// Close Scanner
		reader.close();
	}

}
