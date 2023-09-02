package co.yom.inversiondeDependencia.DIP;

/**
 * Principio de Inversión de Dependencia (DIP):
 * Este principio establece que los módulos de alto nivel no deben depender de los
 * módulos de bajo nivel, sino que ambos deben depender de abstracciones.
 * Además, las abstracciones no deben depender de los detalles, sino que los detalles
 * deben depender de las abstracciones.
 */
public class Switch {

    private Switchable device;

    void connectToDevice(Switchable device) {
        this.device = device;
    }

    void flip() {
        device.turnOn();
    }
}
