package $10_Herencia_Polimorfismo.ElectroExam.Electrodomestico;
public class Electrodomestico {
    
    private String color;
    private double precio;
    private String marca;
    private double peso;
    
    public Electrodomestico(){
        color = "Blanco";
        precio = 0.0;
        marca = "LG";
        peso = 0.0;
    }
    
    //comportamientos
    public void encender(){
        System.out.println("Su electrodomestico ha sido encendido");
    }
    
    public void apagar(){
        System.out.println("Su electrodomestico se ha apagado");
    }
    
    //Se puede sobre cargar construir los constructores que se desean
    //pero los parametros recibidos deben ser diferentes
    
    public Electrodomestico(double precio, String marca, double peso){
        this.precio = precio;
        this.marca = marca;
        this.peso = peso;
        color = "Blanco";   //Es recomendable poner valor para que no halla nulos
    }                       //poner todos los atributos
    
    public Electrodomestico(String marca){
        this.marca = marca;
        //recomendable iniciar los demas atributos
        color = "Blanco";
        precio = 0.0;
        peso = 0.0;
    }
    
    //GETTERS Y SETTER PARA PODER ACCEDER ATRIBUTOS
    //GETTER retorna valor del atributo
    //SETTER colorar valor que quieras en el atributo

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    

}
