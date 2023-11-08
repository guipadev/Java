package co.luigicode.patronescomportamiento.strategy;

/**
 * Tiene variantes Guerrero, Mago, Asesino y todas estas clase difieren de la implementación
 * de un método, el resto son iguales
 */
public class Enemigo {

    private String nombre;
    private AtaqueStrategy ataqueStrategy;

    public Enemigo(String nombre) {
        this.nombre = nombre;
        ataqueStrategy = new AtaqueArma();
    }

    // Las clases solo difieren de un metodo por lo tanto con una clase generica
    // Así solo tendriamos que modifica este método. Porque si hay muchas clases y el método
    // es largo utilizamos Strategy y si hay pocas clases y el método es sencillo, solo con if y else es mejor o switch case
    public void ataque(Jugador jugador) {
        ataqueStrategy.ataque(jugador);
    }

    /*
    public void ataque(String tipo) {
        ataqueStrategy.ataque();


        //Esto puede crecer más por lo cual se aplica el estrategia

        if(tipo.equalsIgnoreCase("guerrero")) {
            System.out.println("guerrrero ataque");
            System.out.println("guerrrero ataque");
            System.out.println("guerrrero ataque");
            System.out.println("guerrrero ataque");
            System.out.println("guerrrero ataque");
            System.out.println("guerrrero ataque");
            System.out.println("guerrrero ataque");
            System.out.println("guerrrero ataque");
        }
        else if (tipo.equalsIgnoreCase("mago"))
            System.out.println("mago ataque");
        else
            System.out.println("armar ataque");
         */

    public String getNombre() {
        return nombre;
    }

    public Enemigo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public AtaqueStrategy getAtaqueStrategy() {
        return ataqueStrategy;
    }

    public Enemigo setAtaqueStrategy(AtaqueStrategy ataqueStrategy) {
        this.ataqueStrategy = ataqueStrategy;
        return this;
    }
}

