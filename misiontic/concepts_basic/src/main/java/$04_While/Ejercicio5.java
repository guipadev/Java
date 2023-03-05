/*
Diseñar una función que permita calcular el épsilon de la máquina. El épsilon de máquina es el número decimal
más pequeño que sumado a 1 se puede representar de manera precisa en la máquina (que no es redondeado),
es decir, retorna un valor diferente de 1, éste da una idea de la precisión o número de cifras reales que
pueden ser almacenadas en la máquina. La idea es realizar un ciclo en el cual se realiza la operación 1 + ε
para potencias 2 desde ε = 2 0 y continuando con ) ( de −1 potencias decrecientes de 2 ε = 2 , ε = 2 −2 ,
ε = 2 −3 , ε = 2 −4 , . . .
hasta obtener que el resultado de la suma 1 + ε no se altere.
 */
package $04_While;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa valor episilon ej. 1.0: ");

        double dato = Double.parseDouble(sc.nextLine());

        System.out.println(calcularEpsilonMaquina(dato));

    }

    public static double calcularEpsilonMaquina(double dato) {

        double epsilon = dato;

        while (1.0 + (epsilon / 2.0) != 1.0) {
            epsilon /= 2.0;
        }
        return epsilon;
    }

}
