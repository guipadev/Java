package com.curso.tipovar;

import java.util.LinkedList;

/**
 *
 * @author yamid
 */
public class Principal {

    /**
     * A partir de Java 10 es un tipo por inferencia, osea que infiere en la asignación inicial que tiene al ser declarada
     * Se debe utilizar en bloques, como variables locales y tampoco inferir como un parametro
     * Este es un tipo de dato reservado
     * 
     * Un var se puede utilizar sólo como variable local en un constructor, metodo o bloque inicializador
     * Un var no puede ser usado en parametros de constructores, metodos, variables de instancia o clase
     * Un var siempre se debe inicializar en la línea o sentencia donde es declarado
     * Un var puede cambiar el valor, pero no su tipo inferido inicialmente
     * Un var no se puede inicializar con un null sin un tipo
     * Un var no es permitido en una declaración de variable múltiple
     * @param args 
     */
    public static void main(String[] args) {
        var valor = "Hola Mundo"; // Esta variable seria tipo String
        
        // No puede ser inferido como null
       // var valoracion = null;
       
       // Tampoco se puede inferiri sin ningun valor
       // var valoracion;
       // int a, var b;
       
       // Se podria que una variable puede ser null, pero basada en las caracteristicas de un clase
       var valoracion = (String) null;
       
       var lista = new LinkedList<String>();
       
       
    }
}
