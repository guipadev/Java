package com.ricardoromerobenitez.interfaz_default_static;

import static java.lang.System.out;

public interface ClienteBaseDeDatos {

    default void conectar() {
        out.println("Te has conectado a la BD");
    }

    static void nombreSistema() {
        out.println("Nuestro sistema es Java");
    }
}
