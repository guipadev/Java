package Absolute.MATRICES;

public class App {

    public static void main(String[] args) {

        int matriz[][] = new int [2][2];

        matriz[0][0] = 3;
        matriz[0][1] = 4;
        matriz[1][0] = 5;
        matriz[1][1] = 6;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
