package co.luigicode.patronescreacionales.singleton;

public class Player {

    private String nombre;

    // Var estatica de la propia clase
    // var volatil no guarde en cache y si no en ram, para que apunte a la misma posion en memoria
    private static volatile Player player;

    // Constructor privado apunta a ser singleton

    private Player(String nombre) {
        this.nombre = nombre;
    }

    // Método estacio Accedemos a constante, para obtenerlo
    // Synchronized para cumplir el singleton
    public static synchronized Player getPlayer(String name) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (player == null)
            player = new Player(name); // Si es null se inicializa
        return player; // No es null siempre devuelve lo que se inicializa por 1era vez
    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
