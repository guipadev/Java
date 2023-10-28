package co.luigicode.patronescomportamiento.memento;

/**
 * Es el recuerdo
 */
public class Memento {

    private int nivel;
    private int muertes;

    public Memento(Juego juego) {
        this.nivel = nivel;
        this.muertes = muertes;
    }

    public int getNivel() {
        return nivel;
    }

    public Memento setNivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    public int getMuertes() {
        return muertes;
    }

    public Memento setMuertes(int muertes) {
        this.muertes = muertes;
        return this;
    }
}
