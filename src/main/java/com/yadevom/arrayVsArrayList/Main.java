package com.yadevom.arrayVsArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("********************* ARRAY vs ARRAYLIST *********************");

        // Tamaños fijos y puede ser multidimensional hasta de 3 valores
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        int[][] array2 = new int[2][2];
        array2[0][0] = 1;

        for (int i = 0; i < array.length; i++) {
            int aux = array[i];
            System.out.println("posicion: " + i + " con valor: " + aux);
        }

        // Uso de clases como Integer no puede utilizar int y es solo unidimensional
        // Esta puede ser una lista, coleccion, iterable...
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(11);
        lista.add(22);
        lista.add(33);
        lista.add(44);


        for (Integer integer : lista) {
            System.out.println(integer);
        }
    }
}
