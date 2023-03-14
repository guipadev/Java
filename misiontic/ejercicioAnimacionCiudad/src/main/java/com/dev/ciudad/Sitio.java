package com.dev.ciudad;

public class Sitio extends Cosa{
    /**
     * Creates a plece at the given position
     * @param posicion Position of the place
     */
    public Sitio(Posicion posicion) {
	super(posicion);
	imagen = new String[] {
            "           _ _ ",
	    "     ______| |_",	
	    "    / ~~~~~~~~ \\",	
	    "   / ~~~~~~~~~~ \\",	
	    "   | []  __  [] |",	
	    "   |    | .|    |",	
	    "   |____|__|____|"	
	};
    }
}