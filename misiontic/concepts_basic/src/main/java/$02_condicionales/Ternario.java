/*
*se tiene que la sintaxis general de un operador condicional ternario que es
*equivalente al condicional if es la siguiente
*
*<cond> ? <bloque_1> : <bloque_2>;
*/
package $02_condicionales;

import java.util.Scanner;

/*
*La siguiente función permite calcular el valor absoluto de un número real,
*pero utilizando el operador condicional ternario en vez del condicional if
*presentado en un ejemplo previo
*/
public class Ternario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("n?");
        n = sc.nextDouble();

        System.out.println("Resultado ternario: " + valorAbsoluto2(n));

        System.out.println("Resultado ternario: " + valorAbsoluto3(n));
    }
    
    public static double valorAbsoluto2(double x) {
        double valor;
        valor = (x >= 0) ? x : -x;
        return valor;
    }
    
    //mas compacta
    public static double valorAbsoluto3(double x) {
        return (x >= 0) ? x : -x;
    }
    
}
