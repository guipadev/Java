public class Particular extends Vehiculo{
    
    private String Color;

    public Particular() {
        super();
        Color = "";
    }

    public Particular(String Color, int velocidad, int pasajeros, String placa) {
        super(velocidad, pasajeros, placa);
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    
      
    @Override
    public String toString() {
        return "\tVehículo Particular - " + super.toString() + "\tColor: " + Color;
    }

}
