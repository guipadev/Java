package $11_ejercicio_integrador_pokemon_poo_interfaces_clases_abstractas;

public class Pikachu extends Pokemon implements IElectrico {
    
    // Existir al menos un parametro en la clase
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu ataque aplacaje");
    }

    @Override
    protected void atacarAraniazoe() {
        System.out.println("Pikachu ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ataque impacto trueno 80 power");
    }

    @Override
    public void atacarPunioTrueno() { 
        System.out.println("Pikachu ataque puño tureno 95 power");
    }

    
    
}
