package usoLambda;

/**
 * Una interfaz funcional es toda aquella que solamente tiene un metodo abstracto
 */

@FunctionalInterface
public interface Ejecutor {

    void ejecutar();

    default void metodoDefecto() {}

    static void metodoEstatico() {}
}
