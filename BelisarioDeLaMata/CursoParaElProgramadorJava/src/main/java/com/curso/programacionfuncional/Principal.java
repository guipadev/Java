package com.curso.programacionfuncional;

import java.util.Arrays;
import java.util.List;

/*
PROGRAMACIÓN FUNCIONAL
- Interfaces funcionales
- Expresiones Lambdas
- Streams

- Es una forma de escribir código de forma más declarativa
- Se especifica qué se desea hacer en lugar de tratar con el estado de los objetos
- Tiene un enfoque de facilidad para las expresiones con bucles (Streams)

- Usa expresiones lambda para escribir código
- Es un bloque de código que puede ser pasado a algún método
- Tiene parámetros y un cuerpo como los métodos completos, pero no tiene un nombre como un método real
- Es a menudo llamado como lambda de forma abreviada

Trabaja con interface de un solo método abstracto
a -> a.canHop()

(Animal a) -> { return a.canHop(); }

Para trabajar con expresiones lambdas esto es equivalente a una interfaz funcional
Osea una interfaz funcional solamente tien un método abstracto es decir que solamente
tien un método en el cual es necesario su implementación
*/
public class Principal {
    
    public static void main(String[] args) {
        
        List<Persona> personas = Arrays.asList(
            new Persona("Kevin", "Perez", 15),
            new Persona("Rigo", "Ruiz", 21),
            new Persona("Kylen", "Lemus", 10),
            new Persona("Kakaroto", "Silva", 53),
            new Persona("Kate", "Palermo", 15),
            new Persona("Kely", "Gonzalez", 17),
            new Persona("Kata", "Tapia", 19),
            new Persona("Omar", "Muñoz",  52)
        );
        
        // Vamos a averiguar las personas mayores a 20 años 
        
        System.out.println("-----------------------");
        System.out.println("Imperativa Estructurada");
        
        long numeroPersonas = 0;
        
        for (Persona persona: personas) {
            if (persona.getEdad() >= 20) {
                System.out.println(persona);
                numeroPersonas++;
            }
        }
        
        System.out.println("Número de personas: " + numeroPersonas);
        
        // Mayormente aplicado en listas
        System.out.println("-----------------------");
        System.out.println("Declarativa Funcional");
        
        //stream() es una funcion que ya recorre una secuencia de elementos
        long cantidadPersonas = personas.stream().filter((p) -> p.getEdad() >= 20).peek(System.out::println).count();
        
        System.out.println("Número de personas: " + cantidadPersonas);
    }
}
