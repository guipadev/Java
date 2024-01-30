package $11_ejercicio_integrador_pokemon_poo_interfaces_clases_abstractas;

// Que hace - utilizar INTERFACES
// Que es - utilizar CLASES ABSTRACTAS

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    // Método abstracto que no tienen implementación
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazoe();
    protected abstract void atacarMordisco();
    
}
