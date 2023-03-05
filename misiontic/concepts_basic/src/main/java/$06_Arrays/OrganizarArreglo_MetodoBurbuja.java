package $06_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OrganizarArreglo_MetodoBurbuja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tamaño del arreglo: ");

        int n = Integer.parseInt(sc.nextLine());

        int[] arreglo = new int[n];

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("ingrese cualquier valor para la posición # " +  (i+1) + ": ");
            arreglo[i] = Integer.parseInt(sc.nextLine());
        }

        //Metodo de ordenamiento
        Arrays.sort(arreglo);

        System.out.println("Orden del arreglo:");

        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + ", ");
        }
    }
}
