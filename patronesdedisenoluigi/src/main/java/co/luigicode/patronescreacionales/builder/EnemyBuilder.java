package co.luigicode.patronescreacionales.builder;

/**
 * En este patron como ves uno de los inconvenientes es duplicar absolutamente todas las clases
 * que implemente este patrón, lo cual es doble de trabajo y número de clases
 * Pero luego compensa, sobre todo para el cliente que utilice esta clase, ya que solo llama al Builder
 * y solo pone los atributos necesarios que se necesiten
 */
public class EnemyBuilder {

    private String name;
    private String type;
    private int health;
    private int damage;
    private int endurance;

    /**
     * Generación normal de los Getters, ya que siempre debe devolver algo, porque estamos
     * accediendo a los valores privados, si es un String debe devolver un String y asi sucesivamente
     */

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getEndurance() {
        return endurance;
    }

    /**
     * Los Setters puede ser void()
     * public void setName(String name){this.name = name;}
     * O que devuelva algo como un boolean
     * public void setName(String name){if(name == null) return false this.name = name; return true}
     */

    // Pero queremos que todos los Setter devuelva la misma clase EnemyBuilder
    public EnemyBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EnemyBuilder type(String type) {
        this.type = type;
        return this;
    }

    public EnemyBuilder health(int health) {
        this.health = health;
        return this;
    }

    public EnemyBuilder damage(int damage) {
        this.damage = damage;
        return this;
    }

    public EnemyBuilder endurance(int endurance) {
        this.endurance = endurance;
        return this;
    }

    // El método Build seria un Enemy public y se pasa todo lo que tiene y queda implementado
    // Como el que se usa en lombok
    public Enemy build(){
        Enemy enemy = new Enemy();
        enemy.setName(getName());
        enemy.setType(getType());
        enemy.setHealth(getHealth());
        enemy.setEndurance(getEndurance());
        enemy.setDamage(getDamage());
        return enemy;
    }
}
