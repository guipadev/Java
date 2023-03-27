package com.company;

public class PropiedadPrivada_Encapsula_Abstraccion {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.tipo = "Coche";
        System.out.println(vehiculo.tipo);

        Robot deceptico = new Robot();
        deceptico.setTipo("animales");
        String tipo = deceptico.getTipo();
        deceptico.setPoderMaximo(60);
        deceptico.setRapido(true);

        System.out.println(tipo); // System.out.println(robot.getTipo());

        Robot autobus = new Robot();
        autobus.setTipo("carros");
        autobus.setPoderMaximo(50);
        autobus.setRapido(false);

        System.out.println(autobus.getTipo());
        System.out.println(autobus.getPoderMaximo());
        System.out.println(autobus.getTipo() + " " + autobus.getPoderMaximo());
        System.out.println(deceptico.isRapido());
        System.out.println(autobus.isRapido());

    }
}
// Clase Publica
class Vehiculo {
    String tipo;
}

// Clase Privada
class Robot {
    private String tipo;
    private int poderMaximo;
    private boolean rapido;

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    // Por conveción las boolean se declaran diferente
    public boolean isRapido() {
        return rapido;
    }

    // Generados automaticamente
    public int getPoderMaximo() {
        return poderMaximo;
    }

    public void setPoderMaximo(int poderMaximo) {
        this.poderMaximo = poderMaximo;
    }

    // Realizado Manualmente
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return  this.tipo;
    }
}

// Clase abstrata
abstract class Superheroe {
    private String poder;
    private int agilidad;
    private String sonido;

    // Funciones que si debemos programarlos para implementarlos
    abstract public void setSonido(String sonido);
    abstract public String getRapido();

    public String getPoder() {
        return poder;
    }

    // Funciones ya programadas a utilizar
    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }
}
