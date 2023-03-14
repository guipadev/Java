package com.dev.ciudad;

public class Posicion {
    /**
     * Row of the position
     */
    public int fila;
    /**
     * Column of the position
     */
    public int columna;
    
    private int nuevaFila;
    
    private int nuevaColumna;
    
    public Posicion() {
	this.fila = (int) (Math.random() * ParametrosDibujo.ALTO) + 1;
	this.columna = (int) (Math.random() * ParametrosDibujo.ANCHO) + 1;
    }
    
    /**
     * Creates a position using the given row and column
     * @param fila Row of the position
     * @param columna Column of the position
     */
    public Posicion( int fila, int columna ) {
	this.fila = fila;
	this.columna = columna;
    }
    
    /**
     * Changes the position in the amount provided
     * @param cambio_fila Change in row
     * @param cambio_columna Change in column
     */
    public void cambiar( int cambio_fila, int cambio_columna ) { 
        nuevaFila = this.fila  + cambio_fila;
        this.fila = nuevaFila < 0 ? 
                ParametrosDibujo.ALTO + cambio_fila: 
                nuevaFila;
        nuevaColumna = this.columna + cambio_columna;
	this.columna = nuevaColumna < 0 ? 
                ParametrosDibujo.ANCHO + cambio_columna : 
                nuevaColumna;
    }
}