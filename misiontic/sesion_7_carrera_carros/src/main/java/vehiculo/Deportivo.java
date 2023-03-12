package vehiculo;

public class Deportivo extends Vehiculo{

    /**
     * Creates a SUV vehicle with the given number of passengers and speed
     * @param pasajeros Number of passengers
     * @param velocidad Speed of the Vehicle
     */
   public Deportivo(int pasajeros, double velocidad) {
	super(pasajeros, velocidad);
    }

    /**
     * Paints the vehicle at the given position
     * @param posicion Position used to print the vehicle
     */
    @Override
    public void pintar( int posicion ) {
	espacios(posicion+1);
	System.out.println("________");
	espacios(posicion);
	System.out.println("/_|__|___\\___");
	espacios(posicion);
	System.out.println("|_  _____  __|");
	espacios(posicion);
	System.out.println("   0      0");
    } 
}