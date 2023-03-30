package com.dev.reto1;

/*
* Construya el método darTotalMinutosCelular de la clase Empresa que retorne el número total de minutos consumidos
* en llamadas a celular realizadas en las 3 líneas telefónicas.
* Es decir, la suma de los minutos de llamadas a celular realizadas en cada línea telefónica.
* El nuevo método darTotalMinutosCelular debe utilizar (llamar) obligatoriamente
* el método darNumeroMinutosCelular ( ) sobre linea1, linea2 y linea3,
* para obtener de cada una de ellas, el número de minutos consumidos en llamadas a celular.
* */

/**
 * La empresa necesita conocer qué porcentaje representa la cantidad total de minutos de llamadas a celular con respecto
 * al total de minutos consumidos en todos los tipos de llamadas en todas las líneas.
 * Construya el método darPorcentajeCelular de la clase Empresa que calcule y retorne este valor.
 */

public class Empresa extends LineaTelefonica {
    private LineaTelefonica linea1;
    private LineaTelefonica linea2;
    private LineaTelefonica linea3;

    public Empresa(LineaTelefonica linea1, LineaTelefonica linea2, LineaTelefonica linea3) {
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.linea3 = linea3;
    }

    /**
     * Devuelve el número total de llamadas realizadas a celular
     */
    public int darTotalMinutosCelular() {
        int totalMinutosCelular = 0;

        totalMinutosCelular += linea1.darNumeroMinutosCelular();
        totalMinutosCelular += linea2.darNumeroMinutosCelular();
        totalMinutosCelular += linea3.darNumeroMinutosCelular();

        return totalMinutosCelular;
    }

    /**
     * Calcula el porcentaje de minutos a celular que ha consumido la empresa
     * respecto al total de minutos consumidos
     * @return el porcentaje de minutos a celular respecto el total de minutos. double entre 0 y 100
     */

    /**
     * El porcentaje de minutos a celular debe ser cero.
     * En el numerador unicamente deberia ir la suma de minutos a celular de las 3 lineas.
     * Preferiblemente a partir del metodo darTotalMinutosCelular.
     * En el denominador deberia ir la cantidad de minutos de la empresa .
     * Se esperaba 0.0, pero usted respondió 100.0
     *
     */
    public double darPorcentajeCelular() {

        int numeroLlamadas = linea1.dartotalMinutosCelular() + linea2.dartotalMinutosCelular() + linea3.dartotalMinutosCelular();

        return (double) numeroLlamadas / numeroLlamadas * 100;
    }

    public double darTotalCostoLlamadas() {
        return 0;
    }

    public double darTotalNumeroLlamadas() {
        return 0;
    }

}

