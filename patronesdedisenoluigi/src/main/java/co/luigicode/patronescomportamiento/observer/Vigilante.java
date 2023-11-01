package co.luigicode.patronescomportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Vigilante extends Enemigo implements MiObservable {

    private List<MiObservador> observadores = new ArrayList<>();

    public Vigilante(String nombre) {
        super(nombre);
        setActivo(true);
    }

    @Override
    public void ataque() {
        System.out.println(getNombre() + " vigilante en ataque!!");
    }

    @Override
    public void activado() {
        System.out.println(getNombre() + " enviando mensajes");
        enviaMsj();
    }

    @Override
    public void subscribirse(MiObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void desescribirse(MiObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void enviaMsj() {
        for (MiObservador observador: observadores) {
            observador.actualizar();
        }
    }
}
