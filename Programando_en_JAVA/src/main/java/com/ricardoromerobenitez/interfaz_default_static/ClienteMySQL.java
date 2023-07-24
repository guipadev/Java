package com.ricardoromerobenitez.interfaz_default_static;

import static java.lang.System.out;

public class ClienteMySQL implements ClienteBaseDeDatos {
    @Override
    public void conectar() {
        out.println("Conectado a base datos MySQL");
    }

}
