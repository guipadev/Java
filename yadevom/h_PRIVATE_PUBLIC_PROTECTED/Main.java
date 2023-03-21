package com.yadevom.h_PRIVATE_PUBLIC_PROTECTED;

/**
 * La encapsulación es uno de los cuatro conceptos fundamentales de OOP. Los otros tres son herencia, polimorfismo y abstracción.
 *
 * La encapsulación en Java es un mecanismo para envolver los datos (variables) y el código que actúa sobre los datos (métodos) juntos como una sola unidad. En la encapsulación, las variables de una clase se ocultarán de otras clases y solo se puede acceder a ellas a través de los métodos de su clase actual. Por lo tanto, también se conoce como ocultación de datos.
 */

// Todos los datos sencibles esten oculto a los usuarios
/* MODIFICADORES DE ACCESO, aplica para atributos, metodos y clases internas
* Sin modificador default: Accesible dentro del paquete
* private: Solo accesible sobre la clase declarada.
* public: Cualquiera puede acceder y utilizar el tipo de var.
* protected: Solo puede ser accesible dentro del paquete, màs las clases delegadas.
*/
public class Main {

    String variable1; // default
    public String variable2;
    private String variable3;
    protected String variable4;

    // Aplica para metodos

    void metodo1() {}

    public void metodo2() {}

    private void metodo3() {}

    protected void metodo4() {}

    // Aplica para clases private, public, protected o default
    private class hola {}



    public static void main(String[] args) {

    }
}
