package herencia;

public class Bicicleta extends  Vehiculo {

    private String marca;

    public Bicicleta(String marca, String color) {
        super(2, color, 1);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
