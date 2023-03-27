package com.curso.claseswrapper;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author yamid
 */
public class Principal {

    /**
     * Autoboxing conversión automática de tipo primitivo a la clase Wrapper equivalente
     * Unboxing conversión automática de una clase Wrapper a su tipo primitivo equivalente
     * @param args 
     */
    public static void main(String[] args) {
        
        int num = 30; // no puede iniciarse en null
        
        Integer numClase = num; // Autoboxing
        
        System.out.println(30 == numClase) ;    //Unboxing
        
        Integer posX = null;
        
        // Realiza un Unboxing recibe valores int
        List<Integer> lista = new LinkedList<>();
        
        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.add(1000);
        
        // eliminar por posición
        lista.remove(3);
        
        // eliminar por valor equivalente
        lista.remove((Integer)1);
        lista.remove(Integer.valueOf(10));
        
        lista.forEach(System.out::println);
        
        
        
    }
    
}
