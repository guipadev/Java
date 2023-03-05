/*
Lo primero que se puede determinar es que se puede cambiar la condición del ciclo para que deje
de ser siempre verdadera por una que dependa del valor del dato leído (que es lo que se usa para
ejecutar la instrucción break). Lo otro importante es que se debe leer al menos una vez un dato,
ya sea para no leer más datos (si el usuario ingresa 0), o para sumarlos.
De esta manera se puede usar el ciclo hacer-mientras (do). Por lo tanto, la
eliminación del break produce el algoritmo que se muestra a continuación
 */
package $04_While;

import java.util.Scanner;

public class DoWhile_Ejemplo2NOBreack {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int dato = 0;
        int suma = 0;

        do {
            System.out.print("Ingrese un número entero\n a sumar o 0 para salir: ");
            dato = Integer.parseInt(sc.nextLine());
            suma += dato;
        } while (dato != 0);
        System.out.println("La suma es: " + suma);
    }
}