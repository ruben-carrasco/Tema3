package boletin8;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        // Mapa que almacena productos (nombre del producto como clave y precio como valor)
        HashMap<String, Integer> productos = new HashMap<>();
        
        // Variable que almacena la opción seleccionada por el usuario
        int option;
        
        // Variable booleana para controlar cuándo salir del programa
        boolean salir = false;
        
        // Variables para almacenar el nombre y precio del producto
        String nombre;
        int precio;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner reader = new Scanner(System.in);

        // Bucle principal que se ejecuta mientras el usuario no seleccione salir
        while (!salir) {
            // Mostrar el menú de opciones
            System.out.println("Productos");
            System.out.println();
            System.out.println("1. Alta de producto");
            System.out.println("2. Baja de producto");
            System.out.println("4. Listar existencias");
            System.out.println("0. Salir");
            System.out.println();

            // Leer la opción seleccionada por el usuario
            System.out.println("Introduzca una opcion: ");
            option = reader.nextInt();

            // Consumir el salto de línea que queda después de leer un número
            reader.nextLine();

            // Ejecutar la acción correspondiente según la opción seleccionada
            switch (option) {
                case 1 -> {
                    // Opción 1: Alta de un nuevo producto
                    System.out.println("Nombre del producto: ");
                    nombre = reader.nextLine();  // Leer el nombre del producto
                    System.out.println("Precio: ");
                    precio = reader.nextInt();  // Leer el precio del producto
                    productos.put(nombre, precio);  // Agregar el producto al mapa
                }
                case 2 -> {
                    // Opción 2: Baja de un producto existente
                    System.out.println("Nombre del producto que desea eliminar");
                    nombre = reader.nextLine();  // Leer el nombre del producto a eliminar
                    productos.remove(nombre);  // Eliminar el producto del mapa
                }
                case 4 -> {
                    // Opción 4: Listar todos los productos con su precio
                    System.out.println(productos);  // Mostrar todos los productos en el mapa
                }
                default -> {
                    // Si se ingresa una opción no válida, salir del programa
                    salir = true;
                }
            }
        }

        // Cerrar el scanner para liberar recursos
        reader.close();
    }
}

