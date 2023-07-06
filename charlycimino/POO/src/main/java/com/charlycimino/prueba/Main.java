package com.charlycimino.prueba;

import com.charlycimino.prueba.ejSOLID.Balon;
import com.charlycimino.prueba.ejSOLID.BalonVoleibol;
import com.charlycimino.prueba.ejSOLID.Voleibol;
import com.charlycimino.prueba.ejSOLID.Deportes;

public class Main {
    public static void main(String[] args) {

        // Creación de un objeto Voleibol
        Voleibol voleibol = new Voleibol();

        voleibol.setNombre("Voleibol");
        voleibol.setTipo("Deporte de equipo");
        voleibol.setCantidadJugadores(12L);

        // Llamada al método específico de Voleibol
        voleibol.jugarVoleibol();

        // Creación de un objeto Deportes
        Deportes deporte = new Deportes();

        deporte.setNombre("Fútbol");
        deporte.setTipo("Deporte de equipo");
        deporte.setCantidadJugadores(11L);

        // Llamada al método tipoBalon utilizando un objeto BalonVoleibol
        Balon balonVoleibol = new BalonVoleibol();

        String tipoBalonVoleibol = deporte.tipoBalon(balonVoleibol);

        System.out.println(tipoBalonVoleibol);
    }
}
