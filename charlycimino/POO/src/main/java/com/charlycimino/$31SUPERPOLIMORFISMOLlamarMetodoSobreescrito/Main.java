package com.charlycimino.$31SUPERPOLIMORFISMOLlamarMetodoSobreescrito;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Bicicleta> bicis = new ArrayList<>();

        bicis.add(new Bicicleta("GT", 20, 30));
        bicis.add(new BicicletaElectrica("ZT", 16, 55, 250));

        bicis.add(new Bicicleta("Chimano", 28, 55));
        bicis.add(new BicicletaElectrica("Electro", 18, 43, 5));

        Taller t = new Taller();
        System.out.println("Servicios posibles: " + t.cantServiciosPosibles(bicis));
    }
}
