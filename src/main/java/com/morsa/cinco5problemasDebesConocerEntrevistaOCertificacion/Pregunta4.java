package com.morsa.cinco5problemasDebesConocerEntrevistaOCertificacion;

public class Pregunta4 {

    public static void main(String[] args) {
        // ¿Qué lineas compilan correctamente?

        double decimla = 0.0;   // Correcto
        // float decimal2 = 0.0;   // double 64 bit y por ender no cabe en float 32 bit
        long otroValor = 55L;       // Correcto
        // int numero = 10.0;       // No cabe un double en un int
        double entero = 20;         // Se puede pasar int en el double ya que es de menor categoria
        double masLargo = 20L;      // Long cabe dentro de un double
        double decimal3 = 30.0f;    // Float cabde dentro de un double
        float flotante = 40L;       // Long cabe dentro de un float los dos son de 32 bits
        float flotante2 = 40.0f;    // Float cabe dentro de un float, ya que f = float
        float flotante3 = 40;       // int cabe dentro de un float
        short cort = -3;            // si se acepta este valor negativo
        // short cerca = 65_555;    // short 16 bits este es # muy grande de 32bits
        char caracter = 'a';        // Correcto
        // char caracter = "b";     // Caracteres solo un comilla
        byte caracter3 = 127;       // el numero esta dentro del rango
        // byte caracter3_2 = 128;  // byte 8 bits y >= 127 es de 16 bits
        byte caracter4 = 0b10;      // esta representacion correctamente
        // char caracter5 = -1;     // char va entre comillas simple ''
        // boolean verdad = 1;         // solo acepta true o false
        // boolean verdad = !0;        // solo acepta true o false

    }
}
