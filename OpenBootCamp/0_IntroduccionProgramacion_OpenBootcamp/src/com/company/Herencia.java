package com.company;

public class Herencia {

    public static void main(String[] args) {
        Avioneta avioneta = new Avioneta();
        avioneta.velocidadMaxima = 14;
        avioneta.matricula = "ABC 1234 ES";

        AvionComercial avionComercial = new AvionComercial();
        avionComercial.velocidadMaxima = 12;
        avionComercial.matricula = "CZA 123 ES";
        avionComercial.setSonido("BRRR");

        System.out.println(avionComercial.compruebaMatricula("XXX"));
        System.out.println(avionComercial.getSonido());
    }
}

// Esta clase no se puede instanciar al ser abstrata
abstract class Avion {
    int velocidadMaxima;
    String matricula;
    String sonido;

    // Constructor
    public Avion() {
        System.out.println("Estoy en el constructor Avion");
    }

    // Estoy obligatoriamente debe implementarse las clase que herenden
    abstract public String getSonido();
    abstract public void setSonido(String sonido);

    /*
    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    */

    public  boolean compruebaMatricula(String matricula) {
        if (matricula == "XXX") {
            return true;
        }
        return false;
    }
}

class Avioneta extends Avion {
    // Al heredar debo implementar la abstracción
    public String getSonido() {
        // return this.sonido;
        return "Soy un supersonido: " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class AvionComercial extends Avioneta {}

