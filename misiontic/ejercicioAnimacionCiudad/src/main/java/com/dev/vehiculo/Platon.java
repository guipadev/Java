package com.dev.vehiculo;

import com.dev.ciudad.Posicion;


public class Platon extends Carga{

    /**
     * Creates a pickup with the given given position, number of passengers, and load capability
     * @param posicion Position of the vehicle
     * @param pasajeros Number of passengers
     * @param peso Load capability
     */
    public Platon(Posicion posicion, int pasajeros, int peso) {
	super(posicion, pasajeros, peso);
	filaCarga = 1;
	imagen = new String[] {
		"       __",
		" _____|__\\___",
		"|_   ___   __|",
		"   O     O"
	};	
    }

    /**
     * Carries the given number, if possible
     * @param p Number to carry
     * @return <i>true</i> If the number can be carried, <i>false</i> otherwise
     */
    @Override
    public boolean llevar( int p) {
	boolean lolleva = super.llevar(p);
	if( lolleva ) {
	    String laCarga = this.carga.toString();
	    String cargaInvertida = "";
	    for(int i=laCarga.length()-1; i>=0; i--) {
		cargaInvertida += laCarga.charAt(i);  
	    }
	    this.carga = cargaInvertida;
	    imagenCarga();
	}
	return lolleva;
    }
}