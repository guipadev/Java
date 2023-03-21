package com.charlycimino.$9usodependencia;

public class Main {

    public static void main(String[] args) {

        Documento doc1 = new Documento("Prueba", "Este es un\ntexto de prueba");
        Impresora imp = new Impresora();

        imp.encender();
        imp.imprimir(doc1);
    }
}
