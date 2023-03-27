package com.curso.queeselpoolstringequivalenciadestring;

/**
 *
 * @author yamid
 */
public class Principal {

    /**
     * "Hola Mundo".equals("Hola Mundo")    true
     * "Hola Mundo" == "Hola Mundo"             true
     * "Hola Mundo" == " Hola Mundo".trim()  false
     * 
     * Pool String
     * Lugar de la memoria de Java en donde se almacena los literales String
     * 
     * @param args 
     */
    public static void main(String[] args) {
        String valor = "Hola Mundo!";
        String valor2 = "Hola Mundo!";
        
        // comprobamos que las variables apunta a la misma posición en memoria
        System.out.println(valor == valor2);
        
        // Al no irse el trim al pool string por ende sera falso
        System.out.println(valor == "Hola Mundo! ".trim()); // false
        
        // Java comprueba que es el mismo valor almacenado ya en referencia
        String valor3 = "Hola " + "Mundo";
        System.out.println(valor == valor3);
        
        // Buscar si el valor en referencia se encuentra en el pool string
        // Examen de certificación puede salir estas cosas
        System.out.println(valor == ("Hola Mundo! ".trim().intern())); // true
    }
}
