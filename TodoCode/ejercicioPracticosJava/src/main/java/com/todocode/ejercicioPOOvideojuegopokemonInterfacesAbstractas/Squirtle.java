package com.todocode.ejercicioPOOvideojuegopokemonInterfacesAbstractas;

public class Squirtle extends Pokemon implements IAgua{

    // Existir al menos un parametro en la clase
    public Squirtle() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ataque aplacaje");
    }

    @Override
    protected void atacarAraniazoe() {
        System.out.println("Squirtle ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataque hidrobomba 95 power");    
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataque burbujas 50 power");    
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataque pistola agua 90 power");    
    }
}
