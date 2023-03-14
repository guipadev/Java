package com.dev.vehiculo;

import com.dev.ciudad.Posicion;


public class Furgon extends Carga{
    /**
     * Creates a van vehicle with the given position, number of passengers, and load capability
     * @param posicion Position of the vehicle
     * @param pasajeros Number of passengers
     * @param peso Load capability
     */
    public Furgon(Posicion posicion, int pasajeros, int peso) {
	super(posicion, pasajeros, peso);
	filaCarga = 2;
	imagen = new String[] {
		" _____",
		"|     |__",
		"|_____|__\\___",
		"|_   ___   __|",
		"   O     O"
	};	
    }
}