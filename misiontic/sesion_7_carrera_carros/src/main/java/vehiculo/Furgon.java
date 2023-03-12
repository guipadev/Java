package vehiculo;

public class Furgon extends Carga{
    /**
     * Creates a van vehicle with the given number of passengers, speed and load capability
     * @param pasajeros Number of passengers
     * @param velocidad Speed of the Vehicle
     * @param peso Load capability
     */
    public Furgon(int pasajeros, double velocidad, int peso) {
	super(pasajeros, velocidad, peso);
    }

    /**
     * Paints the vehicle at the given position
     * @param posicion Position used to print the vehicle
     */
    @Override
    public void pintar( int posicion ) {
	espacios(posicion);
	System.out.println(" _____");
	espacios(posicion);
	System.out.println("|     |__");
	String laCarga = "|" + this.carga.toString();
	int n = 6-laCarga.length();
	for( int i=0; i<n; i++ ) {
	    laCarga += '_';
	}
	espacios(posicion);
	System.out.println(laCarga+"|__\\___");
	espacios(posicion);
	System.out.println("|_   ___   __|");
	espacios(posicion);
	System.out.println("   O     O");
    }
}