package com.dev.reto1;

/**
 * Clase que representa el consorcio
 */
//TODO - Escribir la declaracion de la clase - Declare la clase Consorcio
public class Consorcio
{
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Atributo que representa la empresa A
     */
    private Empresa empresaA;

    /**
     * Atributo que representa la empresa B
     */
    private Empresa empresaB;

    /**
     * Atributo que representa la empresa C
     */
    private Empresa empresaC;


    /**
     * Constructor de la clase Consorcio
     * Cree el método constructor de la clase consorcio. En este método inicialice los atributos declarados anteriormente.
     */
    //-----------------------------------------------------------------
    // Método constructor
    //-----------------------------------------------------------------
    public Consorcio() {
        this.empresaA = empresaA;
        empresaA.inicializar();

        this.empresaB = empresaB;
        empresaB.inicializar();

        this.empresaC = empresaC;
        empresaC.inicializar();
    }

    /**
     * Construya el método darTotalFacturaConsorcio().
     * Este método indica los gastos por consumo telefónico, de todos los tipos de llamada, que tiene el consorcio
     * a través de las tres empresas.
     */

    /**
     * Calcula el total de dinero que debe pagar el consorcio por consumo en lineas telefonicas
     * @return cantidad a pagar por consumo telefonico
     */

    public double darTotalFacturaConsorcio() {
        double total = 0.0;

        total += empresaA.darTotalCostoLlamadas() + empresaB.darTotalCostoLlamadas() + empresaC.darTotalCostoLlamadas();

        return total;

    }


    /**
     * Desarrolle el método darTotalImpuestos() que calcula los impuestos del consorcio de acuerdo a las tarifas indicadas
     * Calcula el costo de impuestos que debe pagar el consorcio por concepto de inpuestos telefonicos
     *
     * Empresa A: $1 por cada llamada más el 4% del total de costo de llamadas
     * Empresa B: $0.01 por cada minuto más 3$ por cada llamada
     * Empresa C: 5% sobre el total de costos por llamadas
     * @return impuestos
     */
    public double darTotalImpuestos() {

        double impuestos = 0.0;

        double costoTotalA = empresaA.darTotalCostoLlamadas();
        double impuestosA = 0.04 * costoTotalA + empresaA.darTotalNumeroLlamadas() * 1.0;
        impuestos += impuestosA;


        // Calculo de impuestos para la empresa B incorrecto
        double costoTotalB = empresaB.darTotalCostoLlamadas();
        double impuestosB = 0.03 * costoTotalB + empresaB.darTotalNumeroLlamadas() * 0.01;
        impuestos += impuestosB;

        double costoTotalC = empresaC.darTotalCostoLlamadas();
        double impuestosC = costoTotalC * 0.05;
        impuestos += impuestosC;

        return impuestos;

    }
}

