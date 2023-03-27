package com.curso.tiposdedatos;

/**
 *
 * @author yamid
 */
public class Principal {

    static byte valorByte;
    static short valorShort;
    static int valorInt;
    static long valorLong;
    static float valorFloat;
    static double valorDouble;
    static char valorChar;
    static boolean valorBoolean;
    
    
    public static void main(String[] args) {
        System.out.println(valorByte);
        System.out.println(valorShort);
        System.out.println(valorLong);
        System.out.println(valorFloat);
        System.out.println(valorDouble);
        System.out.println(valorChar);
        System.out.println(valorBoolean);
        
        // Son objetos diferentes, son tipos por ferencia
        Persona persona = new Persona();
        System.out.println(persona);
        
        persona = new Persona();
        System.out.println(persona);
    }

    private static class Persona {

        public Persona() {
        }
    }
    
}
