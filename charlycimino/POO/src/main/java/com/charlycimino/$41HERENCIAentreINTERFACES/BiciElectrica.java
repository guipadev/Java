package com.charlycimino.$41HERENCIAentreINTERFACES;

public class BiciElectrica implements VehiculoRecargable {

    @Override
    public void recargar() {
        System.out.println("Recargando la batería de la bici");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor de la bici");
    }

}
