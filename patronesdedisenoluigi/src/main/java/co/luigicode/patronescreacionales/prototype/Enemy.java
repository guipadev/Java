package co.luigicode.patronescreacionales.prototype;

/**
 * De ser una entidad normal, se pasa a tipo abstracta
 * Para tener Clases Hijas Guerrero y Mago
 */
public abstract class Enemy {

    // Protected para ser accesible a las clase hijas
    // Vida
    protected int health;
    // Daño
    protected int damage;

    //public Enemy() { }

    /**
     * Algo caracteristico del patron prototype es que se debe tener un constructor
     * que se pasa así mismo
     */
    public Enemy(Enemy enemy) {
        // Comprobamos que no sea nulo
        if (enemy != null) {
            setHealth(enemy.getHealth());
            setDamage(enemy.getDamage());
        }
    }

    // Tendremos un método abstracto para clonar y cada clase hija lo implementa a su manera
    public abstract Enemy clone();

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public Enemy setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getDamage() {
        return damage;
    }

    public Enemy setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    /*
    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", damage=" + damage +
                '}';
    }
     */
}
