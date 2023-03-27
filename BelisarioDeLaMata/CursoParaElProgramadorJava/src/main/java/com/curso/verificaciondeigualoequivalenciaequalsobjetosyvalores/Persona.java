package com.curso.verificaciondeigualoequivalenciaequalsobjetosyvalores;

/**
 *
 * @author yamid
 */
public class Persona {
    
    private String documento;
    private String nombre;
    private String apellido;

    public Persona(String documento) {
        this.documento = documento;
    }

    public Persona(String documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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
    
    /**
     * Sobre escribir comportamiento, que equivalente cuando sus identificaciones son iguales
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        Persona personaComparable = (Persona) obj;
        return this.getDocumento().equals(personaComparable.getDocumento());
    }
    
    
}
