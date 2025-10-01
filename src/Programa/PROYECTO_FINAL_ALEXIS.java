package Programa;

import java.util.Scanner;

public class PROYECTO_FINAL_ALEXIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        // Validación de entrada: evita errores si el usuario ingresa texto en vez de números.
        double compra1;
        while (true) {
            System.out.print("Ingrese la primera compra: ");
            if (sc.hasNextDouble()) {
                compra1 = sc.nextDouble();
                if (compra1 >= 0) break;
                else System.out.println("El monto no puede ser negativo.");
            } else {
                System.out.println("Entrada invalida. Por favor ingrese un numero.");
                sc.next(); // limpiar entrada incorrecta
            }
        }

        double compra2;
        while (true) {
            System.out.print("Ingrese la segunda compra: ");
            if (sc.hasNextDouble()) {
                compra2 = sc.nextDouble();
                if (compra2 >= 0) break;
                else System.out.println("El monto no puede ser negativo.");
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número.");
                sc.next();
            }
        }

        double compra3;
        while (true) {
            System.out.print("Ingrese la tercera compra: ");
            if (sc.hasNextDouble()) {
                compra3 = sc.nextDouble();
                if (compra3 >= 0) break;
                else System.out.println("El monto no puede ser negativo.");
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número.");
                sc.next();
            }
        }

        // Cálculos
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Salida
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Total compras: " + totalCompras);
        System.out.println("Promedio compras: " + promedioCompras);

        sc.close();
    }
}
