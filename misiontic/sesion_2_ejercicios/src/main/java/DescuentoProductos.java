/*
Una tienda tiene las siguientes promociones
Si un cliente lleva más de 5 productos del mismo tipo le realizan un descuento del 5%. 
Si lleva más de 10 productos del mismo tipo le realizan un descuento del 10%. 
Si lleva más de 20 productos del mismo tipo le realizan un descuento del 20%. 
Construya un programa que dado el número de productos y el precio de cada producto 
determine el valor a pagar por el cliente.
 */
import java.util.*;

public class DescuentoProductos {
    public static double pagoFinal(int n, double precio) {

        if (n <= 5) {
            return n * precio;
        } else if (5 < n && n <= 10) {
            return n * precio * 0.95;
        } else if (10 < n && n <= 20) {
            return n * precio * 0.90;
        } else {
            return n * precio * 0.80;
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Ingrese cantidad de productos:");
        int producto = sc.nextInt();
       
       System.out.println("Ingrese el Valor de la compra:");
       double precio = sc.nextDouble();
        
            System.out.println("El valor a pagar es: "+pagoFinal(producto, precio));
            //System.out.println("El valor a pagar es: "+pagoFinal(valor));
    }
}
