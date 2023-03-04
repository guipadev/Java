package com.pildo._01basico.arrays;

public class ArraryBidimensionales {

    public static void main(String[] args) {

        int [][] matrix = new int[4][5];

        matrix[0][0] = 15;
        matrix[0][1] = 115;
        matrix[0][2] = 125;
        matrix[0][3] = 135;
        matrix[0][4] = 145;

        matrix[1][0] = 315;
        matrix[1][1] = 3515;
        matrix[1][2] = 155;
        matrix[1][3] = 5415;
        matrix[1][4] = 1545;

        matrix[2][0] = 515;
        matrix[2][1] = 815;
        matrix[2][2] = 185;
        matrix[2][3] = 159;
        matrix[2][4] = 158;

        matrix[3][0] = 175;
        matrix[3][1] = 175;
        matrix[3][2] = 715;
        matrix[3][3] = 157;
        matrix[3][4] = 175;


        System.out.println("La posicion 2 es " + matrix[2][3]);

        // Recorrrer
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
