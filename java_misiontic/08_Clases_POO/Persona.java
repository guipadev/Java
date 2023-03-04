//package POO;

import javax.swing.*;

/**
 * Crear la clase Persona que tenga como atributos Nombre, Edad, Genero (H hombre, M mujer), peso y altura
 * El constructor debe recibir todos los parámetros para su inicialización.
 * La clase debe tener los siguientes métodos:
 * calcularIMC(): Calculará y retornará el Indice de Masa Corporal del objeto.
 * esMayorDeEdad(): Devolverá true si es mayor de edad, false en caso contrario.
 * toString(): Devolverá toda la información del objeto en un String.
 **/

public class Persona {
    //Atributos
    public String nombre;
    public int edad;
    public String genero;
    public float peso;
    public float altura;

    // Constructor
    public Persona(String nombre, int edad, String genero, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nataly_loza, int edad, String f, double v, double v1) {
    }


    // Metodos
    //calcularIMC(): Calculará y retornará el Indice de Masa Corporal del objeto.
    public float calcularIMC(float peso, float estatura){
        return peso / estatura*2;
    }

   //esMayorDeEdad(): Devolverá true si es mayor de edad, false en caso contrario.
   public boolean esMayorDeEdad(int edad){
       if(edad >= 18){
           return true;
       }else {
           return false;
       }
   }

    //toString(): Devolverá toda la información del objeto en un String.
    public void toString (Persona persona){
        System.out.println("Mi nombre es: " + this.nombre +"\n"+
                        "Mi edad es: " + this.edad +"\n"+
                        "Mi genero es: " + this.genero +"\n"+
                        "Mi peso es: " + this.peso +"\n"+
                        "Mi estatura es: " + this.altura);
    }

    public static void main(String[] args) {
        Persona miPersona1 = new Persona("Nataly Loza", 25, "F", 65, 170);
        Persona miPersona2 = new Persona("Ana Fonseca", 2, "F", 45, 100);
        Persona miPersona3 = new Persona("Rubencho Ortiz", 32, "M", 85, 178);


        //esMayorDeEdad(): Devolverá true si es mayor de edad, false en caso contrario.
        System.out.println("La persona: "+ miPersona2.nombre +" es mayor de edad: "+miPersona2.esMayorDeEdad(miPersona2.edad));

        //calcularIMC(): Calculará y retornará el Indice de Masa Corporal del objeto.
        System.out.println("La persona: "+ miPersona3.nombre +" el IMC es: " + miPersona3.calcularIMC(miPersona3.peso, miPersona3.altura));

        //toString(): Devolverá toda la información del objeto en un String.
        miPersona1.toString(miPersona1);
    }


}
