package com.dev.vehiculo;

import com.dev.ciudad.Cosa;
import com.dev.ciudad.Posicion;


public class Vehiculo extends Cosa{
    /**
     * Number of passengers 
     */
    protected int pasajeros;
    
    /**
     * Creates a vehicle with the given given position and number of passengers
     * @param posicion Position of the vehicle
     * @param pasajeros Number of passengers
     */
    public Vehiculo(Posicion posicion, int pasajeros) {
	super( posicion ); 
	this.pasajeros = pasajeros;
    }
    
    /**
     * Moves the vehicle the given amount of rows and columns
     * @param cambio_fila Rows change 
     * @param cambio_columna Columns change
     */
    public void mover( int cambio_fila, int cambio_columna ) {
	this.posicion.cambiar(cambio_fila, cambio_columna);
    }    
}