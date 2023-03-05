package $06_Arrays;

import java.util.Scanner;

public class Arreglo_Parsiado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tamaño del arreglo: ");

        int n = Integer.parseInt(sc.nextLine());

        String[] arreglo = new String[n];

        System.out.println("Ingrese los valores del arreglo: ");

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = sc.nextLine();
        }
    }
}
