package com.morsa.cinco5problemasDebesConocerEntrevistaOCertificacion;

class UnaClase {

    // Al inicializar atributos estaticos o no sin darle un valor, java les asignara null por defecto
    float propiedad;
    static String descripcion;
}

public class Pregunta2 {

    public static void main(String[] args) {

        // ¿Funciona este programa? ¿Què va a pasar si lo ejecuto?

        UnaClase unObjeto = new UnaClase();
        System.out.println("-----------------");
        System.out.println(unObjeto.propiedad);
        System.out.println(UnaClase.descripcion);

        int miValor;
        // System.out.println(miValor);
    }
}
