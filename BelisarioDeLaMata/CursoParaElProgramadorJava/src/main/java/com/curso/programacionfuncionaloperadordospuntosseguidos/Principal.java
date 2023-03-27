package com.curso.programacionfuncionaloperadordospuntosseguidos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

/*
OPERADOR ::
Referencia a métodos y constructores mediante la implementación de una interfaz funcional
y Java infiere la información del contexto

Recordar los tipos de Referencia:
- Métodos de clase (static)
- Métodos de instancia de un objeto en particular
- Métodos de instancia de un objeto para ser determinado en ejecución
- Constructores

Tipo de referencia de método    Referencia de método    Expresión Lambda
Método de Clase(static)         String::valueOf         (int i) -> String.valueOf(i)
                                System.out::println     (Object obj) -> System.out.println(obj)
Método de instancia de un
objeto en particular            s::substring            (int inicio, int fin) -> s.substring(inicio, fin)
                                                        Dependiendo del contexto Java puede inferir que necesita crear
                                                        (int inicio) -> s.substring(inicio)

Método de instancia de un objeto
para determinar en ejecucción   String::equals          (String s1, String s2) -> s1.equals(s2)

Constructor                     String::new             () -> new String()
*/
public class Principal {
    
    public static void main(String[] args) {
        
        List<String> personas = Arrays.asList("Ana", "Fabio", "Nayibe", "Juan", "David", "Jose", "Luis", "Paco", "");
        
        System.out.println("Recoirrido Foreach tradicional");
        for (String nombre: personas) {
            System.out.println(nombre);
        }
        
        System.out.println("\nVisualización de los elementos con Lambda");
        personas.forEach(p -> System.out.println(p));
        
        System.out.println("\nVisualización de los elementos con referencia de método");
        personas.forEach(System.out::println);
        
        System.out.println("\nReferenica de un método de una instancia en particular");
        String busqueda = "David";
        personas.stream().filter(p -> busqueda.equals(p)).forEach(System.out::println);
        
        System.out.println("\nReferenica de un método de una instancia en particular con referencia/inferencia método");
        String busca = "Jose";
        personas.stream().filter(busca::equals).forEach(System.out::println);
        
        System.out.println("Cuantos valores estan vacios");
        System.out.println(personas.stream().filter(p -> p.isEmpty()).count());
        
        System.out.println("Cuantos valores estan vacios, por referencia de método");
        System.out.println(personas.stream().filter(String::isEmpty).count());
        
        
        //Interfaz funcional Supplier la cual hace es devolver un elemento, en este caso devolver una lista enlazada
        Supplier<List> supplier = new Supplier<List>() {
            @Override
            public List get() {
                return new LinkedList();
            }        
        };
        
        //Equivalencia en expresión Lambda
        supplier = () -> new LinkedList();
        
        //Equivalencia en método por Referencia
        supplier = LinkedList::new;
    }
}
