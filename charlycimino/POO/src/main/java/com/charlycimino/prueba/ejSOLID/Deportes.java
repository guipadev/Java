package com.charlycimino.prueba.ejSOLID;

import lombok.*;


/**
 * Principio de Responsabilidad Única (SRP)
 * moviendo el método tipoBalon a una clase separada Balon
 * e implementándolo en la clase BalonVoleibol
 *
 * Principio de Abierto/Cerrado (OCP)
 * al permitir la extensión de la clase Deportes mediante la clase Voleibol,
 * sin modificar directamente la clase base.
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Deportes {

    private String nombre;
    private String tipo;
    private Long cantidadJugadores;

    // Método relacionado con el balón movido a una clase separada
    public String tipoBalon(Balon balon) {
        return balon.tipoBalon();
    }
}
