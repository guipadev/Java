package $11_ejercicio_pokemon_interfaces_clases_abstractas;

public class Main {
    
    public static void main(String[] args) {
        
        // Creación de objetos
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        // Llamado de métodos
        squirtle.atacarAraniazoe();
        squirtle.atacarHidrobomba();
        
        charmander.atacarAraniazoe();
        charmander.atacarLanzallamas();
        
        bulba.atacarAraniazoe();
        bulba.atacarDrenaje();
        
        pika.atacarAraniazoe();
        pika.atacarImpactrueno();
    }
    
}
