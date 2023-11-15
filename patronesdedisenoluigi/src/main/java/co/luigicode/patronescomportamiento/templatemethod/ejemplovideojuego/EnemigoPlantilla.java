package co.luigicode.patronescomportamiento.templatemethod.ejemplovideojuego;

public abstract class EnemigoPlantilla {

    public abstract void setVidas();

    public abstract void ataque();

    public abstract void proteccion();

    public abstract void resultado();

    public final void plantilla() {
        setVidas();
        ataque();
        proteccion();
        resultado();
    }
}
