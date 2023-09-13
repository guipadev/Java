package co.luigicode.patronescreacionales.prototype;

public class Warrior extends Enemy {

    private int endurance;

    // Constructor de la clase padre
    public Warrior(int health, int damage, int endurance) {
        super(health, damage);
        this.endurance = endurance;
    }

    // Constructor propio del patron prototype
    // Constructor que se tiene así mismo
    public Warrior(Warrior warrior) {
        super(warrior);
        // Comprobar que no es nulo
        if (warrior != null) {
            setEndurance(warrior.getEndurance());
        }
    }

    @Override
    public Enemy clone() {
        // Se pasa así mismo como parametro y llama un constructor el que lleva al guerrero
        return new Warrior(this);
    }

    public int getEndurance() {
        return endurance;
    }

    public Warrior setEndurance(int endurance) {
        this.endurance = endurance;
        return this;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "endurance=" + endurance +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
