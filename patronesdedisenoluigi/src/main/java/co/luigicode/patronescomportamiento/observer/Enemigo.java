package co.luigicode.patronescomportamiento.observer;

public abstract class Enemigo {

    private String nombre;
    private boolean activo;

    public Enemigo(String nombre) {
        this.nombre = nombre;
    }

    public abstract void ataque();

    public abstract void activado();

    public String getNombre() {
        return nombre;
    }

    public Enemigo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public boolean isActivo() {
        return activo;
    }

    public Enemigo setActivo(boolean activo) {
        this.activo = activo;
        return this;
    }
}
