package ejemploChat;

import java.util.Date;

public abstract class Mensaje {
    
    private String texto;
    private Date fechaCreacion;
    
    private UsuarioNormal propietario;

    public Mensaje(String texto, UsuarioNormal propietario) {
        this.texto = texto;
        this.fechaCreacion = new Date();
        this.propietario = propietario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public UsuarioNormal getPropietario() {
        return propietario;
    }

    public void setPropietario(UsuarioNormal propietario) {
        this.propietario = propietario;
    }
    
    
    
    
    
}
