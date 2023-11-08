package co.luigicode.patronescomportamiento.state;

public interface MisionEstado {

    void siguiente(Mision mision);

    String imprimir();
}
