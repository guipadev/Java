package co.luigicode.patronescreacionales.prototype;

public class Mage extends Enemy {

    private int mana;

    public Mage(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    /**
     * Algo caracteristico del patron prototype es que se debe tener un constructor
     * que se pasa así mismo
     */
    public Mage(Mage mage) {
        super(mage);
        if (mage != null) {
            setMana(mage.getMana());
        }
    }

    @Override
    public Enemy clone() {
        return new Mage(this);
    }


    public int getMana() {
        return mana;
    }

    public Mage setMana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "mana=" + mana +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }


}
