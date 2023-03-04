package com.pildo._01basico.arrays;

/**
 * Aumento de capital con el tiempo
 * 10%      11%         12%         13%         14%         15%
 * 10.000   10.000      10.000      10.000      10.000      10.000
 * 11.000   11.100      11.200      11.300      11.400      11.500
 * 12.100   12.321      12.544      12.769      12.996      13.225
 * 13.310   13.676.31   14.049.28   14.428.97   14.815.44   15.208.75
 * -------------------------------------------------------------------
 * 14.641   15.180.70   15.735.19   16.304.74   16.889.60   17.490.06
 */

public class ArrayBidimensionalEjercicio {

    public static void main(String[] args) {

        double acumulado;
        double interes = 0.10;

        double [][] saldo = new double[6][5];

        for (int i = 0; i < 6; i++) {

            saldo[i][0] = 10000;
            acumulado = 10000;

            for (int j = 1; j < 5; j ++) {

                acumulado = acumulado + (acumulado * interes);

                saldo[i][j] = acumulado;
            }
            interes = interes + 0.01;
        }

        for (int z = 0; z < 6; z++) {

            System.out.println();

            for (int h = 0; h < 5; h++) {
                System.out.printf("%1.2f", saldo[z][h]);
                System.out.print(" ");
            }
        }
    }
}
