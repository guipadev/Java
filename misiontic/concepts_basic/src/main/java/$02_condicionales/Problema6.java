/*
Dadas tres longitudes positivas, determinar si con esas longitudes se
puede construir un triángulo.
 */
package $02_condicionales;

import java.util.Scanner;

public class Problema6 {
    
    Scanner lector = new Scanner(System.in);

    public static void main(String[] args){

        Problema6 solucion = new Problema6();
    }

    public Problema6(){
        int a = 0, b = 0, c = 0;
        
        System.out.println("Ingrese lado A");
        a = lector.nextInt();
        
        System.out.println("Ingrese lado B");
        b = lector.nextInt();
        
        System.out.println("Ingrese lado C");
        c = lector.nextInt();
        
        if(a < (b + c)){
            System.out.println("Es un triangulo");
        }else if(b < (a + c) ){
            System.out.println("Es un triangulo");
        }else if(c < (a + b)){
            System.out.println("Es un triangulo");
        }else {
            System.out.println("NO es un triangulo ");
        }
        
        if(a == b && b == c){
            System.out.println("Es triangulo equilatero");
        }else if(a<b && a>b && b<c && b>c && a<c && a>c ) {
            System.out.println("Es Triangulo escaleno");
        }else{ 
             System.out.println("Es isosceles");   
        }
    }
}
