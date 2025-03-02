package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tipo del Pokémon atacante (Agua, Fuego, Planta o Eléctrico): ");
        String tipoAtaque = input.nextLine();
        System.out.print("Ingrese el tipo del Pokémon defensor (Agua, Fuego, Planta o Eléctrico): ");
        String tipoDefensa = input.nextLine();
        System.out.print("Ingrese el valor de ataque (1-100): ");
        int valorAtk = input.nextInt();
        System.out.print("Ingrese el valor de defensa (1-100): ");
        int valorDef = input.nextInt();
        // Validar entradas
        if (valorAtk < 1 || valorAtk > 100 || valorDef < 1 || valorDef > 100) {
            System.out.println("Error: Los valores de ataque y defensa deben estar entre 1 y 100.");
            return;
        }
        double efec = obtenerEfectividad(tipoAtaque, tipoDefensa);
        double damage = 50 * ((double) valorAtk / valorDef) * efec;
        System.out.println("El daño causado es: " + damage);
        if (efec == 2.0) {
            System.out.println("¡Es super efectivo!");
        } else if (efec == 0.5) {
            System.out.println("No es muy efectivo...");
        } else {
            System.out.println("Efectividad neutral.");
        }
        input.close();
    }
    static double obtenerEfectividad(String atq, String def) {
        // def.equals compara el contenido de dos cadenas respetando mayúsculas y minúsculas.
        switch (atq) {
            case "agua" -> {
                if (def.equals("fuego")) return 2.0;
                if (def.equals("agua") || def.equals("planta")) return 0.5;
            }
            case "fuego" -> {
                if (def.equals("planta")) return 2.0;
                if (def.equals("agua") || def.equals("fuego")) return 0.5;
            }
            case "planta" -> {
                if (def.equals("agua")) return 2.0;
                if (def.equals("fuego") || def.equals("planta")) return 0.5;
            }
            case "eléctrico" -> {
                if (def.equals("agua")) return 2.0;
                if (def.equals("planta") || def.equals("eléctrico")) return 0.5;
            }
        }
        return 1.0; // Efectividad neutral si no se cumple ninguna condición
    }
}
