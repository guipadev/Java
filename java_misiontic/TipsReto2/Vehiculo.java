
public class Vehiculo {

    private String placa;
    private double peso;

    public Vehiculo(String placa, double peso) {
        this.placa = placa;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Vehiculo con placa "+placa + " Tiene un peso " +peso;
    }
    
    
}
