package $08_Clases_POO.juegoTiki;
public class Triki {
    private char[][] tablero;

    // Constructor de la clase Triki
    public Triki() {
        tablero = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '♥';
            }
        }
    }

    // Método para marcar una casilla con el símbolo indicado
    public void marcarCasilla(char simbolo, int fila, int columna) {
        tablero[fila][columna] = simbolo;
    }

    // Método para verificar si hay un ganador
    public char verificarGanador() {
        // Comprobación de filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != '♥') {
                return tablero[i][0];
            }
        }

        // Comprobación de columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != '♥') {
                return tablero[0][i];
            }
        }

        // Comprobación de diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != '♥') {
            return tablero[0][0];
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != '♥') {
            return tablero[0][2];
        }

        return '♥'; // Si no hay ganador aún, se devuelve '♥'
    }

    // Método para obtener el caracter que hay en la casilla indicada
    public char verificarCasilla(int fila, int columna) {
        return tablero[fila][columna];
    }

    // Mostrar tablero
    public void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // tablero lleno
    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '♥') {
                    return false;
                }
            }
        }
        return true;
    }
}