package com.curso.ordenamientocomparablevscomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Comparable VS Comparator
Valores de Retorno
- Número < 0 Si el objeto 1 está antes que el objeto 2
- Número = 0 Si el objeto 1 está en la misma posición que el objeto 2
- Número > 0 Si el objeto 1 está después que el objeto 2
Ejemplo
Obj1    Obj2    Retorno
1       10         -1
100     10          1
5       5           0
"A"     "Z"       -25
"J"     "B"         8
"Hola"  "Hola"      0
"Hola"  "Mundo"    -5

Comparable
public interface Comparable<T> {
    int compareTo(T o);
}

Comparator
public interface Comparator<T> {
    int compare (T o1, T o2);
}

Diferencia                              Comparable      Comparator
Nombre del paq.                         java.lang       java.util
Se implementa interfaz en la clase      Si              No
Nombre del método                       compareTo       compare
Numero de parámetros                    1               2
Uso común como Lambda                   No              Si


*/
public class OrdenNumeros {
    
    public static void main(String[] args) {
        //Generación de N números aleatorios
        //int[] numeros = new int[20];
        Integer[] numeros = new Integer[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }
        
        //Conversión de Vector Wrapper de Numeros a Colleción
        List<Integer> lista = Arrays.asList(numeros);
        lista.forEach(v -> System.out.print(v + " "));
        
        //Ordenamiento de Listas
        System.out.println("");
        System.out.println("Ordenamiento");
        Collections.sort(lista);
        lista.forEach(v -> System.out.print(v + " "));
    }
    
}
