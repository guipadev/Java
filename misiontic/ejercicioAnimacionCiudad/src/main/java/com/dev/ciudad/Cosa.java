package com.dev.ciudad;
public class Cosa {
    /**
     * Position of the thing on the city
     */
    protected Posicion posicion;
    /**
     * Image of the thing
     */
    protected String[] imagen;
    
    /**
     * Creates a thing at the given position
     * @param posicion Position that will occupy the thing
     */
    public Cosa( Posicion posicion ) {
	this.posicion = posicion;
    }
    
    /**
     * Gets the position of the thing
     * @return Position of the thing
     */
    public Posicion posicion() { return posicion; }
    
    /**
     * Paints the thing in the city map
     * @param mapa City map
     */
    public void pintar( char[][] mapa ) {
	for( int i=0; i<imagen.length; i++) {
	    for( int j=0; j<imagen[i].length(); j++) {
		int f = (this.posicion.fila+i+mapa.length) % mapa.length;
		int c = (this.posicion.columna+j+mapa[i].length) % mapa[i].length; 
		mapa[f][c] = imagen[i].charAt(j);
	    }
	}
    }
}
