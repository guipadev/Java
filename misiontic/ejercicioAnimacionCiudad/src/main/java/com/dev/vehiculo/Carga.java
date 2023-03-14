package com.dev.vehiculo;

import com.dev.ciudad.Posicion;


public class Carga extends Vehiculo{
    /**
     * Load capability
     */
    protected int capacidad;
    /**
     * Carrying object
     */
    protected Object carga;

    /**
     * Row in image for painting the load
     */
    protected int filaCarga;

    /**
     * Creates a carrying vehicle with the given the position, number of passengers, 
     * and load capability
     * @param posicion Position of the vehicle
     * @param pasajeros Number of passengers
     * @param peso Load capability
     */
   public Carga(Posicion posicion, int pasajeros, int peso) {
	super(posicion, pasajeros);
	this.capacidad = peso>5?5:peso;
	this.carga = "___";
   }

   /**
    * Computes the image associated to the carried object
    */
   protected void imagenCarga() {
       String laCarga = imagen[filaCarga].charAt(0) +
	       		this.carga.toString();
       int n = 6-laCarga.length();
       for( int i=0; i<n; i++ ) {
	   laCarga += '_';
       }
       laCarga+="|__\\___";
       imagen[filaCarga] = laCarga;   
   } 
   
    /**
     * Carries the given number, if possible
     * @param p Number to carry
     * @return <i>true</i> If the number can be carried, <i>false</i> otherwise
     */
    public boolean llevar( int p) {
	int k = 1;
	for( int i=0; i <= this.capacidad; i++) {
	    k *=10;
	}
	if( p < k ) {
	    this.carga = p;
	    imagenCarga();
	    return true;
	}else {
	    return false;
	}
    }

    /**
     * Carries the given string, if possible
     * @param p Number to carry
     * @return <i>true</i> If the string can be carried, <i>false</i> otherwise
     */    
    public boolean llevar( String p ) {
        this.carga = p.length() > this.capacidad ? 
                p.substring(0, this.capacidad + 1) : p;
        imagenCarga();
        return true;
    }
}