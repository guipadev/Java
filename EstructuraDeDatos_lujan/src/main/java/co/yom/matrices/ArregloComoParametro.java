package co.yom.matrices;

/**
 * En Java los primitivos double, float, char.. se pasan por valor
 * osea el valor lo tienes y ya lo puedes trabajar como tu quieras
 * cuando lo estamos pasando como parametro
 *
 * Por contra los objectos siempre se pasan por referencia
 *
 * Los arrays son objectos tambien se pasan por referencia, osea por la dirección
 * Osea cuando se llama un método y se utiliza un Array como parametro
 * se puede cambiar el contenido de los elementos del Array en el método
 *
 */
public class ArregloComoParametro {

    // Por referencia
    public static void modificar(int num[]){
        num[0] = 111;
    }

    // Por valor
    public static void cambio(int x){
        x = 2;
    }

    public static void main(String[] args) {
        // Por referencia, modificamos el arreglo
        int num[] = {1,2,3,4};
        modificar(num);
        System.out.println(num[0]);

        // Por valor
        int x = 1;
        cambio(x);
        System.out.println(x); // no imprime 2 como esta en metodo, si no 1
    }
}
