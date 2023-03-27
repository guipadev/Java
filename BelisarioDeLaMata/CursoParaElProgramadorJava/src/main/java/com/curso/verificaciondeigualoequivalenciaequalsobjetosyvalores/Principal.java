package com.curso.verificaciondeigualoequivalenciaequalsobjetosyvalores;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author yamid
 */
public class Principal {
    
    /**
     * Cade vez que necesitemos comprobar la equivalencia entre 2 objetos se debe realizar con equals
     * Si nos interesa saber si 2 objetos o tipos referencia, 2 variables apunta al mismo lugar de memoria  con ==
     * @param args 
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("321", "Jaime", "Rauz");
        Persona persona2 = new Persona("456", "Jair", "Reyna");
        Persona persona3 = new Persona("123", "Jose", "Rojas");
        Persona persona4 = new Persona("123", "Jose", "Rojas");
        
        System.out.println(persona3 == persona4); // false
        System.out.println(persona3.equals(persona4)); // true
        
        List<Persona> personas = new LinkedList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        
        System.out.println("En la lista se encuentra el objeto?");
        System.out.println(personas.contains(new Persona("321"))); // true, ya que sobreescribimos el equals
    }
    
}
