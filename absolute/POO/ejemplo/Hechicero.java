package Absolute.POO.ejemplo;

public class Hechicero extends Personaje {

    private int poder;

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    /**
     * Uso de POLIMORFISMO al cambiar a un saludo propio
     */
    @Override
    public void saludar() {
        System.out.println("Soy un hechicero \uD83E\uDDD9\u200D♂\uFE0F !!!");
    }
}
