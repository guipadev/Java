package com.charlycimino.$11EJERCICIOintegradorPOOdatafono;

public class Main {

    public static void main(String[] args) {

        Datafono datafono = new Datafono();
        Persona cliente1 = new Persona("445421454", "Shakira", "Mebarack", "1112345878", "shak@gmail.com");
        TarjetaDeCredito tarjetica = new TarjetaDeCredito("Bancorata", "123465437895412", 3000, cliente1, EntidadFinanciera.BIRZA);

        System.out.println("Tarjeta antes del pago");
        System.out.println(tarjetica);

        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = datafono.efectuarPago(tarjetica, 10000, 5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta depues del pago");
        System.out.println(tarjetica);
    }
}
