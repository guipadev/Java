package com.dev.vehiculo;

import com.dev.ciudad.Posicion;

public class Automovil extends Vehiculo{

    /**
     * Creates a car with the given position and number of passengers
     * @param posicion Position of the vehicle
     * @param pasajeros Number of passengers
     */
    public Automovil(Posicion posicion, int pasajeros) {
	super(posicion, pasajeros);
	imagen = new String[] {
		    "    _____",	
		    " __/__|__\\___",	
		    "|_  _____  __|",	
		    "   O      O"	
		};	
    }  
}