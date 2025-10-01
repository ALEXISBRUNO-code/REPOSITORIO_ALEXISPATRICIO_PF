package Programa;
import java.util.Scanner;

public class PROYECTO_FINAL_ALEXIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la primera compra: ");
        double compra1 = sc.nextDouble();

        System.out.print("Ingrese la segunda compra: ");
        double compra2 = sc.nextDouble();

        System.out.print("Ingrese la tercera compra: ");
        double compra3 = sc.nextDouble();

        // Calculos
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Salida
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Total compras: " + totalCompras);
        System.out.println("Promedio compras: " + promedioCompras);
    

    }
    
}
