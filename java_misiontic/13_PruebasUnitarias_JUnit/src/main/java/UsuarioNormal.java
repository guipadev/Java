import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class UsuarioNormal extends Usuario {
    
    private String apodo;
    private Date fechaCreacion;
    
    private List<Chat> chats;
    private List<Mensaje> mensajes;

    public UsuarioNormal(String apodo, String identificacion, String nombre, String email, String contrasena, String tipo) {
        super(identificacion, nombre, email, contrasena, tipo);
        this.apodo = apodo;
        this.fechaCreacion = new Date();
        
        chats = new LinkedList<>();
        mensajes = new LinkedList<>();
        
    }
    
    public Chat crearChat(UsuarioNormal otroUsuario, String nombre)
    {
        Chat c = new Chat(nombre, this, otroUsuario);
        otroUsuario.agregarChat(c);
        this.agregarChat(c);
        return c;
    }
    
    public void agregarChat(Chat c)
    {
        chats.add(c);
    }
    
    public int verChats()
    {
        for (Chat chat : chats) {
            System.out.println(chat);
        }
        return chats.size();
    }
    
    public Chat obtenerChat(String nombreChat)
    {
        for (Chat chat : chats) {
            if(chat.getNombre().equals(nombreChat))
                return chat;
        }
        return null;
    }
    
    public void chatear(String nombreChat, String texto)
    {
        Chat c = obtenerChat(nombreChat);
        c.agregarMensaje(texto, this);        
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        
        return "Email: " + super.getEmail() + "\n"
                + "Nombre: " + super.getNombre() + "\n"
                + "Apodo: " + apodo + "\n"
                + "Identificacion: " + super.getIdentificacion() + "\n"
                + "Tipo: " + super.getTipo() + "\n"
                + "Fecha creacion: " + fechaCreacion + "\n";
    }
        
}