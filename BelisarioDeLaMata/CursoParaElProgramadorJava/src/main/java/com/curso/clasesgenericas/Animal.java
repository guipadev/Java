package com.curso.clasesgenericas;

/*
s 
*/
public abstract class Animal<E> { //Podemos colocar tanto tipo de datos como necesitemos, pero al momento de hacer la instancia especificar el tipo
    
    private E id;
    private String grupo;
    private String nombre;

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
