package co.luigicode.patronescomportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase protagonista que es la encargada  de enviar los mensajes
 * En vez de tener una lista por cada objeto, solo vamos a tener una sola lista
 * en esta nueva clase
 */
public class Mediador {

    // Lista de objetos que implementa interfaz
    private List<Combate> combates = new ArrayList<>();

    public void agregar(Combate combate) {
        combates.add(combate);
    }

    public void enviar(Combate combate) {
        for (Combate c: combates)
            if (c != combate) {
                c.recibido(combate);
            }
    }
}
