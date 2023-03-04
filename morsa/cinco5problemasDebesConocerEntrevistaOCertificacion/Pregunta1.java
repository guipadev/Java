package com.morsa.cinco5problemasDebesConocerEntrevistaOCertificacion;

public class Pregunta1 {

    public static void main(String[] args) {

        // ¿Qué lineas compilan correctamente?

        int puerco = 1/0; // compila, pero arroja error
        int sandia = 20_000;    // ander score para ver mejor al separar
        int sandia_calada = 2_0_0_0_0;  // siver pero seria 20_000
        double otroNum = 2_0.0_1;   // funciona
        // int otroNum2 = 2_0._0_1;    // No podemos utilizar ander score despues o antes de punto
        int algo, valor = 3, paraguas; // Declaracion multiple mismo tipo
        // int problema, double solucion = 2.0;    // No compilar diferentes tipo en una sola linea
        int $nombre;    // funciona
        // int %casa!;     // no se acepta simbolos como este
        int _perro_;    // funciona
        int $_a;        // funciona
        // int 1_cosa;     // no se aceptan numeros al principio
        int cosa_1_____$;   // funciona
        var daleLike = "youtube";   // Desde version 11 de java, definir variable sin definir el tipo
                                    // el compilar identifica y asigna el tipo
        // var otraVar = null;     // null no es ningun tipo primitivo
        var otroEje = "palabras";
        otroEje = null;     // Si funciona ya que anteriormente se habia declarado como tipo String
        String sinPalabras = null;  // funcio
        // String final = "Otro final";    // Palabra "final" es reservada, si fuera Final serviria
        var var = 10; // Es una excepcion a palabras reservadas que si funciona
        // int private = 35; // private es reservada palabra
    }
}
