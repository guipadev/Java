package com.company;

public class Ejercicio_Herencia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Pepe");
        cliente.setEdad(30);
        cliente.setTelefono(32145);
        cliente.setCredito(1000000);

        System.out.println("El cliente: " + cliente.getNombre() + " con edad de: " + cliente.getEdad() + " años "
                + " telefono " + cliente.getTelefono() + " adquirio un crédito por valor de: " + cliente.getCredito() + "");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Lola");
        trabajador.setEdad(23);
        trabajador.setTelefono(862145);
        trabajador.setSalario(500000);

        System.out.println("El trabajador: " + trabajador.getNombre() + " con edad de: " + trabajador.getEdad() + " años "
                + " telefono " + trabajador.getTelefono() + " tiene un salario por valor de: " + trabajador.getSalario());
    }
}

class Personaa {
    String nombre;
    int edad;
    int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Personaa {
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Personaa {
    int salario;


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}