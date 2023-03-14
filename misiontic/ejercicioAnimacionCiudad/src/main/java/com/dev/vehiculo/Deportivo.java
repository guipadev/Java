package com.dev.vehiculo;

import com.dev.ciudad.Posicion;

public class Deportivo extends Vehiculo{

    /**
     * Creates a SUV vehicle with the given position and number of passengers
     * @param posicion Position of the vehicle
     * @param pasajeros Number of passengers
     */
   public Deportivo(Posicion posicion, int pasajeros) {
	super(posicion, pasajeros);
	imagen = new String[] {
		" ________",
		"/_|__|___\\___",
		"|_  _____  __|",
		"   0      0"
	};	
   }
}