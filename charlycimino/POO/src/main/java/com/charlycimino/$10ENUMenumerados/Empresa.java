package com.charlycimino.$10ENUMenumerados;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Persona> listaPersonas;

    public Empresa() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) {
        this.listaPersonas.add(p);
    }

    // Uso enum
    public void mostrarPorNivel(NivelEstudio nivel) {
        for (Persona p : listaPersonas) {
            if (p.getNivelEstudio() == nivel) { // p.getNivelEstudio().equals(nivel)
                System.out.println(p);
            }
        }
    }


    /*
    public void mostrarPorNivel(String nivel) {
        for (Persona p : listaPersonas) {
            if (p.getNivelEstudio().equalsIgnoreCase(nivel)) {
                System.out.println(p);
            }
        }
    }
   */
}
