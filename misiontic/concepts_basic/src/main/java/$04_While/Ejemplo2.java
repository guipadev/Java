package $04_While;

public class Ejemplo2 {
    
    public static void main(String[] args){
        int i = 2;
        int j = 25;
        
        while (i < 25){
            // imprime los valores de i y j
            System.out.println(i + ", " + j);

            i = i * 2;  // i se multíplica por 2 en cada paso

            j = j + 10; // se incrementa de 10 en 10
        }
        // se ejecuta al terminar el ciclo
        System.out.println("the end.");
        System.out.println(i + ", " + j);// valores finales de i y j
    }    
}
