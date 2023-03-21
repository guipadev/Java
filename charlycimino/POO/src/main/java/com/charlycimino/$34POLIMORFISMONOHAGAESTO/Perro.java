package com.charlycimino.$34POLIMORFISMONOHAGAESTO;

public class Perro extends Mascota {

    /*
        En lugar de 'ladrar()', nos conviene
        que el método se sobrescriba de la
        superclase, para lograr polimorfismo
     */
    @Override
    public void expresarse() {
        System.out.println("GUAU GUAU");
    }
}
