package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean activo = true;
        while (activo) {

            // Menú principal
            System.out.println("\nTEMPERATURA (Solo C, F, K)");
            System.out.println("1. Fahrenheit a Celsius");
            System.out.println("2. Celsius a Fahrenheit");
            System.out.println("3. Celsius a Kelvin");
            System.out.println("4. Kelvin a Celsius");
            System.out.println("5. Fahrenheit a Kelvin");
            System.out.println("6. Kelvin a Fahrenheit");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int eleccion = lector.nextInt();
            switch (eleccion) {
                case 1 -> {
                    System.out.print("Ingrese temperatura en Fahrenheit: ");
                    double fah = lector.nextDouble();
                    double cel = (5.0 / 9.0) * (fah - 32);
                    System.out.println(fah + "°F equivale a " + cel + "°C");
                }
                case 2 -> {
                    System.out.print("Ingrese temperatura en Celsius: ");
                    double cEn = lector.nextDouble();
                    double fRes = (9.0 / 5.0) * cEn + 32;
                    System.out.println(cEn + "°C equivale a " + fRes + "°F");
                }
                case 3 -> {
                    System.out.print("Ingrese temperatura en Celsius: ");
                    double cK = lector.nextDouble();
                    double kRes1 = cK + 273.15;
                    System.out.println(cK + "°C equivale a " + kRes1 + " K");
                }
                case 4 -> {
                    System.out.print("Ingrese temperatura en Kelvin: ");
                    double kel1 = lector.nextDouble();
                    double cRes = kel1 - 273.15;
                    System.out.println(kel1 + " K equivale a " + cRes + "°C");
                }
                case 5 -> {
                    System.out.print("Ingrese temperatura en Fahrenheit: ");
                    double fahK = lector.nextDouble();
                    double kRes2 = (5.0 / 9.0) * (fahK - 32) + 273.15;
                    System.out.println(fahK + "°F equivale a " + kRes2 + " K");
                }
                case 6 -> {
                    System.out.print("Ingrese temperatura en Kelvin: ");
                    double kel2 = lector.nextDouble();
                    double fKel = (9.0 / 5.0) * (kel2 - 273.15) + 32;
                    System.out.println(kel2 + " K equivale a " + fKel + "°F");
                    }
                case 7 -> {System.out.println("Saliendo del conversor...");
                    activo = false;
                }
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        lector.close();
    }
}
