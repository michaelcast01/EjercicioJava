package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 50000;
        int opcion;

        // menu
        do {
            System.out.println("\n--- Cajero Automático ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Ingresar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1 -> {System.out.println("Su saldo es: $" + saldo);}
                case 2 -> {
                    System.out.print("Ingrese la cantidad a depositar: ");
                    int deposito = scanner.nextInt();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Su nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("Cantidad inválida.");
                    }
                }
                case 3 -> {System.out.print("Cantidad a retirar: ");
                    int retiro = scanner.nextInt();
                    if (retiro <= 0) {
                        System.out.println("Cantidad inválida.");
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Su nuevo saldo es: $" + saldo);}
                }
                case 4 -> {
                    System.out.println("Gracias por vistarnos.");
                }
                default -> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            }
        } while (opcion != 4);
        scanner.close();
    }
}