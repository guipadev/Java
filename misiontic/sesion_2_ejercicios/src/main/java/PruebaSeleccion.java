/* Ejercicio: Prueba de selección

Leer 4 valores enteros A, B, C y D.
Si B es mayor que C y D es mayor que A y si la suma de C
y D es mayor que la suma de A y B
y si C y D fueran valores positivos y si A es par,
escriba el mensaje “Valores aceptados” sin comilas. De lo contrario,
escriba el mensaje “Valores no aceptados” sin comillas.

Entrada
La entrada corresponde a 4 valores enteros

Salida
En la salida se debe mostrar las palabras "Valores aceptados" ó "Valores no aceptados" sin comillas dependiendo de si cumplen el criterio o no.

Ejemplo 1:
Entrada     Salida
5
6
7           Valores no aceptados
8

Ejemplo 2:
Entrada     Salida
2
3
2           Valores aceptados
6


 */
import java.util.Scanner;
public class PruebaSeleccion {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el valor de A:");
        int a = sc.nextInt();

        System.out.println("Ingrese el valor de B:");
        int b = sc.nextInt();

        System.out.println("Ingrese el valor de C:");
        int c = sc.nextInt();

        System.out.println("Ingrese el valor de D:");
        int d = sc.nextInt();

        if(b > c && d > a && (c+d) > (a+b) && c>0 && d>0){
            System.out.println("Valores aceptados");
        }else{
            System.out.println("Valores no aceptados");
        }
    }
}
