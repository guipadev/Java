package $12_Colecciones_EstructuraDatos;

import java.util.ArrayList;

/**
 * Dadas dos listas de números, las cuales pueden ser de distinto
 * tamaño, e imprimir los números se encuentran en ambas listas.
 * */

public class Problema2 {

    public static void main(String[] args) {

        ArrayList<Integer> listaNum1 = new ArrayList();
        ArrayList<Integer> listaNum2 = new ArrayList();

         listaNum1.add(1);
         listaNum1.add(2);
         listaNum1.add(3);

         listaNum2.add(1);
         listaNum2.add(2);
         listaNum2.add(3);
         listaNum2.add(4);
         listaNum2.add(5);
         listaNum2.add(6);

        System.out.println("Impresion de las 2 listas de numeros\n" + listaNum1 + listaNum2);

    }
}
