package com.charlycimino.$31SUPERPOLIMORFISMOLlamarMetodoSobreescrito;

import java.util.ArrayList;

public class Taller {

    /**
     * Solo se brinda servicios a aquellas bicicletas de menos de 50kms recorridos y bicicleta
     * electricas de hasta 400w y menos de 50kms recorridos, como el resto de las bicicletas
     */

    public int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
        int contador = 0;

        for (Bicicleta bici : bicis) {
            if (bici.cumpleRequisitos()) {
                contador++;
            }
        }

        return contador;
    }
}
