package co.yom.matrices;

public class ArregloMas2Dim {

    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int z = 3;

        String cubo[][][] = new String[x][y][z];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    cubo[i][j][k] = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                }
            }
        }

        // Mostrar datos
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.println(cubo[i][j][k]);
                }
            }
        }
    }
}
