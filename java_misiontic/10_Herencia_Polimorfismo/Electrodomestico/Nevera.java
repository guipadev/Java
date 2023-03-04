package HerenciayPolimorfismo.Electrodomestico;

//Se heredan todos los atributos de la clase principal Electrodomestico
public class Nevera extends Electrodomestico {
    //Atributos diferentes que posee
    private double litros;
    private double minTemperatura;
    private double maxTemperatura;
    private double altura;
    private boolean dispensadorHielo;
    
    public Nevera(){
        //se utiliza super() para heredar los atributos del padre
        //vamos a heredar el constructor que esta vacio, que trae todos los valores por defecto
        super();
        litros = 0.0;
        minTemperatura = -20.0;
        maxTemperatura = 5.0;
        altura = 1.50;
        dispensadorHielo = false;
    }
    
    //creamos otro constructor
    public Nevera(String marca, double litros){
        //Heredamos constructor padra de atributo por defecto marca
        super(marca);
        this.litros = litros;
        minTemperatura = -20.0;
        maxTemperatura = 5.0;
        altura = 1.50;
        dispensadorHielo = false;
    }

    //poliformismo heredamos comportamiento, pero se cambia, debe ser el mismo nombre y parametros
    //utilizamos @Override para sobreescribir/sobrecargar
    @Override
    public void encender(){          //super es la clase padre se llama la marca
        System.out.println("Su nevera marca " + super.getMarca() + " se ha prendio");
    }
    
    public void encender(String nombre){
        System.out.println("Hola " + nombre + ", su electrodomestico encendio");
    }
    
    //Gerenacion de Getters y Setters
    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getMinTemperatura() {
        return minTemperatura;
    }

    public void setMinTemperatura(double minTemperatura) {
        this.minTemperatura = minTemperatura;
    }

    public double getMaxTemperatura() {
        return maxTemperatura;
    }

    public void setMaxTemperatura(double maxTemperatura) {
        this.maxTemperatura = maxTemperatura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isDispensadorHielo() {
        return dispensadorHielo;
    }

    public void setDispensadorHielo(boolean dispensadorHielo) {
        this.dispensadorHielo = dispensadorHielo;
    }
    
    
}
