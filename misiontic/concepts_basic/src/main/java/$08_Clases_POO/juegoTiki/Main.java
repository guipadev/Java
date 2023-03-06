package $08_Clases_POO.juegoTiki;

import java.util.Scanner;

/**
 El objetivo será crear una clase Triki con el que se pueda jugar.
 Considere la siguiente matriz:
 a a a
 a a a
 a a a

 Cree la clase Triki que tenga como único atributo la matriz anteriormente contemplada.
 El constructor no recibirá parámetros de entrada, y allí se inicializará la matriz con a’s
 que indican que la casilla en cuestión está vacía. La clase tendrá los siguientes métodos:
 marcarCasilla(String simbolo, int fila, int columna): Marcará el
 símbolo indicado (lo ideal es que en el parámetro simbolo se pase un
 único caracter (X ó O). Dicho caracter se escribirá en la posición de
 la matriz (fila, columna).

 verificarGanador(): Verificará si hay un ganador. Retornará el ganador
 (si lo hay) del juego, devolviendo el caracter que usó para ganar. Si
 no hay ganador aún se devolverá una ’a’ indicando que no hay un ganador.

 verificarCasilla(int fila, int columna): Devolverá el caracter que hay en
 la casilla que está en la posición (fila, columna) de la matriz.
 **/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Triki triki = new Triki();

        char simbolo = 'X'; // Se empieza con el símbolo X

        boolean juegoTerminado = false;

        System.out.println("¡Bienvenido al Triki!");

        while (!juegoTerminado) {

            System.out.println("Turno del jugador " + simbolo);

            System.out.print("Ingresa la fila (0, 1 ó 2): ");

            int fila = scanner.nextInt();

            System.out.print("Ingresa la columna (0, 1 o 2): ");

            int columna = scanner.nextInt();

            // Verifica si la casilla está vacía
            if (triki.verificarCasilla(fila, columna) == '♥') {

                triki.marcarCasilla(simbolo, fila, columna);

                triki.mostrarTablero();

                char ganador = triki.verificarGanador();

                if (ganador != '♥') {
                    System.out.println("¡El ganador es el jugador " + ganador + "!");
                    juegoTerminado = true;
                } else if (triki.tableroLleno()) { // Si el tablero está lleno y no hay ganador, el juego termina en empate
                    System.out.println("¡Empate!");
                    juegoTerminado = true;
                } else { // Si no hay ganador y el juego no ha terminado, cambia el símbolo del jugador
                    simbolo = simbolo == 'X' ? 'O' : 'X';
                }
            } else {
                System.out.println("La casilla ya está ocupada, intenta de nuevo.");
            }
        }
        System.out.println("¡Gracias por jugar!");
    }

}

