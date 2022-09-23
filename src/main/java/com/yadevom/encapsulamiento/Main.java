package com.yadevom.encapsulamiento;


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
