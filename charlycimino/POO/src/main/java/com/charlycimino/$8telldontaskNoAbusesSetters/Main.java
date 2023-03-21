package com.charlycimino.$8telldontaskNoAbusesSetters;

public class Main {

    // TELL, DON'T ASK": No abuses de los getters ❌
    // El setter le da la oportunidad de realizar la logica en otra clase, hay que analizar
    // si en vez de usarlo realizar dicha logica en su clase raiz y delegarla mas dentro de la profundida del codigo?
    // Este concepto se basa en distribuir la logica de forma tal que cada objeto haga un poco de ella
    // Y no centralizarlo todo en un solo lugar, porque si no estariamos volviendo de a poco al paradigma estructurado

    public static void main(String[] args) {

        Motor motorcito = new Motor("12345", 1.8, "Nasca");
        Auto auto = new Auto("WXY123", "Fiat", 34136, "Verde", motorcito);

        // Toda esta logica la debe manejar el objeto, no desde esta clase
        // Por ende utilizamos un metodo para acelearar sin necesidad de conocer que existe motor
        // Asi no tenemos dependencia de la clase Motor y tampoco necesitamos saber que existe el motor
        System.out.println(auto);
        //auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales() + 1000);
        auto.acelerar();
        System.out.println(auto);
        //auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales() + 1000);
        auto.acelerar();
        System.out.println(auto);
    }
}
