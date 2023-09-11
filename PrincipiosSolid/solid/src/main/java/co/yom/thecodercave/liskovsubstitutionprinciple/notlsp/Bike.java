package co.yom.thecodercave.liskovsubstitutionprinciple.notlsp;

/**
 * Nos obliga implementar todas las implementaciones de la interfaz
 * Implementaciones como despegar o aterrizar no funcionan para cicla
 * Lo cual rompe el principio, por eso para dichos metodos si los usamos
 *  * recibiremos una excepcion
 */
public class Bike implements Vehicle {
    @Override
    public void Park() {

    }

    @Override
    public void Land() {

    }

    // Despegar no lo podemos implementar
    @Override
    public void TakeOff() {
        throw new RuntimeException();
    }

    // Aterrizar no lo podemos implementar
    @Override
    public void Brake() {
        throw new RuntimeException();
    }

    @Override
    public void SpeedUp() {

    }
}
