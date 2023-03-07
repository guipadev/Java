package $08_POO_salachat;

import java.util.Date;
public class Mensaje {
    private String texto;
    private Date fecha;
    private boolean visto;
    private Usuario emisor;
    private boolean borrado;

    public Mensaje(String texto, Date fecha, Usuario emisor) {
        this.texto = texto;
        this.fecha = fecha;
        this.emisor = emisor;
        this.visto = false;
        this.borrado = false;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
}
