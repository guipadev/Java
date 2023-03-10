package ejemploChat;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class SuperAdministrador extends Usuario {
    
    private static SuperAdministrador sa;
    
    private List<UsuarioNormal> usuarios;    

    private SuperAdministrador(String identificacion, String nombre, String email, String contrasena) {
        super(identificacion, nombre, email, contrasena, "superadmin");
        
        usuarios = new LinkedList<>();
    }
    
    public static SuperAdministrador getInstance(String identificacion, String nombre, String email, String contrasena)
    {
        if(sa == null)
            sa = new SuperAdministrador(identificacion, nombre, email, contrasena);
        return sa;
    }
    
    public UsuarioNormal crearUsuario(String apodo, String identificacion, String nombre, String email, String contrasena)
    {    
        UsuarioNormal un = new UsuarioNormal(apodo, identificacion, nombre, email, contrasena, "normal");
        usuarios.add(un);
        return un;
    }
    
    public int listarUsuarios()
    {
        for (UsuarioNormal usuario : usuarios) {
            System.out.println(usuario);
            System.out.println("-----------------");
        }
        return usuarios.size();
    }
    
    public UsuarioNormal obtenerUsuario(String identificacion)
    {
        for (UsuarioNormal usuario : usuarios) {
            if(usuario.getIdentificacion().equals(identificacion))                            
                return usuario;            
        }
        return null;
    }
    
    public UsuarioNormal eliminarUsuario(String identificacion)
    {
        UsuarioNormal un = obtenerUsuario(identificacion);
        if(un != null)
            usuarios.remove(un);
        return un;
    }
    
    public UsuarioPremium promoverPremium(String identificacion, String prefijo, String tarjeta)
    {
        UsuarioNormal un = eliminarUsuario(identificacion);
        if(un == null)
            return null;
        Date fechaVencimiento = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 30);
        UsuarioPremium up = new UsuarioPremium(prefijo, fechaVencimiento,tarjeta, un.getApodo(), un.getIdentificacion(), un.getNombre(), un.getEmail(), un.getContrasena());
        usuarios.add(up);
        return up;
    }
    
    public void eliminarTodos()
    {
        usuarios = new LinkedList<>();
    }
     
}