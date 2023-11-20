package co.guipadev.optional;

import java.util.Optional;

/**
 * Optional
 * Es una clase contenedora que se introdujo en Java 8, para tener una forma más elegante de manejar valores nulos.
 * También Optional funciona en conjunto con lambdas y transmisiones.
 * Además, cuando se trata de opciones, puede usar directamente (lo que significa que no tiene que llamar stream()
 * al método primero) métodos como y map(). filter() flatMap()
 */
public class AppOptional {

    /**
     * Puede crear un opcional usando Optional.of(T value), Optional.ofNullable(T value);
     * la diferencia entre los dos es que of solo espera valores no nulos y generará una excepción
     * si el valor pasado es nulo.
     *
     * Por el contrario, ofNullable espera algunos valores nulos y no arrojará un archivo NullPointerException.
     * Ahora, considere el siguiente ejemplo:
     */
    static void ofVSofNullable(){
        try {
            Optional.of(null);
        } catch (NullPointerException npe){
            System.out.println("Passed null to .of method");
        }
        Optional.ofNullable(null);
        System.out.println("It worked");
    }

    /**
     * Por supuesto, esto generará lo siguiente:
     * Passed null to .of method
     * It worked
     *
     * Aquí debemos tener en cuenta que también podemos crear un uso opcional Optional.empty()
     * que eventualmente tendrá el mismo resultado que Optional.ofNullable(null).
     */

    public static void main(String[] args) {

    }
}
