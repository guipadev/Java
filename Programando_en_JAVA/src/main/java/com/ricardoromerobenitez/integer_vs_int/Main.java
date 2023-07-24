package com.ricardoromerobenitez.integer_vs_int;

/**
 * Existen los objetos y datos primitivos, aunque la mayoria son números
 *
 * Ejemplo:
 * byte es un dato primitivo, son estáticos que usamos con valores por defecto y no admiten nulos
 * Osea ningun dato primitivo pueder tener un valor null
 *
 * Con los tipo objeto como Byte podemos inicializarlo como nulos, pero tambien se puede transformar
 * a un String o float o cualquier tipo de dato que contenga los metodos de esta clase
 *
 */
public class Main {

    public static void main(String[] args) {


        byte unByte;
        Byte unByteClase;


        final int resultado = sumar(0, null);

        short unShort;
        Short unShortClase;

        int unInt;
        Integer unIntClase;

        long unLong;
        Long unLongClase;

        float unFloat;
        Float unFloatClase;

        double unDouble;
        Double unDoubleClase;

        boolean unBoolean;
        Boolean unBooleanClase;

        char unChar;
        Character unCharClase;
    }

    //Uso primitivo
    public static int sumar(int x, Integer a) {

        if (a == null) {
            return x;
        }
        return x + a;
    }
}
