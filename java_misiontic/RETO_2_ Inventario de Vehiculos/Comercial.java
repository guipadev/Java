public class Comercial extends Vehiculo {
    
    private int cargaMax;

    public Comercial() {
        super();
        cargaMax=0;
    }

    public Comercial(int cargaMax, int velocidad, int pasajeros, String placa) {
        super(velocidad, pasajeros, placa);
        this.cargaMax = cargaMax;
    }

    public Comercial(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    
    

    
    @Override
    public String toString() {
        return "\tVehículo Comercial - " + super.toString() + "\tCarga máxima: " + cargaMax + "kg\n";
        
    }
}
