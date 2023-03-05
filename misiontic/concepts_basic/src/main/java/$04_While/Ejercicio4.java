/*
En 2022 el país A tendrá una población de 25 millones de habitantes y el país B de 18.9 millones.
Las tasas de crecimiento anual de la población serán de 2% y 3% respectivamente.
Desarrollar un algoritmo para informar en que año la población del país B superará a la de A.
 */
package $04_While;
public class Ejercicio4 {
    
    public static void main(String[] args){
        
        String paisA = "Venezuela";
        String paisB = "Ecuador";
    
        int year = 2020;
        long poblacionA = 250000000;
        long poblacionB = 180090000;
        int tasaCreceA = 2;
        int tasaCreceB = 3;
   
        while(poblacionB < poblacionA){
            poblacionA = poblacionA + (poblacionA * tasaCreceA / 100);
            poblacionB = poblacionB + (poblacionB * tasaCreceB / 100);
            year = year + 1;
            
        }
        System.out.println("El año que el pais "+ paisB + " supera a " + paisA + " es en el año: " + year);
        System.out.println(paisA + " tendria una poblacion de: "+ poblacionA);
        System.out.println(paisB + " tendria una poblacion de: "+ poblacionB);
    }
    
}
