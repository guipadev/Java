package ejemploChat;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Chat {
    
    private String nombre;
    private Date fechaCreacion;
    
    private UsuarioNormal usuario1;
    private UsuarioNormal usuario2;
    private List<ChatMensaje> mensajes;

    public Chat(String nombre, UsuarioNormal usuario1, UsuarioNormal usuario2) {
        this.nombre = nombre;
        fechaCreacion = new Date();
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        mensajes = new LinkedList<>();
        
    }
    
    public ChatMensaje agregarMensaje(String texto, UsuarioNormal usuario)
    {
        ChatMensaje m = new ChatMensaje(texto, usuario);
        mensajes.add(m);
        return m;
    }
    
    public int listarMensajes(UsuarioNormal usuario)
    {
        for (ChatMensaje mensaje : mensajes) {
            if(!mensaje.isVisto() && !usuario.equals(mensaje.getPropietario()))            
                mensaje.setVisto(true);
            System.out.println(mensaje);
        }
        return mensajes.size();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "ejemploChat.Chat{" + "nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", \nusuario1=" + usuario1 + ", usuario2=" + usuario2 + '}';
    }
   
}