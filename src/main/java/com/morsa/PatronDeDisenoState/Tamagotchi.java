package com.morsa.PatronDeDisenoState;

/**
 * Tamagotchi tiene básicamente los mismo métodos, solo que no se preocupa directamente de cómo realizar
 * su acciones, sino que se lo delega al estado que tiene
 */
public class Tamagotchi {

    private State estado;

    // Constructor vacio para crear instancias

    public Tamagotchi() {
        setState(new Aburrido());
    }

    public void setState(State estado) {
        this.estado = estado;
        this.estado.setTamagotchi(this);
    }

    public void alimentar() {
        this.estado.alimentar();
    }

    public void dormir() {
        this.estado.dormir();
    }

    public void jugar() {
        this.estado.jugar();
    }

    public void comoEstas() {
        this.estado.comoEstas();
    }
}
