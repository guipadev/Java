package com.yadevom._27HASHMAP;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Puede trabajar sobre un objeto, pero es mejor con tipo inmutables
        // Tambien en vez de HashMap podriamos usar Map
        HashMap<Integer, String> hashEmpleado = new HashMap<>();

        hashEmpleado.put(1000, "Juan");
        hashEmpleado.put(2000, "Ana");
        hashEmpleado.put(3000, "Ivan");
        hashEmpleado.put(4000, "Ian");

        System.out.println(hashEmpleado);

        // Obtener quien tiene el key 1000
        System.out.println(hashEmpleado.get(1000));

        // Eliminar el key 3000
        hashEmpleado.remove(3000);

        System.out.println(hashEmpleado);

        // Comprobar si tiene tipo de valor
        if (hashEmpleado.containsValue(500)) {
            System.out.print("Contiene el indice de 500 y su valor es ");
            System.out.println(hashEmpleado.get(500));
        } else {
            System.out.println("El hast no contiene el valor 500");
        }

        // Iterar el hash
        for (Integer indice : hashEmpleado.keySet()) {
            System.out.println(hashEmpleado.get(indice));
        }
    }
}
