package co.luigicode.patronescomportamiento.templatemethod.ejemplovideojuego;

public class Test {

    public static void main(String[] args) {

        EnemigoPlantilla sayayin = new Guerrero();
        EnemigoPlantilla namekuzein = new Mago();

        sayayin.plantilla();
        namekuzein.plantilla();

    }
}
