package com.curso.parametrosvariablesVarArgs;

/**
 *
 * @author yamid
 */
public class Principal {
    
    /**
     * Los parametros variables es una forma de declara médotos
     * Donde tenemos un parámetro que a la final por detrás es un vector
     * Pero cuando nosotros realizamos el llamado lo podemos hacer de una forma variables con un número X de valores
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        System.out.println(sum(100,200,300,400,200));
        
        // Se comprueba que es un vector por su equivalencia
        System.out.println(sum(new int[]{100,200,300,400,200}));
        
        // Otra forma
        System.out.println(suma("hola", 1,2,3,4));
    }
    
    // Solo se tener un parametro variable...
    static int suma(String msj, int... valores) {
        return 0;
    }
    
    static int sum(int... valores) {
        int total = 0;
        
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        
        return total;
    }
}
