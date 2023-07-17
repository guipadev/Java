package Absolute.POO.ejemplo;

/**
 * - Cuando utilizamos una CLASE y cuando una INTERFACE ??
 * Un PC define como calcular() y todos los que heredan, deben realizarlo de la misma manera
 * Ya que todos los PC sin importar la marca o OS calculan de las misma forma porque tienen CPU
 *
 * Es buena practica implementar INTERFACES, estas no se pueden INSTANCIAR
 *
 * - Cuando usamos una CLASE ABSTRACTA y cuando NO ??
 * Seria en el momento de la abstracción de datos
 *
 * Electodomestico tendra el atributo encender() pero todo los hijos veran como lo implementan
 *
 *
 */
public class App {

    public static void main(String[] args) {

        Personaje hechicero = new Hechicero();

        /**
         * Utilizamos los metodos SET para modificar los atributos heredados
         */
        hechicero.setNombre("Merlin");
        hechicero.setEdad(50);
        hechicero.setTextura("hat.jpg");

        /**
         * Utilizamos el metodo GET para mostrar los valores
         */
        System.out.println(
                "Nombre del mago: " + hechicero.getNombre() + "\n" +
                "Edad del mago: " + hechicero.getEdad() + "\n" +
                        "Textura del mago: " + hechicero.getTextura()
        );

        hechicero.saludar();
    }
}
