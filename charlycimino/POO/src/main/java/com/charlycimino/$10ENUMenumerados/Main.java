package com.charlycimino.$10ENUMenumerados;

public class Main {

    public static void main(String[] args) {

        Empresa xMen = new Empresa();

        //xMen.agregarPersona(new Persona("gambito", "explosivos", "Bajo"));
        xMen.agregarPersona(new Persona("ciclope", "rayos x", NivelEstudio.MEDIO));
        xMen.agregarPersona(new Persona("gambito", "explosivos", NivelEstudio.BAJO));
        xMen.agregarPersona(new Persona("guepardo", "garras", NivelEstudio.BAJO));
        xMen.agregarPersona(new Persona("tormenta", "electricidad", NivelEstudio.MEDIO));
        xMen.agregarPersona(new Persona("profesor", "telequinecis", NivelEstudio.MEDIO));
        xMen.agregarPersona(new Persona("fenix", "telequinecis", NivelEstudio.MUYALTO));
        xMen.agregarPersona(new Persona("magneto", "metalero", NivelEstudio.ALTO));

        //xMen.mostrarPorNivel("alto");
        xMen.mostrarPorNivel(NivelEstudio.MUYALTO);

    }
}
