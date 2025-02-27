package org.example;
import java.util.Random;

        public class Main {
            public static void main(String[] args) {
                int win1 = 0;
                int win2 = 0;
                int aleatorio1, aleatorio2;
                Random random = new Random();

                while (win1 < 2 && win2 < 2) {

                    aleatorio1 = random.nextInt(3);
                    aleatorio2 = random.nextInt(3);

                    // Se evalúa solo si no hay empate (único if permitido)
                    if (aleatorio1 != aleatorio2) {
                        // Si se cumple alguna de las condiciones que hacen ganar a Jugador1:
                        // Piedra (0) vence a Tijera (2)
                        // Papel (1) vence a Piedra (0)
                        // Tijera (2) vence a Papel (1)
                        win1 += ((aleatorio1 == 0 && aleatorio2 == 2) ||
                                (aleatorio1 == 1 && aleatorio2 == 0) ||
                                (aleatorio1 == 2 && aleatorio2 == 1)) ? 1 : 0;

                        // Si Jugador1 no gana, gana Jugador2
                        win2 += ((aleatorio1 == 0 && aleatorio2 == 2) ||
                                (aleatorio1 == 1 && aleatorio2 == 0) ||
                                (aleatorio1 == 2 && aleatorio2 == 1)) ? 0 : 1;
                    }

                    System.out.println("Jugador1: " + (aleatorio1 == 0 ? "Piedra" : aleatorio1 == 1 ? "Papel" : "Tijera")
                            + " | Jugador2: " + (aleatorio2 == 0 ? "Piedra" : aleatorio2 == 1 ? "Papel" : "Tijera")
                            + " => Marcador: " + win1 + " - " + win2);
                }

                System.out.println("Ganador: " + (win1 == 2 ? "Jugador1" : "Jugador2"));
            }
        }
