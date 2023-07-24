package com.ricardoromerobenitez.interfaz_default_static;

import static java.lang.System.*;

public class ClienteMariaDB implements ClienteBaseDeDatos {

    @Override
    public void conectar() {
        out.println("Conectado a base datos Maria DB");
    }

}
