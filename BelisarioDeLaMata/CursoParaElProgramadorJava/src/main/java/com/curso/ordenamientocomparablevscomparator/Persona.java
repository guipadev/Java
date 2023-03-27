package com.curso.ordenamientocomparablevscomparator;

// Implementamos para tener un ordenamiento por defecto
public class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellido;
    private int code;

    public Persona() {
    }
    
    public Persona(String nombre, String apellido, int code) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", code=" + code + '}';
    }
    
    

    @Override
    public int compareTo(Persona t) {
        //return new Integer(this.getCode()).compareTo(new Integer(t.getCode()));
        //return this.getCode()-t.getCode(); //ordenado por codigo
        //return this.nombre.compareTo(t.nombre); //ordenado por nombre
        //return this.apellido.compareTo(t.apellido); //ordenar por apellido
        //Realizar una organización con multiples elementos
        int orden = this.apellido.compareTo(t.apellido);
        if (orden == 0) {
            orden = this.nombre.compareTo(t.nombre);
            //Adicional damos un ordenamiento por edad
            if (orden == 0) {
                //si queremos de forma inversa lo multiplicamos por -1
                orden = (this.getCode() - t.getCode()) * -1;
            }
        }
        return orden;
    }

    
    
    
}
