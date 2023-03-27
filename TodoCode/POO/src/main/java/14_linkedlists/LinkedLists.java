package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
        
    public static void main(String[] args) {
        
        // Crear linkedlist
        List<Persona> lista = new LinkedList<Persona> ();
        
        // Agregar
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Monica", 23));
        lista.add(new Persona(3, "Yefferssn", 38));
        lista.add(new Persona(4, "Maryoly", 43));
    
        // Agregar al principio de la lista
        lista.add(0, new Persona(5, "Ernesto", 13));
         
        // Recorrer por elemento
        System.out.println("------------- FOREACH -------------");
        for (Persona perso:lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
    
    
}
