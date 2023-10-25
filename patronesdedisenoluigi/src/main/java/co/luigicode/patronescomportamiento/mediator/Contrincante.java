package co.luigicode.patronescomportamiento.mediator;

import java.awt.*;

public class Contrincante implements Combate {

    private String nombre;
    private Mediador mediador;

    public Contrincante(String nombre, Mediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
        //Enemigo al momento de crearlo, le pasamos el mediador, para que su vez lo añada a su lista
        mediador.agregar (this);
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
        return "Contrincante{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
