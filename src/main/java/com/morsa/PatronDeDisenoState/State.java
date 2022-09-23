package com.morsa.PatronDeDisenoState;

public interface State {

    void alimentar();
    void jugar();
    void dormir();
    void comoEstas();
    void setTamagotchi(Tamagotchi tamagotchi);
}
