package co.luigicode.patronescomportamiento.mediator;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Enemigo {

    private String nombre;
    private List<Enemigo> enemigos = new ArrayList<>();

    public Enemigo(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Enemigo enemigo) {
        enemigos.add(enemigo);
    }

    public void enviar() {
        System.out.println("Enviando mensaje de " + nombre);

        for (Enemigo enemigo: enemigos)
            enemigo.recibido();
    }

    public void recibido() {
        System.out.println(nombre + " mensaje recibido. Activado modo ataque!");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre;
    }
}
