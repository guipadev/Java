package co.luigicode.patronescomportamiento.visitor;

public interface Visitor {

    // Un método por cada tipo de clase que tengamos que visitar
    void visitar(Guerrero guerrero);
    void visitar(Mago mago);

    void visitar(Asesino asesino);
}
