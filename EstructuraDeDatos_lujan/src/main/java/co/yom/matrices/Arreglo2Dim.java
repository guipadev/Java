package co.yom.matrices;

import java.util.Scanner;

public class Arreglo2Dim {

    public static void main(String[] args) {

        // definir arreglo 2 dimensiones
        int matriz[][] = new int[3][3];

        // definir arreglo 2 dimensiones con datos
        int matriz2[][] = {{1,2,3},{4,5,6},{7,8,9}};

        // Definir arreglo de acuerdo al usuario
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int m[][] = new int[x][y];
        int n;

        // Llena datos matriz
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++){
                n = (int) (Math.random() * 1000);
                m[i][j] = n;
            }
        }

        // Recorrer matriz
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++){
                System.out.println(m[i][j]);
            }
        }

    }
}
