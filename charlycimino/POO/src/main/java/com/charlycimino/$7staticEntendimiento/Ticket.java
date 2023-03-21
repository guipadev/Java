package com.charlycimino.$7staticEntendimiento;

public class Ticket {

    // Se debe poner en la clase y no en cada objeto

    // Sera un valor que compartan todos los tickets
    private static int contador = 0;
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket(String fechaCompra, String DNIPersona) {
        contador++; // modificara cada vez un valor de la clase
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        this.DNIPersona = DNIPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numero=" + numero +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", DNIPersona='" + DNIPersona + '\'' +
                '}';
    }
}
