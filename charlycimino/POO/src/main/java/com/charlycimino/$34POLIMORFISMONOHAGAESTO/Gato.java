package com.charlycimino.$34POLIMORFISMONOHAGAESTO;

public class Gato extends Mascota {

    /*
        En lugar de 'maullar()', nos conviene
        que el método se sobrescriba de la
        superclase, para lograr polimorfismo
     */
    @Override
    public void expresarse() {
        System.out.println("MIAU MIAU");
    }
}
