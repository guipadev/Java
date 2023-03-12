import java.util.Scanner;

public class Decisiones {
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    //calcular el valor absoluto de un número real, pero utilizando el operador condicional ternario en vez del condicional if
    public static double valorAbsoluto2(double x) {
        double valor;
        valor = (x >= 0) ? x : -x;
        return valor;
    }
    
    //Una función equivalente a la anterior, que es más compacta y que también permite calcular el valor absoluto
    public static double valorAbsoluto3(double x) {
        return (x >= 0) ? x : -x;
    }


    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("primer valor a?");
        a = sc.nextDouble();
        double b;
        System.out.println("segundo valor b?");
        b = sc.nextDouble();
        
        System.out.println("El valor absoluto segunda opcion "+ a + " es " + valorAbsoluto2(a));
        System.out.println("El valor absoluto tercera opcion "+ a + " es " + valorAbsoluto3(a));
        System.out.println("Entre los dos valores ingresados "+ a + " & " + b + " El maximo es " + max(a, b));
    }
    
}
