package co.luigicode.patronesestructurales.proxy;

import java.io.Serializable;
import java.util.Date;

/**
 * Representa los datos de la partida
 * Esto se guarda en archivo binario por eso implementar serializable
 */
public class Estados implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private int nivel;
    private int muertes;
    private int fallecido;
    private Date creacionPartida;
    private Date ultimoGuardado;

    public Estados(String nombre, int nivel, int muertes, int fallecido) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.muertes = muertes;
        this.fallecido = fallecido;
    }

    public String getNombre() {
        return nombre;
    }

    public Estados setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getNivel() {
        return nivel;
    }

    public Estados setNivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    public int getMuertes() {
        return muertes;
    }

    public Estados setMuertes(int muertes) {
        this.muertes = muertes;
        return this;
    }

    public int getFallecido() {
        return fallecido;
    }

    public Estados setFallecido(int fallecido) {
        this.fallecido = fallecido;
        return this;
    }

    public Date getCreacionPartida() {
        return creacionPartida;
    }

    public Estados setCreacionPartida(Date creacionPartida) {
        this.creacionPartida = creacionPartida;
        return this;
    }

    public Date getUltimoGuardado() {
        return ultimoGuardado;
    }

    public Estados setUltimoGuardado(Date ultimoGuardado) {
        this.ultimoGuardado = ultimoGuardado;
        return this;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", muertes=" + muertes +
                ", fallecido=" + fallecido +
                ", creacionPartida=" + creacionPartida +
                ", ultimoGuardado=" + ultimoGuardado +
                '}';
    }
}
