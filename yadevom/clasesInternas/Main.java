package clasesInternas;

public class Main {

    public static void main(String[] args) {

        // Creacion de clase interna, para no tener que inicializar la clase externa
        // para utilizar la clase interna la volvemos tipo estatica
        ClaseExterna claseExterna = new ClaseExterna();
        claseExterna.metodoEjemplo();
        // claseExterna.metodoLocal(); esto no se podria

        //ClaseExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna();
        ClaseExterna.ClaseInterna claseInterna = new ClaseExterna.ClaseInterna();
        claseInterna.metodoInterno();
    }
}
