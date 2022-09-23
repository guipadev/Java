package com.yadevom.interfaz;

public class Main {

    /*
    Una interfaz practicamente es una forma de contrato entre clases que las mismas clases que
    le implementan tienen que proveer sus propias implementaciones

    Osea tu defines metodos que cada clase tiene que implementar y debido a ello tu no sabes
    exactamente que tipo de bloque/logica de negocio tiene cada clase
    lo unico que importa es que cada clase tiene ese metodo necesario
    */

    public static void main(String[] args) {

        Pago tarjetaCredito = new TarjetaCredito();
        Pago tarjetaDebito = new TarjetaDebito();

        procesoPago(tarjetaDebito);
    }

    // Procesara el tipo de pago y el metodo de pago
    static void procesoPago(Pago pago) {
        System.out.println(pago.tipoPago());
        pago.crearPago();
    }
}
