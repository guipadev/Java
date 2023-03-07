package $08_Clases_POO.gamePacMan;

/**
 Considere el videojuego PacMan (1980). Se creará una simulación del personaje y el tablero.
 Para ello es necesario crear dos clases:
 Clase PacMan: Tendrá la información del personaje.
 Tablero: Tendrá la información del tablero.

 Para la clase PacMan se deben definir como atributos el color (por defecto ”Amarillo”),
 la puntuación (por defecto 0) y las vidas restantes (por defecto 3).
 El constructor debe recibir estos tres parámetros e inicializarlos.

 Dicha clase tendrá los siguientes métodos:

 - sumarPuntuación(): Cada vez que se llame este método, se sumará +1 a la puntuación.
 - obtenerPuntuación(): Retornará la puntuación actual del personaje.
 - restarVida(): Cada vez que se llame este método, se restará -1 a las vidas.
 - sigueVivo(): Devolverá un booleano indicando si aún le quedan vidas para seguir jugando.

 Para la clase Tablero se requerirán dos atributos: el personaje (será un objeto de tipo PacMan)
 y el nivel.

 El constructor debe recibir el personaje
 (el cual debe haber sido creado anteriormente y pasarse como un parámetro en el constructor de la clase)
 e inicializar el nivel en 0.

 Dicha clase tendrá el siguiente método:
 - comprobarNivelActual(): El funcionamiento es simple: cada 25 puntos del personaje
 equivalen a 1 nivel en el tablero.
 Este método obtendrá la puntuación del PacMan y fijará el nivel actual dependiendo de
 la cantidad de puntos que haya encontrado.
 (Por ejemplo, 57 puntos equivalen al nivel 2, 75 puntos al nivel 3, etc).
 **/
public class Main {
    /**
     * En este Main creamos un objeto PacMan con valores predeterminados y un objeto Tablero
     * que lo contiene. Luego, hacemos que el personaje coma algunas bolitas y sume puntos,
     * y comprobamos el nivel actual del tablero llamando al método comprobarNivelActual().
     * Finalmente, imprimimos la información del personaje y del tablero en la consola.
     */
    public static void main(String[] args) {
        PacMan pacman = new PacMan("Amarillo", 0, 3);
        Tablero tablero = new Tablero(pacman);

        // Hacemos que el personaje coma algunas bolitas y sume puntos
        pacman.sumarPuntuacion();
        pacman.sumarPuntuacion();
        pacman.sumarPuntuacion();

        // Comprobamos el nivel actual del tablero
        tablero.comprobarNivelActual();

        // Imprimimos la información del personaje y del tablero
        System.out.println("Personaje:");
        System.out.println("- Color: " + pacman.getColor());
        System.out.println("- Puntuación: " + pacman.obtenerPuntuacion());
        System.out.println("- Vidas: " + pacman.getVidas());

        System.out.println("Tablero:");
        System.out.println("- Nivel actual: " + tablero.getNivel());
    }
}
