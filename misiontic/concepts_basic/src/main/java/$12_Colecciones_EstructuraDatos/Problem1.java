package $12_Colecciones_EstructuraDatos;

/**
 * Dada una lista de números, eliminar los duplicados e imprimir la lista
 * procesada.
 * */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem1 {

    public static void main(String[] args) {

        ArrayList<Integer> numEntero = new ArrayList();

        numEntero.add(1);
        numEntero.add(2);
        numEntero.add(3);
        numEntero.add(3);
        numEntero.add(2);
        numEntero.add(2);
        numEntero.add(1);
        numEntero.add(3);
        System.out.println("Lista Inicial \n" + numEntero);
        //Set<Integer> validacion = new HashSet<Integer>(numEntero);
        //numEntero.clear();
        //numEntero.addAll(validacion);
        //System.out.println("Lista Final depurada \n" + numEntero);
    }
}
