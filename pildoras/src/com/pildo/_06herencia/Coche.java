package com.pildo._06herencia;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientosCuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 3600;
        motor = 1600;
        peso_plataforma = 500;
    }

    // Getters
    public String dimeDatosGenerales() {
        return "La plataforma del vehiuclo tiene " + ruedas + " llantas " +
                ". Mide " + largo/1000 + " metros con un ancho " + ancho + " cm " +
                ". Peso " + peso_plataforma + " kg";
    }

    public String dimeColor() {
        return "El color del coche es " + color;
    }

    // Setters
    public void estableceColor(String colorCoche) {
        color = colorCoche;
    }

    // this referencia a la var y la otra hace referencia al argumento
    public void configuraAsientos(String asientosCuero) {
        //(asientosCuero == "si") ? this.asientosCuero=true : this.asientosCuero=false;
        if (asientosCuero.equalsIgnoreCase("si")) { this.asientosCuero = true; }
        else {this.asientosCuero = false;}
    }

    // Getter
    public String dimeAsientos() {
        if(asientosCuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientso de serie";
        }
    }

    // Setter
    public void configurarClimatizador(String climatizador) {
        if(climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    // Getter
    public String dimeClimatizador() {
        if (climatizador == true) {
            return "Coche incorpora AA";
        } else {
            return "Coche NO tiene AA";
        }
    }

    // Setter + Getter: practica no recomendada
    public String dimePesoCoche() {
        int pesoCarroceria = 500;
        peso_total = peso_plataforma + pesoCarroceria;

        if (asientosCuero == true) { peso_total = peso_total + 50; }
        if (climatizador == true) { peso_total = peso_total + 20; }

        return "El peso del coche es " + peso_total;
    }

    public int precioCoche() {
        int precioFinal = 10000;

        if (asientosCuero == true) { precioFinal += 2000; }
        if (climatizador == true) { precioFinal += 1500; }

        return precioFinal;
    }

    public void estableestableceColor(String rojo) {
        this.color = color;
    }
}