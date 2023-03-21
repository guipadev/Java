package com.yadevom.f_clases_ABSTRACTAS;

public class EjemploExtAbstracta extends Abstracta {

    // Sobreescribir el metodo
    @Override
    public void exampleMethod() {
        System.out.println("Sobre escribiendo el metodo de la clase abstracta");
    }

    // Utilizar metodos abstractos, la clase tambien debe ser abstracta
    @Override
    public void ejemploMetodoAbstracto() {
        System.out.println("Esto es un metodo abstracto");
    }

}
