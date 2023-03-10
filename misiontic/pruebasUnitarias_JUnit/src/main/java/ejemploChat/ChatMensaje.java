package ejemploChat;

public class ChatMensaje extends Mensaje {
    
    private boolean visto;

    public ChatMensaje(String texto, UsuarioNormal usuario) {
        super(texto, usuario);
        visto = false;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
    
    @Override
    public String toString() {
        return super.getFechaCreacion()+ " : " + super.getTexto() + ". Visto: " + visto;
    }
    
    
    
}