package co.luigicode.patronescomportamiento.strategy;

public class Jugador {

    private String nombre;
    private int vidas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vidas = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getVidas() {
        return vidas;
    }

    public Jugador setVidas(int vidas) {
        this.vidas = vidas;
        return this;
    }
}
