package co.luigicode.patronescomportamiento.templatemethod;

/**
 * El patron tiene una serie de pasos que se va a llevar a cabo dentro del metodo principal
 * Y cada clase que hereda de este, implementa los pasos a su manera, pero el metodo que contiene
 * la ejecucion de estos pasos se mantine el orden
 *
 * Las clases hijas de Plantilla, implemente cada uno de los metodos de paso
 * Y que estas lo implementen a su manera
 */

/**
 * Ejemplo cuando debemos cubrir un formulario, lo cubres tu o yo, el formulario es el mismo
 * pero varian los pasos, yo pongo mi nombre, y tu pones los apellidos, osea los tuyos no son los mismos
 * Entonces estamos siguiendo los mismos pasos, pero cada uno los cubre a su manera
 */
public abstract class Plantilla {

    public abstract void step1();

    public abstract void step2();

    public abstract void stepN();

    /**s
     * Este nos interesa que ninguno pueda sobreescribirlo
     */
    public final void plantilla() {
        step1();
        step2();
        stepN();
    }
}
