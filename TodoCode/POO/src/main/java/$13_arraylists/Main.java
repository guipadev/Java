package $13_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {
        
    public static void main(String[] args) {
        
        // Crear arraylist
        List<Persona> lista = new ArrayList<Persona> ();
        
        // Agregar datos
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Monica", 23));
        lista.add(new Persona(3, "Yefferssn", 38));
        lista.add(new Persona(4, "Maryoly", 43));
    
        // Recorrer indice
        System.out.println("------------- FOR -------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        
        // Recorrer por elemento
        System.out.println("------------- FOREACH -------------");
        for (Persona perso:lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
    
    
}
