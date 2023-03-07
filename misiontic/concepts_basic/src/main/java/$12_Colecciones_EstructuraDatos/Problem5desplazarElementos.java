package $12_Colecciones_EstructuraDatos;

/**
 * Rotar los elementos de un ArrayList en Java
 * Método para desplazar todos los componentes de un Array un lugar a la derecha.
 * El último elemento pasará a la primera posición.
 *
 * En este caso el contenedor será un ArrayList. El método recibirá un ArrayList de tipo Integer
 * con una serie de valores numéricos y devolverá el mismo ArrayList con sus elementos desplazados
 * una posición a la derecha.
 * Los desplazamientos se realizarán sobre el mismo array. No se puede utilizar un array auxiliar
 * para reailzar el proceso.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Problem5desplazarElementos {

    public static void main(String[] args) {
        ArrayList<Integer> A = leerArray();

        mostrar(A);

        //utilizando el método clásico
        desplazarDerecha(A);

        mostrar(A);

        //utilizando solo los métodos de ArrayList
        desplazarDerecha2(A);

        mostrar(A);
    }

    //pedir por teclado los valores del ArrayList
    public static ArrayList<Integer> leerArray() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList();

        int N;

        do {
            System.out.print("Número de elementos del array (>0): ");
            N = sc.nextInt();
        } while (N <= 0);

        for (int i = 0; i < N; i++) {
            System.out.print("elemento[" + i + "]= ");

            numeros.add(sc.nextInt());
        }

        return numeros;
    }

    //método clásico: guardamos el último elemento en un auxiliar,
    //desplazamos todos los elementos una posición a la derecha
    //finalmente guardamos en el primer elemento el valor guardado en el auxiliar
    public static void desplazarDerecha(ArrayList<Integer> a) {
        System.out.println("------------------------ DESPLAZAR A LA DERECHA -> ------------------------");

        int i;

        int aux = a.get(a.size() - 1); //guardar el último elemento en una variable

        for (i = a.size() - 1; i > 0; i--) { //desplazar los elementos
            a.set(i, a.get(i - 1)); //a cada elemento se le asigna el anterior
        }
        a.set(0, aux); //asignar al primero el último que se guardó al principio
    }

    //Utilizando métodos de ArrayList:
    //guardamos el último elemento en una variable
    //insertamos este elemento al principio
    //eliminamos el último elemento
    public static void desplazarDerecha2(ArrayList<Integer> a) {
        System.out.println("------------------------ DESPLAZAR A LA DERECHA -> -> ------------------------");
        int aux = a.get(a.size() - 1);
        a.add(0, aux);
        a.remove(a.size() - 1);
    }

    //Método para mostrar todo el ArrayList
    public static void mostrar(ArrayList<Integer> a) {
        System.out.println(a);
    }
}
