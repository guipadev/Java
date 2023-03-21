package com.charlycimino.$53_try_with_resources_como_autoliberar_recursos;

public class Test11 {

    /*
     Uso del try-with-resources (a partir de Java 7)
   */
    public static void main(String[] args) {
        VisorDeTXTs v = new VisorDeTXTs();
        v.mostrarTxt("src\\ar\\charlycimino\\ejemplos\\checkedexceptions\\MENSAJE_OCULTO.txt");
    }
}
