package com.curso.programacionfuncionalinterfacesfuncionales;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Predicate;

/*
INTERFACES FUNCIONALES
Son las interfaces que solo tiene un método abstracto
Regla SAM - Single Abastract Method

Ejemplo API de Java en Paquete java.util.Funcion

Nombre la interface     Declarción
Consumer                void accept(T t)        Tiene un método en el cual se recibe un objeto y no devuelve nada
Predicate               boolean test(T t)       Cuando queremos hacer un filtro

https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
*/
public class Principal {
    
    public static void main(String[] args) {
        
        List<com.curso.programacionfuncional.Persona> personas = Arrays.asList(
            new com.curso.programacionfuncional.Persona("Kevin", "Perez", 15),
            new com.curso.programacionfuncional.Persona("Rigo", "Ruiz", 21),
            new com.curso.programacionfuncional.Persona("Kylen", "Lemus", 10),
            new com.curso.programacionfuncional.Persona("Kakaroto", "Silva", 53),
            new com.curso.programacionfuncional.Persona("Kate", "Palermo", 15),
            new com.curso.programacionfuncional.Persona("Kely", "Gonzalez", 17),
            new com.curso.programacionfuncional.Persona("Kata", "Tapia", 19),
            new com.curso.programacionfuncional.Persona("Omar", "Muñoz",  52)
        );
        
        long numeroPersonas = 0;
        System.out.println("Numero de personas: " + numeroPersonas);
        System.out.println("-----------------------------------");
        
        System.out.println("------ Declarativa funcional ------");
        
        numeroPersonas = personas.stream()
                .filter((p) -> p.getEdad() >= 20)
                .peek(System.out::println)
                .count();
        
        System.out.println("Numero de personas: " + numeroPersonas);
        
        
        // Ejemplo de lo anterior como equivalencia sin expresiones lambda, interface funcional, como se maneja internamente
        /*
        numeroPersonas = personas.stream()
                .filter(new Predicate<Persona>() {
                    @Override
                    public boolean test(Persona t) {
                        return t.getEdad() >= 20;
                    }                    
                })
                .peek(new Consumer<Persona>() {
                    @Override
                    public void accept(Persona p) {
                        System.out.print(p);
                    }
                }).count();
        */        
        
    }
}
