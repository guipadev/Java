package com.curso.ordenamientocomparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Kevin", "Perez", 15));
        personas.add(new Persona("Rigo", "Ruiz", 21));
        personas.add(new Persona("Kylen", "Lemus", 10));
        personas.add(new Persona("Kakaroto", "Silva", 53));
        personas.add(new Persona("Kate", "Palermo", 15));
        personas.add(new Persona("Kely", "Gonzalez", 17));
        personas.add(new Persona("Kata", "Tapia", 19));
        personas.add(new Persona("Omar", "Muñoz", 152));
        personas.add(new Persona("Jose", "Palermo", 145));
        personas.add(new Persona("Nelson", "Palermo", 154));
        
        personas.forEach(System.out::println);
        
        // Resultado
        Collections.sort(personas);
        
        System.out.println("-------- ORGANIZADO POR COMPARACION DE ELEMENTOS --------");
        personas.forEach(System.out::println);
        
        // Ordenado por comparacion de objetos
        /*
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona t1, Persona t2) {
                return t1.getApellido().compareTo(t2.getApellido()) * -1;
            }
        });
        */
        //Ordenado por comparacion de objetos, pero de modo interfaz funcional lambda
        Collections.sort(personas, (t1, t2) -> t1.getNombre().compareTo(t2.getNombre()) * -1);
        
        System.out.println("--------- ORGANIZADO POR COMPARACION DE OBJETOS ---------");
        personas.forEach(System.out::println);
    }
}
