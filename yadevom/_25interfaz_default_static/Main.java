package com.yadevom._25interfaz_default_static;

//https://programandoenjava.com/metodos-default-y-static-java-8/

public class Main {

    /**
     * Desde Java 8 hay dos maneras de declara metodos en una interfaz
     * default y static
     * @param args
     */

    public static void main(String[] args) {

        ClienteBaseDeDatos clienteBaseDeDatos1 = new ClienteMariaDB();
        ClienteBaseDeDatos clienteBaseDeDatos2 = new ClienteMySQL();

        clienteBaseDeDatos1.conectar();
        clienteBaseDeDatos2.conectar();

        // Al usar static se puede llamar directamente a travez de la interface en vez de una clase
        // Los metodos static no se pueden sobreescribir
        ClienteBaseDeDatos.nombreSistema();
    }
}
