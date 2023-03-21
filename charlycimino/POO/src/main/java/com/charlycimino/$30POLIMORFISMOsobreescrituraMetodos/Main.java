package com.charlycimino.$30POLIMORFISMOsobreescrituraMetodos;

public class Main {

    /**
     * Los objetos 'nacen' recien en tiempo de ejecucion, por lo que el compilador
     * no sabe aun hacia donde apunta el parametro 'v'
     * Recien en tiempo de ejecucion es que Java enlazara el llamado al metodo y su definicion respectiva
     */

    public static void main(String[] args) {
        //probar(new Vehiculo());
        // DOWNCASTING
        probar(new Avion());
        System.out.println("----------");
        probar(new BicicletaElectrica());
    }

    // Java deduce en tiempo de ejecucion que 'v' apunta a una Bicicleta Electrica
    // y por eso invoca al 'encender' de tal clase
    public static void probar(Vehiculo v) {
        v.encender();
    }
}
