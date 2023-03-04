/*
Un algoritmo para obtener el mínimo número positivo de la máquina que
usa un ciclo hacer-mientras (do)
 */
package EstructurasCiclicas;

/**
 *
 * @author yamid
 */
public class DoWhile_Ejemplo1 {
    
    public static double minMaquina() {
        double Xo = 1.0;
        double Xi = Xo / 2;
        do {
            Xo = Xi;
            Xi = Xo / 2.0;
        } while (Xi > 0.0);
        return Xo;
    }
    
    public static void main(String[] args){
        
        System.out.println(minMaquina());
    }
    
}
