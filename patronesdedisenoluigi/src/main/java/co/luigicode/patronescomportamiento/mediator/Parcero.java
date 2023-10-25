package co.luigicode.patronescomportamiento.mediator;

public class Parcero implements Combate {

    private String nombre;
    private Mediador mediador;

    public Parcero(String nombre, Mediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
        mediador.agregar(this);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando el mensaje de " + nombre);
        mediador.enviar(this);
    }

    @Override
    public void recibido(Combate combate) {
        System.out.println("Mensaje recibido de " + ((Contrincante) combate).getNombre() + ": " + nombre + " ataque modo activado!!");
    }

    @Override
    public String toString() {
        return "Parcero{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
