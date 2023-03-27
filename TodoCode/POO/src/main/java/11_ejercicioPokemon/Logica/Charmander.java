package ejercicioPokemon.Logica;

public class Charmander extends Pokemon implements IFuego {

    // Existir al menos un parametro en la clase
    public Charmander() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ataque aplacaje");
    }

    @Override
    protected void atacarAraniazoe() {
        System.out.println("Charmander ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataque puño fuego 80 power");    
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataque lanza llamas 90 power");    
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataque ascuas 60 power");    
    }
    
    
}
