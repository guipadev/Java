package com.dev.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pelicula")
@SequenceGenerator(name="seq", initialValue=1005, allocationSize=1)

public class Pelicula {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    @Column(name="pel_id")
    private Long pelId;
    
    @Column(name="pel_titulo")
    private String pelTitulo;
    
    @Column(name="pel_resumen")
    private String pelResumen;
    
    @Column(name="pel_ano")
    private String pelAno;
    
    @Column(name="dir_id")
    Long dirId;
    
    //@ManyToOne
    //@JoinColumn(name="dir_id")
    //private Director director;
    
    public Long getPelId() {
        return pelId;
    }

    public void setPelId(Long pelId) {
        this.pelId = pelId;
    }

    public String getPelTitulo() {
        return pelTitulo;
    }

    public void setPelTitulo(String pelTitulo) {
        this.pelTitulo = pelTitulo;
    }

    public String getPelResumen() {
        return pelResumen;
    }

    public void setPelResumen(String pelResumen) {
        this.pelResumen = pelResumen;
    }    
    
    public String getPelAno() {
        return pelAno;
    }

    public void setPelAno(String pelAno) {
        this.pelAno = pelAno;
    }

    public Long getDirId() {
        return dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "pelId=" + pelId + ", pelTitulo=" + pelTitulo + ", pelResumen=" + pelResumen + ", pelAno=" + pelAno + ", dirId=" + dirId + '}';
    }
    
}