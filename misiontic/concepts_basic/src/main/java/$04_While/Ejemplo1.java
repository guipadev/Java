package $04_While;

public class Ejemplo1 {
    
    public static void main(String [] args){
        int i = 0;  
        
        while (i <= 6){
            System.out.println(i);
            i = i + 1;
        }
    
        // se ejecuta al terminar el ciclo
        System.out.println (i);
    }
    
}
