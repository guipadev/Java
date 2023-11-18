package co.luigicode.patronescomportamiento.visitor;

public interface Visitable {

    // Método normalmente llamado accept
    void accept(Visitor visitor);
}
