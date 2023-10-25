package co.luigicode.patronescomportamiento.mediator;

/**
 * El objetivo que las clases reduzcan el acoplamiento
 * que eviten tener una lista de objetos todas ellas
 * para no estar cargandolos
 * Ya va a ver una clase que se encarga de eso, de tener la lista
 * Y al momento que alla que enviar un msj pues lo hace ella
 * Patron muy parecido al observable
 */
public class TestMediator {

    public static void main(String[] args) {

        /*
        // SIN USO DE PATRON MEDIADOR
        // Problema que hay que ir añadiendo los enemigos
        Enemigo enemigo1 = new Enemigo("Thanos");
        Enemigo enemigo2 = new Enemigo("Ulron");
        Enemigo enemigo3 = new Enemigo("Looki");

        // Si son 20 o 30 o más se pone la cosa fea
        enemigo1.agregar(enemigo2);
        enemigo1.agregar(enemigo3);

        enemigo2.agregar(enemigo1);
        enemigo2.agregar(enemigo3);

        enemigo3.agregar(enemigo2);
        enemigo3.agregar(enemigo1);

        enemigo1.enviar();
         */

        Mediador mediador = new Mediador();

        Contrincante enemigo1 = new Contrincante("Pichachu", mediador);
        Contrincante enemigo2 = new Contrincante("Squart", mediador);
        Contrincante enemigo3 = new Contrincante("Bolvasour", mediador);

        Parcero parcero = new Parcero("Parcero paisa", mediador);

        enemigo1.enviar();
    }
}
