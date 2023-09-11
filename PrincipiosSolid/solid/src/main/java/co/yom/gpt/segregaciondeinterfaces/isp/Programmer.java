package co.yom.gpt.segregaciondeinterfaces.isp;

/**
 * Principio de Segregación de Interfaces (ISP):
 * Este principio sugiere que es mejor tener interfaces más pequeñas y específicas
 * en lugar de interfaces grandes y genéricas.
 */
public class Programmer implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        // Lógica para programar
    }

    @Override
    public void eat() {
        // Lógica para comer
    }

    @Override
    public void sleep() {
        // Lógica para dormir
    }
}
