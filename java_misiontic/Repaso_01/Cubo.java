import java.util.Scanner;

class Cubo {

    public static int[] datosArregloInt(Scanner datosIngresados, int[] arregloX) {
        for (int i = 0; i < arregloX.length; i++) {
            arregloX[i] = datosIngresados.nextInt();
        }
        return arregloX;
    }

    public static void mostrarArregloInt(int[] arregloX) {
        for (int i = 0; i < arregloX.length; i++) {
            System.out.print(arregloX[i] + "-");
        }
        System.out.println();
    }

    public static int[] cuboComponentesArreglo(int[] arregloX, int tamano) {
        int[] arregloY = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            arregloY[i] = arregloX[i] * arregloX[i] * arregloX[i];
        }
        return arregloY;
    }

    public static void main(String[] args) {
        int tamanoArreglo;
        Scanner datosDigitados = new Scanner(System.in);

        System.out.println("Digite el tamaño del arreglo:");
        tamanoArreglo = datosDigitados.nextInt();
        int[] arregloEnteros = new int[tamanoArreglo];

        System.out.println("Digite datos arreglo separar por espacio/enter:");
        arregloEnteros = datosArregloInt(datosDigitados, arregloEnteros);

        int[] arregloY = cuboComponentesArreglo(arregloEnteros, tamanoArreglo);
        System.out.println("El arreglo elevado al cubo"+" es:");
        mostrarArregloInt(arregloY);
    }
}