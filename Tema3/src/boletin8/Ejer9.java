package boletin8;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer9 {

    public static void main(String[] args) {
        // Mapa para almacenar los números ingresados por el usuario
        TreeMap<Integer, Integer> numeros = new TreeMap<>();
        // Mapa para almacenar las estrellas ingresadas por el usuario
        TreeMap<Integer, Integer> estrellas = new TreeMap<>();
        // Variable para almacenar los números ingresados por el usuario
        int numUsu;
        // Contador para contar cuántas veces se ingresa un número
        int cont = 0;
        // Variable para permitir volver a introducir una apuesta
        String repetir;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner reader = new Scanner(System.in);

        do {
            // Reiniciar contador al comenzar una nueva apuesta
            cont = 0;

            // Pedir al usuario que ingrese 5 números
            System.out.println("Introduzca 5 numeros: ");
            
            // Ciclo para pedir 5 números al usuario
            while (cont < 5) {
                numUsu = reader.nextInt();  // Leer el número ingresado
                cuentaNumeros(numUsu, numeros);  // Llamar a la función para agregar el número al mapa de números
                cont++;  // Incrementar el contador
            }

            // Mostrar el mapa de números con su frecuencia
            System.out.println(numeros);

            cont = 0;  // Reiniciar contador

            // Pedir al usuario que ingrese 2 estrellas
            System.out.println("Introduzca 2 estrellas");

            // Ciclo para pedir 2 estrellas al usuario
            while (cont < 2) {
                numUsu = reader.nextInt();  // Leer la estrella ingresada
                cuentaNumeros(numUsu, estrellas);  // Llamar a la función para agregar la estrella al mapa de estrellas
                cont++;  // Incrementar el contador
            }

            // Mostrar el mapa de estrellas con su frecuencia
            System.out.println(estrellas);

            reader.nextLine();  // Consumir el salto de línea

            // Preguntar al usuario si desea ingresar otra apuesta
            System.out.println("¿Introducir otra apuesta?: ");
            repetir = reader.nextLine().toLowerCase();  // Leer la respuesta y convertirla a minúsculas
        } while (repetir.equals("si"));  // Si la respuesta es "si", repetir el proceso

        // Cerrar el scanner
        reader.close();
    }

    // Función que añade el número al mapa
    public static void cuentaNumeros(int numUsu, TreeMap<Integer, Integer> mapa) {
        // Obtener el valor actual del número en el mapa (cantidad de veces que ha aparecido)
        Integer valor = mapa.get(numUsu);

        // Si el número no existe en el mapa, se agrega con valor 1
        if (valor == null) {
            mapa.put(numUsu, 1);
        } else {
            // Si el número ya existe, se incrementa su valor (frecuencia)
            mapa.put(numUsu, valor + 1);
        }
    }
}
