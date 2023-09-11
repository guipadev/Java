package co.yom.thecodercave.liskovsubstitutionprinciple.notlsp;

/**
 * Nos obliga implementar todas las implementaciones de la interfaz
 * Implementaciones como despegar o aterrizar no funcionan para carro
 * Lo cual rompe el principio, por eso para dichos metodos si los usamos
 * recibiremos una excepcion
 */
public class Car implements Vehicle {
    @Override
    public void Park() {

    }

    @Override
    public void Land() {

    }

    @Override
    public void TakeOff() {

    }

    @Override
    public void Brake() {

    }

    @Override
    public void SpeedUp() {

    }
}
