package com.ricardoromerobenitez.clase_abstract;

public class Main {

    /*
    * La abstracciòn es el proceso de ocultar ciertos detalles y mostrar solamente la informaciòn esencial
    * al usuario
    *
    * La abstracción se puede utilizar con clases abstractas o interfaces
    *
    * La palabra clave abstract es un comunicador de acceso, la cual se puede utilizar tanto en clases
    * como métodos
    *
    * Las clases abstractas son restringidas que no se puedan usar objetos
    *
    * Solamente para acceder a esos métodos se tiene que dar desde otra clase
    *
    * Y los metodos abstractos solo se puede usar en clases abstractas y no tiene cuerpo
    * el cuerpo lo utilizan las clases heredadas
    * */

    public static void main(String[] args) {

        EjemploExtAbstracta ejemploExtAbstracta = new EjemploExtAbstracta();
        ejemploExtAbstracta.exampleMethod();


        ejemploExtAbstracta.ejemploMetodoAbstracto();

    }
}
