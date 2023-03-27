/*
Los objetos maestros o clases maestras en nuestro sistema son aquellos valores
que sirven de referencia para los listados, por ejemplo:
Departamentos, Ciudades, Tipos de Identificación, Marcas, Lineas, etc.
*/
package com.curso.clasesgenericas;

/**
 *
 * @author yamid
 */
public class Maestro<E> { // Como se declare aquí se ira a id
    
    E id;
    private String codigo;
    private String nombre;

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
