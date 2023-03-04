/*
*se tiene que la sintaxis general de un operador condicional ternario que es
*equivalente al condicional if es la siguiente
*
*<cond> ? <bloque_1> : <bloque_2>;
*/
package condicionales;

/*
*La siguiente función permite calcular el valor absoluto de un número real,
*pero utilizando el operador condicional ternario en vez del condicional if
*presentado en un ejemplo previo
*/
public class Ternario {
    
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
