package ejercicioPokemon.Logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    // Existir al menos un parametro en la clase
    public Bulbasaur() {
    }

        
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur ataque aplacaje");
    }

    @Override
    protected void atacarAraniazoe() {
        System.out.println("Bulbasaur ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur ataque drenaje 70 power");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur ataque paralizar 40 power");
    }
    
    
    
}
