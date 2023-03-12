import vehiculo.Automovil;
import vehiculo.Platon;
import vehiculo.Deportivo;
import vehiculo.Furgon;
import vehiculo.Vehiculo;

public class Carrera {
    /**
     * Stops the program 100 milliseconds
     */
    public static void pausar() {
	    try {
		Thread.sleep(100);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }	
    }
    
    /**
     * Main program
     * @param args Not used in this program
     */
    public static void main( String[] args ){
	Automovil automovil = new Automovil(5, 1);
	//automovil.pintar(5);
	Deportivo deportivo = new Deportivo(5, 1.5);
	//deportivo.pintar(3);
	Platon camioneta = new Platon(3, 1.2, 4);
	camioneta.llevar(1234);
	//camioneta.pintar(1);
	Furgon furgon = new Furgon(3, 0.9, 4);
	furgon.llevar("AA");
	
	Vehiculo[] vehiculo = new Vehiculo[4];
	vehiculo[0] = automovil;
	vehiculo[1] = camioneta;
	vehiculo[2] = deportivo;
	vehiculo[3] = furgon;
	
	for( int i=0; i<50; i++ ) {
	    System.out.println();
	    for( int j=0; j<vehiculo.length; j++) {
		int pos = vehiculo[j].posicion(i);
		vehiculo[j].pintar(pos);
	    }
	    pausar();
	    System.out.print("=====================================================================================");
	}
    }
}