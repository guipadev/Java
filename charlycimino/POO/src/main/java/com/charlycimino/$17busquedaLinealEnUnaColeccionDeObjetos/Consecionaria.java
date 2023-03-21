package com.charlycimino.$17busquedaLinealEnUnaColeccionDeObjetos;

import java.util.ArrayList;
import java.util.Iterator;

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

    /*
    public Auto buscarAuto (String patente) {
        Auto autoEncontrado = null;

        for (Auto auto : autos) {
            if (auto.getPatente().equalsIgnoreCase(patente)) {
                autoEncontrado = auto;
            }
        }
        return autoEncontrado;
    }
     */

    // Mejora algoritmo de busqueda con while
    /*
    public Auto buscarAuto (String patente) {
        Auto autoEncontrado = null;
        int i = 0;

        while (i < cantAutos() && autoEncontrado == null) {
            Auto auto = this.autos.get(i);

            System.out.println("Viendo al auto: " + auto.getPatente());

            if (auto.getPatente().equalsIgnoreCase(patente)) {
                autoEncontrado = auto;
            }
            i++;
        }
        return autoEncontrado;
    }
     */

    // Hacer un algoritmo más eficiente
    /*
    public Auto buscarAuto (String patente) {
        Auto autoEncontrado = null;
        int i = 0;

        while (i < cantAutos() && !this.autos.get(i).getPatente().equalsIgnoreCase(patente)) {
            i++;
        }

        if (i < cantAutos()) {
            autoEncontrado = this.autos.get(i);
        }
        return autoEncontrado;
    }
     */


    // Hacer un algoritmo compatible con cualquier coleccion
    // Si cambiamos ArrayList por HashSet va a seguir funcionando
    // esto al usar el iterador
    public Auto buscarAuto (String patente) {
        Auto autoEncontrado = null;

        Iterator<Auto> it = this.autos.iterator();

        while (it.hasNext() && autoEncontrado == null) {
            Auto a = it.next();
            if (a.getPatente().equalsIgnoreCase(patente)) {
                autoEncontrado = a;
            }
        }
        return autoEncontrado;
    }
}
