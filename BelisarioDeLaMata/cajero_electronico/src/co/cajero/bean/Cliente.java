package co.cajero.bean;

import java.io.Serializable;

public class Cliente implements Serializable{
    private String numeroDeCedula;
    private String contrasena;
    private String nombreCompleto;
    private float saldo;
    private String tipoCuenta; //CA - CC

    public String getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public void setNumeroDeCedula(String numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    
}
