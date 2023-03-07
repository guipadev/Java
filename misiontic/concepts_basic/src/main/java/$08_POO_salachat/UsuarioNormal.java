package $08_POO_salachat;

import java.util.Date;
public class UsuarioNormal extends Usuario{
    public UsuarioNormal(String nombre, String email, String identificacion, String contrasena) {
        super(nombre, email, identificacion, contrasena);
    }
    @Override
    public void chatear(Usuario u, String mensaje) {

        Usuario[] participantes = new Usuario[2];
        participantes[0] = u;
        participantes[1] = this;

        //crear chat con participantes
        Chat c = new Chat(participantes);
        Mensaje m = new Mensaje(mensaje, new Date(), this);
        c.mostrarMensaje(m);
    }
}