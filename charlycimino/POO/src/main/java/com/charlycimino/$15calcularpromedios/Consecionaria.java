package com.charlycimino.$15calcularpromedios;

import java.util.ArrayList;

public class Consecionaria {

    private String nombre;
    private ArrayList<Auto> autos; // Una referencia a coleccion de autos, si no la instanciamos crea error null point

    // No se debe recibir en el constructor una colecion de autos, así este vacia
    // La clase que guarda a la coleccion es quien debe instanciarla en su constructor
    // Una clase abstracta no se puede instanciar - ArrayList hereda de Collection
    public Consecionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    // Agregar autos a la concesionaria, pero sin devolver la referencia de la lista
    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    public int sumatoriaKmsRecorridos () {
        int acu = 0;

        for (Auto auto: autos) {
            acu += auto.getKmsRecorridos();
        }
        return acu;
    }

    public int cantAutos() {
        return autos.size();
    }

    public double promedioKmsRecorridos() {
        /*
        double promedio = 0;

        if (cantAutos() > 0) {
            promedio = (double) sumatoriaKmsRecorridos() / cantAutos();
        }
        return promedio;
         */
        return (cantAutos() > 0 ? (double) sumatoriaKmsRecorridos() / cantAutos() : 0);
    }
}
