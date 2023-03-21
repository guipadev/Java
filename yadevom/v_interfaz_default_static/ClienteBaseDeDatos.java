package com.yadevom.v_interfaz_default_static;

public interface ClienteBaseDeDatos {

    default void conectar() {
        System.out.println("Te has conectado a la BD");
    }

    static void nombreSistema() {
        System.out.println("Nuestro sistema es Java");
    }
}
