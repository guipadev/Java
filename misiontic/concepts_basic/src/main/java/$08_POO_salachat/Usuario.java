public class Usuario {

    private String nombre;
    private String email;
    private String identificacion;
    private String contrasena;
    private Chat[] chats;
    private Mensaje[] mensajes;
    private int numChats;
    private int numMensaje;

    public Usuario(String nombre, String email, String identificacion, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.identificacion = identificacion;
        this.contrasena = contrasena;
        this.chats = new Chat[1000];
        this.mensajes = new Mensaje[10000];
        numChats = 0;
        numMensaje = 0;
    }

    //comportamientos
    public void chatear(Usuario u, String mensaje){

    }

    public void borrarMensaje(Mensaje mensaje){
        for (int i = 0; i < numMensaje; i++){
            if(mensaje == mensajes[i])
                mensajes[i].setBorrado(true);
        }
    }

    //getters y setters
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


}
