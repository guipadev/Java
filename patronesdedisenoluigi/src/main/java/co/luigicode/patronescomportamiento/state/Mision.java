package co.luigicode.patronescomportamiento.state;

public class Mision {

    private String nombre;
    private MisionEstado estado;

    public Mision(String nombre) {
        this.nombre = nombre;
        estado = new Bloqueado();
    }

    public void siguiente() {
        estado.siguiente(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Mision setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public MisionEstado getEstado() {
        return estado;
    }

    public Mision setEstado(MisionEstado estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public String toString() {
        return getNombre() + estado.imprimir();
    }
}
