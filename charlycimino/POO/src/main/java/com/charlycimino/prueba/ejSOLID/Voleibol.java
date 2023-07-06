package com.charlycimino.prueba.ejSOLID;

// Aplicación del Principio de Abierto/Cerrado (OCP)

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Voleibol extends Deportes implements DeporteConBalon {

    public Voleibol(String nombre, String tipo, Long cantidadJugadores) {
        super(nombre, tipo, cantidadJugadores);
    }

    public Voleibol() {
    }

    @Override
    public String tipoBalon(Balon balon) {
        return balon.tipoBalon();
    }

    public void jugarVoleibol() {
        System.out.println("Jugando voleibol");
    }
}
