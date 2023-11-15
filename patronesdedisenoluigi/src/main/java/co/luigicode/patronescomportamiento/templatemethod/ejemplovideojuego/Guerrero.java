package co.luigicode.patronescomportamiento.templatemethod.ejemplovideojuego;

public class Guerrero extends EnemigoPlantilla {
    @Override
    public void setVidas() {
        System.out.println("Vida: 150, Mana: 0, Estamina: 150");
    }

    @Override
    public void ataque() {
        System.out.println("Guerrero ataca");
    }

    @Override
    public void proteccion() {
        System.out.println("Guerrero protege");
    }

    @Override
    public void resultado() {
        System.out.println("Guerrero ha sobrevivido");
    }
}
