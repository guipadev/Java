import java.util.Scanner;

public class Sesion4 {
    
       
    //Arreglos
    public static int[] leerArregloInt(Scanner sc, int[] x, int n) {
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        return x;
    }
    
    public static void escribirArregloInt(int[] x, int n) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] cuboComponentesArreglo(int[] x, int n) {
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = x[i] * x[i] * x[i];
        }
        return y;
    }
    
    public static void main(String[] args){
        //Impresion de Arreglos
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Digite los datos del arreglo"
                + " separados por espacio o enter:");
        x = leerArregloInt(sc, x, n);
        int[] y = cuboComponentesArreglo(x, n);
        System.out.println("El arreglo elevado al cubo"
                + " es:");
        escribirArregloInt(y, n);
        
        
       
        
    }
    
    
}
