/*
la instrucción break es utilizada por programadores ya sea
por facilidad (algunos no realizan un buen diseño de los algoritmos
cíclicos), a veces por velocidad de ejecución (sin verificar las condiciones
de continuación o terminación del ciclo), ésta última situación es muy
común cuando se usan ciclos de tipo para (for).

Desarrollar un programa que lea números enteros y los sume hasta que lea
un cero (0).
 */
package $04_While;

import java.util.Scanner;

public class DoWhile_Ejemplo1Breack {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        while (true) {
            System.out.print("Ingrese un número entero a sumar o 0 para salir: ");

            int dato = Integer.parseInt(sc.nextLine());

            if (dato == 0) {
                break;
            }
            suma += dato;
        }

        System.out.println("La suma es: " + suma);
    }
}
/*
Se puede ver que el ciclo siempre se ejecutaría (su condición siempre es
verdadera) por lo que la instrucción break se utiliza para poder salir
cuando el usuario ingresa un cero (0).

Todo programa con un ciclo mientras (while) que tenga una instrucción
break se puede ajustar para que no la use, sin embargo, el proceso de
eliminar dicha instrucción requiere leer y entender correctamente el papel
de la instrucción break en el ciclo. Cuando se usa por velocidad en los
ciclos para (for), es muy difícil (sino imposible) eliminarla.
*/
