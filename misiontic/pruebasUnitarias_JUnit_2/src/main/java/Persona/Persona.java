package Persona;

public class Persona {

     //Atributos
    public String nombre;  
    public String apellidos;
    public String nombreCompleto;
    public int edad;
    public double peso, estatura;

    public Persona(String nombre, String apellidos, int edad, double peso, double estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public static double calculaIMC(double peso, double estatura) {
        return peso/(estatura * estatura);
    }
    
    
    public static String nombreCompleto(String nombre, String apellidos) {
        return nombre + apellidos;
    }
    
}
