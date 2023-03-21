package com.charlycimino.$16calcularMaxyMinColeccionObjetos;

import java.util.ArrayList;

public class Consecionaria {

    private String nombre;
    private ArrayList<Auto> autos; // Una referencia a coleccion de autos, si no la instanciamos crea error null point


    public Consecionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    public int cantAutos() {
        return autos.size();
    }

    public Auto autoMasKmsRecorridos() {
        Auto autoMax = null;
        int kmsMax = -1;

        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
                autoMax = auto;
            }
        }
        return autoMax;
    }

    /*
    private int masKmsRecorridos() {
        int kmsMax = -1;

        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
            }
        }
        return kmsMax;
    }

    public ArrayList<Auto> autosMasKmsRecorridos() {
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();

        int kmsMax = masKmsRecorridos();

        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() == kmsMax) {
                listaDeMaximos.add(auto);
            }
        }
        return listaDeMaximos;
    }
     */

    // Un algoritmo más eficiente
    public ArrayList<Auto> autosMasKmsRecorridos() {
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();

        int kmsMax = -1;

        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() == kmsMax) {
                listaDeMaximos.add(auto);
            } else if (auto.getKmsRecorridos() > kmsMax) {
                kmsMax = auto.getKmsRecorridos();
                listaDeMaximos.clear();
                listaDeMaximos.add(auto);
            }
        }
        return listaDeMaximos;
    }

    public Auto autoMenosKmsRecorridos() {
        Auto autoMin = null;
        int kmsMin = Integer.MAX_VALUE;

        for (Auto auto : autos) {
            if (auto.getKmsRecorridos() < kmsMin) {
                kmsMin = auto.getKmsRecorridos();
                autoMin = auto;
            }
        }
        return autoMin;
    }

}
