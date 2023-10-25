package co.luigicode.patronescomportamiento.mediator;

public interface Combate {

    void enviar();

    // De quien a recibido el msj
    void recibido(Combate combate);
}
