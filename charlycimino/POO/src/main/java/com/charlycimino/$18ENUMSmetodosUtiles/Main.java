package com.charlycimino.$18ENUMSmetodosUtiles;


import com.charlycimino.$19SCANNERCrearTuPropiaLibreriaParaLeerDeConsola.Consola;

public class Main {

    public static void main(String[] args) {

        System.out.println(NivelEstudio.DOCTORADO.ordinal());

        System.out.println(NivelEstudio.DOCTORADO.toString());

        NivelEstudio[] niveles = NivelEstudio.values();

        for(int i = 0; i < niveles.length; i++) {
            System.out.println((i + 1) + ") " + niveles[i]);
        }

        int opcUsuario = Consola.leerEntero("Ingrese su nivel de estudios");
        System.out.println("Usted eligio " + niveles[opcUsuario - 1]);

        // En base a una cadena obtener un nivel de estudio
        // La cual debe ser escrita de acuerdo a lista de enums
        NivelEstudio.valueOf("PRIMARIO");

    }
}
