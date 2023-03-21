package com.charlycimino.$6atributosTipoObjeto;

public class Motor {

    private String numero;
    private double cilindrada;
    private String tipo;

    public Motor(String numero, double cilindrada, String tipo) {
        this.numero = numero;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public void setCilindrada(double cilindrada) {
        if (cilindrada > 0) {
            this.cilindrada = cilindrada;
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                "numero='" + numero + '\'' +
                ", cilindrada=" + cilindrada +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
