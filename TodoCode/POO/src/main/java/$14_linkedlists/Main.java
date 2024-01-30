package $14_linkedlists;

import java.util.LinkedList;
import java.util.List;

public class Main {
        
    public static void main(String[] args) {
        
        // Crear linkedlist
        List<Persona> lista = new LinkedList<Persona> ();
        
        // Agregar, ademas de agregar personas al final de la Lista
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Monica", 23));
        lista.add(new Persona(3, "Yefferssn", 38));
        lista.add(new Persona(4, "Maryoly", 43));
    
        // Agregar al principio de la lista, ya que la linkedliste es doblemente enlazada
        lista.add(0, new Persona(5, "Ernesto", 13));
         
        // Recorrer por elemento con foreach
        // Ya que las linkedlist no tienen un indice bien determinado
        // Estan pensadas para ir viendose registro por registro
        // Y no guiarse por un indice en particular
        System.out.println("------------- FOREACH -------------");
        for (Persona perso:lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
    
    
}
