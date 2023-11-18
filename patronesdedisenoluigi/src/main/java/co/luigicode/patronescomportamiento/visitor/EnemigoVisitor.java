package co.luigicode.patronescomportamiento.visitor;

/**
 * Clase que implementa la interface Visitor
 * Y los métodos son llamados por medio de Visitor
 */
public class EnemigoVisitor implements Visitor {
    @Override
    public void visitar(Guerrero guerrero) {
        System.out.println("Visitando al GUERRERO");
        guerrero.ataquePoder();
    }

    @Override
    public void visitar(Mago mago) {
        System.out.println("Visitando al MAGO");
        mago.ataqueElemento();
    }

    @Override
    public void visitar(Asesino asesino) {
        System.out.println("Visitando al ASESINO");
        asesino.ataqueSigilo();
    }
}
