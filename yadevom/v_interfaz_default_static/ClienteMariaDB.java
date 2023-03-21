package com.yadevom.v_interfaz_default_static;

public class ClienteMariaDB implements ClienteBaseDeDatos {

    @Override
    public void conectar() {
        System.out.println("Conectado a base datos Maria DB");
    }

}
