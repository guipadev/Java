package com.morsa.DepedencyInversionPrinciple;

/**
 * Creamos el concepto abstracto de lo que hace un veterinario
 * el cual es que diagnostica
 */

public interface Diagnosticador {

    boolean diagnosticar(Gato gato);
}