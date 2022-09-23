package com.morsa.PatronDeDisenoState;

public class Aburrido implements State {

    private Tamagotchi tamagotchi;

    @Override
    public void alimentar() {
        System.out.println("No quiero comer");
    }

    @Override
    public void jugar() {
        System.out.println("Yaa! Juguemos!!");
        tamagotchi.setState(new Cansado());
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir");
    }

    @Override
    public void comoEstas() {
        System.out.println("Estoy aburrido quiero jugar");
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
}
