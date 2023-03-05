package $02_condicionales;

import java.util.Scanner;

public class Condicionales {

    public static double imprimirNumero(double x) {
        if (x > 0.0) {
            System.out.println("+");
        }
        System.out.println(x);
        return x;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(imprimirNumero(6));
    }
    
}
