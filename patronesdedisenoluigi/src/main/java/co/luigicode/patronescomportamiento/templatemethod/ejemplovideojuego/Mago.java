package co.luigicode.patronescomportamiento.templatemethod.ejemplovideojuego;

public class Mago extends EnemigoPlantilla {
    @Override
    public void setVidas() {
        System.out.println("Vida: 250, Mana: 1000, Estamina: 100");
    }

    @Override
    public void ataque() {
        System.out.println("Mago ataca");
    }

    @Override
    public void proteccion() {
        System.out.println("Mago protege");
    }

    @Override
    public void resultado() {
        System.out.println("Mago ha sobrevivido");
    }
}
