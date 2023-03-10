package com.dev.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="director")
public class Director {
    
    @Id
    private Long dir_id;
    private String dir_nombre;
    private String dir_apellido;
    private String dir_nacionalidad;
    
    public Long getDir_id() {
        return dir_id;
    }

    public void setDir_id(Long dir_id) {
        this.dir_id = dir_id;
    }

    public String getDir_nombre() {
        return dir_nombre;
    }

    public void setDir_nombre(String dir_nombre) {
        this.dir_nombre = dir_nombre;
    }

    public String getDir_apellido() {
        return dir_apellido;
    }

    public void setDir_apellido(String dir_apellido) {
        this.dir_apellido = dir_apellido;
    }

    public String getDir_nacionalidad() {
        return dir_nacionalidad;
    }

    public void setDir_nacionalidad(String dir_nacionalidad) {
        this.dir_nacionalidad = dir_nacionalidad;
    }

}
