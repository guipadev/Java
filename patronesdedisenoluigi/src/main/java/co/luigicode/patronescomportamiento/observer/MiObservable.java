package co.luigicode.patronescomportamiento.observer;

public interface MiObservable {

    void subscribirse(MiObservador observador);
    void desescribirse(MiObservador observador);

    void enviaMsj();
}
