package co.luigicode.patronescomportamiento.memento;

public class TestMemento {

    public static void main(String[] args) {

        String nombre = "Juego1";

        Juego juego = new Juego(nombre, 1, 0);

        juego.guardar();

        System.out.println("Juego 1: " + juego);

        juego = new Juego(nombre, 2, 10);

        juego.guardar();

        System.out.println("Juego 2: " + juego);

        System.out.println("=============== DESHACER ======================");

        juego = new Juego(nombre);

        juego.desahacer();

        System.out.println("Undo 1: " + juego);

        System.out.println("=============== REHACER ======================");

        juego = new Juego(nombre);

        juego.rehacer();

        System.out.println("Undo 1: " + juego);
    }
}
