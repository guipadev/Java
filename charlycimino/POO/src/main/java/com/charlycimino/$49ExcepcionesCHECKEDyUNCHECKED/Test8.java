package com.charlycimino.$49ExcepcionesCHECKEDyUNCHECKED;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * https://stackoverflow.com/questions/6115896/understanding-checked-vs-unchecked-exceptions-in-java
 * https://stackoverflow.com/questions/27578/when-to-choose-checked-and-unchecked-exceptions
 * https://picodotdev.github.io/blog-bitix/2018/04/la-controversia-sobre-las-excepciones-checked-y-unchecked/
 *
 */
public class Test8 {

    /*
     Manejo de excepciones 'checked'
   */
    public static void main(String[] args) {
        VisorDeTXTs v = new VisorDeTXTs();
        try {
            v.mostrarTxt("src\\main\\java\\com\\charlycimino\\$49ExcepcionesCHECKEDyUNCHECKED\\MENSAJE_OCULTO.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
            System.out.println(ex.getMessage());
        }
    }
}
