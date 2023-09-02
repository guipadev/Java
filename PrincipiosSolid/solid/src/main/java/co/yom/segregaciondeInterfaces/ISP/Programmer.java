package co.yom.segregaciondeInterfaces.ISP;

/**
 * Principio de Segregación de Interfaces (ISP):
 * Este principio sugiere que es mejor tener interfaces más pequeñas y específicas
 * en lugar de interfaces grandes y genéricas.
 */
public class Programmer implements Workable, Eatable, Sleepable {
    @Override
    void work() {
        // Lógica para programar
    }

    @Override
    void eat() {
        // Lógica para comer
    }

    @Override
    void sleep() {
        // Lógica para dormir
    }
}
