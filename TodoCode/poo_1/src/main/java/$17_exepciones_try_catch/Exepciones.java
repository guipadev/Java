package $17_exepciones_try_catch;

public class Exepciones {

    public static void main(String[] args) {
        
        // Si no capturamos esta operación genera un error en el sistema, el cual nos indica
        // Pero el usuario no sabra el porque, pero ahora al capturarla le diremos
        
        try { // Exception aritmetica porque no se puede dividir en 0
            int resultado = 3/0;
        }
        catch (Exception e) {
            System.out.println("No se puede dividir por cero!!!");
        }
        
        // Caso de arreglo, que seleccione una posicion inexistente
        int edades [] = {15, 12, 23, 30};
        
        try {
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        }
        catch (Exception e){
            System.out.println("Intentas acceder a un índice que no existe");
        }
    }
    
    
}
