package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar dinero al usuario
        System.out.print("Ingrese la cantidad de dinero disponible: ");
        double dinero = sc.nextDouble();
        sc.nextLine();

        int comprasRealizadas = 0;
        boolean seguirComprando = true;

        while (seguirComprando && comprasRealizadas < 5) {
            // Mostrar menú
            System.out.println("\n===== PRODUCTOS DISPONIBLES =====");
            System.out.println("1. Galletas - $1000");
            System.out.println("2. Gomas - $2500");
            System.out.println("3. Chocolatinas - $1500");
            System.out.println("4. Cereal - $2800");
            System.out.println("5. SpeedMax - $2000");
            System.out.println("6. Salir");
            // Seleccione
            System.out.print("\nSeleccione un producto (número): ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    if (dinero >= 1000) {
                        dinero -= 1000;
                        System.out.println("Compró Galletas por $1000");
                        comprasRealizadas++;
                    } else {
                        System.out.println("No tiene suficiente dinero para Galletas.");
                    }
                }
                case 2 -> {
                    if (dinero >= 2500) {
                        dinero -= 2500;
                        System.out.println("Compró Gomas por $2500");
                        comprasRealizadas++;
                    } else {
                        System.out.println("No tiene suficiente dinero para Gomas.");
                    }
                }
                case 3 -> {
                    if (dinero >= 1500) {
                        dinero -= 1500;
                        System.out.println("Compró Chocolatinas por $1500");
                        comprasRealizadas++;
                    } else {
                        System.out.println("No tiene suficiente dinero para Chocolatinas.");
                    }
                }
                case 4 -> {
                    if (dinero >= 2800) {
                        dinero -= 2800;
                        System.out.println("Compró Cereal por $2800");
                        comprasRealizadas++;
                    } else {
                        System.out.println("No tiene suficiente dinero para Cereal.");
                    }
                }
                case 5 -> {
                    if (dinero >= 2000) {
                        dinero -= 2000;
                        System.out.println("Compró SpeedMax por $2000");
                        comprasRealizadas++;
                    } else {
                        System.out.println("No tiene suficiente dinero para SpeedMax.");
                    }
                }
                case 6 -> seguirComprando = false;
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
            // Mostrar dinero restante
            System.out.println("Dinero restante: $" + String.format("%.2f", dinero));
        }
        // Mensaje final
        System.out.println("\nGracias por su compra. Su cambio es: $" + String.format("%.2f", dinero));
        sc.close();
    }
}