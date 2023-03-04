//Comercial sigue siendo un vehiculo

public class Comercial extends Vehiculo{
    
    private  double valorCompra;

    public Comercial(String placa, double peso, double valorCompra) {
        super(placa, peso);
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return super.toString() + " con valor de compra " + valorCompra; 
    }
    
    

}
