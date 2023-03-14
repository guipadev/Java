package encapsulamiento;


public class Personaje {
    
    //Atributos
    //Utilizamos encapsulamiento al un modificador de acceso
    //private: Unicamente la clase principal tiene acceso a los atributos
    //public: Todas las clases tiene acceso a los atributos sin importar donde esten
    //proteted: Solo las clases dentro del paquete pueden tener acceso a los atributos
    private String nombre;  
    private int edad;
    private String textura;
    
    //Metodos
    public void saludar() {
        System.out.println("Saludar");
    }
    
    //Los Getters sirven para obtener
    //Lo pones public para ocuparlo en otra clase
    public String getNombre() {
        return nombre;
    }
    
    //Los Setters sirven para introducir
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
    
    
}
