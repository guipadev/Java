
public abstract class Usuario {
    
    private String identificacion;
    private String nombre;
    private String email;
    private String contrasena;
    private String tipo;

    public Usuario(String identificacion, String nombre, String email, String contrasena, String tipo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
 }
