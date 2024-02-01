package $15_diferencia_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EliminarLists {
    
    public static void main(String[] args) {
        
        //ARRAYLIST
        List<Persona> listaArray = new ArrayList<Persona> ();
        
        listaArray.add(new Persona(1, "Luisina", 30));
        listaArray.add(new Persona(2, "Monica", 23));
        listaArray.add(new Persona(3, "Yefferssn", 38));
        listaArray.add(new Persona(4, "Maryoly", 43));
        
        //LINKEDLIST
        LinkedList<Persona> listaLinked = new LinkedList<Persona> ();
        
        listaLinked.add(new Persona(1, "Luisina", 30));
        listaLinked.add(new Persona(2, "Monica", 23));
        listaLinked.add(new Persona(3, "Yefferssn", 38));
        listaLinked.add(new Persona(4, "Maryoly", 43));
    
        // Remove en ArrayList
        listaArray.remove(1);
        
        
        // Remove en LinkedList
        String nombreBorrar = "Yefferssn";
        
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break; // corto que deje de correr, porque se rompe la cadena de la lista y no esta reacomodada nuevamente
            }
        }
        
        System.out.println("------ LUEGO DE ELIMINAR -----");
        // recorrido foreach
        System.out.println("----- ARRAYLIST -----");
        for (Persona persona:listaArray) {
            System.out.println("prueba " + persona.getNombre());
        }
        
        System.out.println("----- LINKEDLIST -----");
        for (Persona persona:listaLinked) {
            System.out.println("prueba " + persona.getNombre());
        }    
        
        // Tamaño lista
        System.out.println("----- QUE TAMAÑO TIENEN LAS LISTAS? -----");
        System.out.println("ArrayLists: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        // Obtener primer objeto        
        System.out.println("----- PRIMER Y ÚLTIMO OBJETO (SOLO PARA LINKED LIST) -----");
        
        System.out.println("Prime de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Último de LinkedList: " + listaLinked.getLast().toString());
        
        System.out.println("----- BORRANDO LISTAS -----");
        listaArray.clear();
        listaLinked.clear();
    
        // Comprobar si está vacía
        System.out.println("----- Está vacía alguna lista ? -----");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
    }
}
