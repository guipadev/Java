import java.util.Date;

public class UsuarioPremium extends UsuarioNormal{
    
    private String prefijo;
    private Date fechaVencimiento;
    private String tarjetaCredito;

    public UsuarioPremium(String prefijo, Date fechaVencimiento, String tarjetaCredito, String apodo, String identificacion, String nombre, String email, String contrasena) {
        super(apodo, identificacion, nombre, email, contrasena, "premium");
        this.prefijo = prefijo;
        this.fechaVencimiento = fechaVencimiento;
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    
    
    
    
    
    
}
