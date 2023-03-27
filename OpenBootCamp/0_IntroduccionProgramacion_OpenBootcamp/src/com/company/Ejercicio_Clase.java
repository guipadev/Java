package com.company;

public class Ejercicio_Clase {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Pepe");
        persona.setEdad(18);
        persona.setTelefono(300123);

        System.out.println("El Sr. " + persona.getNombre() + " tiene una edad de " + persona.getEdad() + " y su telefono es: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
