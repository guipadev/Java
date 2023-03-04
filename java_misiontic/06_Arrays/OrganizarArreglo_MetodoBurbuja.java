package Arreglo;

import java.util.Arrays;
import java.util.Scanner;

public class OrganizarArreglo_MetodoBurbuja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] arreglo = new int[n];

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = Integer.parseInt(sc.nextLine());
        }

        //Metodo de ordenamiento
        Arrays.sort(arreglo);

        for(int i = 0; i < arreglo.length; i++){
           System.out.println(arreglo[i]);
        }
    }
}
