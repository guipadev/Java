package co.luigicode.patronescomportamiento.visitor;

/**
 * Es un patrón que vamos a utilizar cuando tenemos una estructura de clases un poco complicada
 * y queremos hacer operaciones en estas clases. Y tambien tenemos un objetivo que seria NO modificarlas
 * Es decir muchas clases complicadas, queremos introducir un método nuevo
 * Pero no nos interesa modificarlas
 * En vez de ponen operaciones nuevas, lo que se hace es usar el patron visitor
 * Lo cual se separa las operaciones en unas clases externas y estas externas seria los visitor(visitantes)
 *
 */
public class TestVisitor {

    public static void main(String[] args) {

        Guerrero vikingo = new Guerrero("Olafo");
        Mago blanco = new Mago("Merlin");
        Asesino francotirador = new Asesino("Robin Hood");

        EnemigoVisitor visitor = new EnemigoVisitor();
        visitor.visitar(vikingo);
        System.out.println("======================================");
        visitor.visitar(blanco);
        System.out.println("======================================");
        visitor.visitar(francotirador);
        System.out.println("======================================");
    }
}
