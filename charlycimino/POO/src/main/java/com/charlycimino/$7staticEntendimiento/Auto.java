package com.charlycimino.$7staticEntendimiento;

public class Auto {

    private String patente;
    private  String marca;
    private double precio;
    private String color;

    // Variable de clase, el cambio aqui se refleja en todos
    // En vez de estar aplicando descuenta a c/u carro utilizando mas memoria
    private static double dcto;

    public Auto(String patente, String marca, double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        // forma correcta
        Auto.dcto = 10;
    }

    // Uso variable static del descuento
    public double precioPromocional() {

        return this.precio - this.precio * Auto.dcto / 100;
    }

    // Al afectar la variable static afecta a todos
    // Pero al ponerlo static se vuelve parte de la clase y cada instancia debe solicitarlo
    public static void anularDescuento() {

        Auto.dcto = 0;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
