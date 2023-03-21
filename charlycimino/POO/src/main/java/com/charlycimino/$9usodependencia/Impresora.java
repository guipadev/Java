package com.charlycimino.$9usodependencia;

public class Impresora {

    private boolean estaEncendida;

    public void encender() {
        estaEncendida = true;
    }

    /**
     * Cuando una clase(Impresora) conoce la existencia de la otra(Documento) pero no
     * necesariamente teniendola como atributo, entonces estamos hablando de una relaciòn
     * de "uso" o "dependencia" entre la clase en este caso impresora y documento
     * Una relacion debil, pero relacion al fin y al cabo
     *
     * Si movieramos de paquete la clase Documento, le cambiaramos el nombre o eliminaramos
     * va a tener efectos en la clase Impresora porque estamos conociendo su existencia
     *
     */
    public void imprimir(Documento doc) {
        if (estaEncendida) {
            System.out.println("Imprimiendo doc " + doc.getTitulo());
            System.out.println("**********************************");
            System.out.println(doc.getCuerpo());
            System.out.println("**********************************");
        } else {
            System.out.println("Impresora apagada!");
        }
    }
}
