import java.util.Scanner;

public class SesionCuatro {
    
    
    public static int[] leerArreglo(Scanner sc, int[] x, int n){
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(sc.nextLine());
        }
        return x;
    }
    
    
    public static void escribirArreglo(int[] x, int n){
        
        for(int i = 0; i < n; i++){
            System.out.println(x[i]);
        }
    }
    
    
    public static void escribirArreglo2(int[] x, int n){
        
        for(int i : x){
            System.out.println(i);
        }
    }
    
    
      
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[3];
        
        System.out.println("Leer arreglo: ");
        x = leerArreglo(sc, x, 3);
        System.out.println("Imprimir Arreglo FOR: ");
        escribirArreglo(x, x.length);
        System.out.println("Imprimir Arreglo FOR-EACH: ");
        escribirArreglo2(x, x.length);
    }
}
