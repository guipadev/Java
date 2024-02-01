package $16_stack_pilas;

import java.util.Stack;

/**
 * Pila de objetos una encima de la otra
 * modelo LIFO (Last In First Out) el último que entro, primero en salir
 */
public class Pilas {

    
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Lista vacía: " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());
    
        // Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        // Recorrido
        for (Integer pilita : pila) {
            System.out.println(pilita);
        }
        
        // Mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacía? " + pila.isEmpty());
        
        // Elimar el último registro que entro
        pila.pop(); 
        
        // Buscar elemento search, coincide exactamente
        System.out.println("Está el 3? : " + pila.search(3));
        
        // Cual fue el último elemento agregado
        System.out.println("Último agregado: " + pila.peek());
    }
}
