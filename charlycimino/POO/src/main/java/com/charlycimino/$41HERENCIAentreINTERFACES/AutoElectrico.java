package com.charlycimino.$41HERENCIAentreINTERFACES;

public class AutoElectrico implements VehiculoRecargable {

    @Override
    public void recargar() {
        System.out.println("Recargando baterías de auto");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor del auto");
    }

}