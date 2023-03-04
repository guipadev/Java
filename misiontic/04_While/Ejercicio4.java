/*
En 2022 el país A tendrá una población de 25 millones de habitantes
y el país B de 18.9 millones. Las tasas de crecimiento anual de la
población serán de 2% y 3% respectivamente. Desarrollar un
algoritmo para informar en que año la población del país B superará a
la de A.
 */
package EstructurasCiclicas;


public class Ejercicio4 {
    
    public static void main(String[] args){
        
        String ciudad1 = "Ibague";
        String ciudad2 = "Neiva";
    
        int year = 2020;
        int poblacionA = 250;
        int poblacionB = 189;
        int tasaCreceA = 2;
        int tasaCreceB = 3;
   
        while(poblacionB < poblacionA){
            poblacionA = poblacionA + (poblacionA * tasaCreceA / 100);
            poblacionB = poblacionB + (poblacionB * tasaCreceB / 100);
            year = year + 1;
            
        }
        System.out.println("El año que la ciudad "+ ciudad2+" supera a "+ciudad1+ " es en el año: " +year);
        System.out.println(ciudad1+" tendria una poblacion de: "+poblacionA);
        System.out.println(ciudad2+" tendria una poblacion de: "+poblacionB);
    }
    
}
