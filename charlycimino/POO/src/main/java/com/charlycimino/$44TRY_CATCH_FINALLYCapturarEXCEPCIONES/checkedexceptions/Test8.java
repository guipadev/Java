package com.charlycimino.$44TRY_CATCH_FINALLYCapturarEXCEPCIONES.checkedexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Test8 {

    /*
      Manejo de excepciones 'checked'
    */
    public static void main(String[] args) {
        VisorDeTXTs v = new VisorDeTXTs();
        try {
            v.mostrarTxt("src\\ar\\charlycimino\\ejemplos\\checkedexceptions\\MENSAJE_OCULTO.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
            System.out.println(ex.getMessage());
        }
    }

}
