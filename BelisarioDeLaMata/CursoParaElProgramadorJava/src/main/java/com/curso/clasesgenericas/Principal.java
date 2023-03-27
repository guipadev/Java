package com.curso.clasesgenericas;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author yamid
 */
public class Principal {

    /*
      Convenciones de nombramiento para genericos
      E para un elemento  
      K para una llave de un mapa
      V para un valor de un mapa
      N para un número
      T para un tipo genérico
      S, U, V para varios tipos genéricos
    
      Los genericos se debe utilizar cada vez que queramos generalizar el comportamiento de una clase baso en algún tipo de dato
      La forma más común es cuando utilizamos colecciones, ya que tiene el diseño para guardar lo que realmente necesitemos
      
     */
    public static void main(String[] args) {
        
        // Ejemplo cuando un generico es de un tipo especifico
        List<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        //lista.add("no es tipo Integer");
        
        /*
        Se creo la clase Nodo que al instanciar debemos definir el tipo de dato
        con el cual vamos a trabajar
        Generalizamos el comportamiento de un objeto
        */
        
        // En este caso tipo Obj
        Nodo nodo = new Nodo<>();
        nodo.setValor("Objeto");
        
        // En este caso tipo Integer
        Nodo<Integer> nodoEntero = new Nodo<>();
        nodoEntero.setValor(25);
        
        // En este caso tipo String
        Nodo<String> nodoCadena = new Nodo<>();
        nodoCadena.setValor("Hola");
        
        /*
        Ejemplo de uso en un campo en especifico desde la clase Maestro
        */
        Maestro master = new Maestro();
        master.setId("lo que quiera");
        master.setCodigo("123");
        master.setNombre("Juan");
        
        // Definicion entero
        Maestro<Integer> maestroInt = new Maestro<>();
        maestroInt.setId(25);
        master.setCodigo("123");
        master.setNombre("Juan");
        
        // Mostra uso con una clase abstrata Animal
        
        // se define para recibir tipo Integer
        Mamifero animal1 = new Mamifero();
        animal1.setId(1);
        
        // se define para recibir tipo Byte
        Insecto animal2 = new Insecto();
        animal2.setId((byte)20);
    }
        
}
