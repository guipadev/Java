/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.retflix183.redflix_app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author UNIFORCE
 */
@Entity
@Table(name = "pelicula")
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
