package com.charlycimino.prueba.ejSOLID;


/**
 * Principio de Responsabilidad Única (SRP)
 * moviendo el método tipoBalon a una clase separada Balon
 * e implementándolo en la clase BalonVoleibol
 */
public class BalonVoleibol implements Balon {
    @Override
    public String tipoBalon() {
        return "Balón de voleibol";
    }
}