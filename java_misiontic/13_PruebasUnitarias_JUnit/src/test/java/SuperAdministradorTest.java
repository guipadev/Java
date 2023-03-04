

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SuperAdministradorTest {
    
    
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        String identificacion = "123456";
        String nombre = "Nata Loz";
        String email = "nasdf@people.com";
        String contrasena = "password";
        SuperAdministrador result = SuperAdministrador.getInstance(identificacion, nombre, email, contrasena);
        assertNotNull(result);
        assertEquals(identificacion, result.getIdentificacion());
    }

   
    @Test
    public void testCrearUsuario() {
        String identificacion = "123456";
        String nombre = "Nata Loz";
        String email = "nasdf@people.com";
        String contrasena = "password";
        SuperAdministrador superadmin = SuperAdministrador.getInstance(identificacion, nombre, email, contrasena);
        
        System.out.println("crearUsuario");
        String apodo = "Benitez";
        String identificacion  = "456789";
        String nombre = "Jose Osso";
        String email = "elosoponze@gmail.com";
        String contrasena = "4465874748";
        
        
        UsuarioNormal result = superadmin.crearUsuario(apodo, identificacion, nombre, email, contrasena);
        assertNotNull(result);
        assertEquals(identificacion, result.getIdentificacion());
   }

    @Test
    public void testListarUsuarios() {
        System.out.println("listarUsuarios");
        SuperAdministrador superAdmin = SuperAdministrador.getInstance("123456", "Juan Camilo", "superadmin@nuevochat.com", "password");
        superAdmin.eliminarTodos();
        superAdmin.crearUsuario("JC", "2012365", "Juan Castro", "juan@email.com", "1234561");
        superAdmin.crearUsuario("PP", "3012365", "Pepito Perez", "pepito@email.com", "1234562");
        superAdmin.crearUsuario("FT", "4012365", "Fulanito Tales", "fulanito@email.com", "1234563");
        superAdmin.crearUsuario("SA", "5012365", "Sutanito Aguilar", "sutanito@email.com", "1234564");
        
        int tamano = superAdmin.listarUsuarios();
        
        assertEquals(tamano, 4);
    }

    @Test
    public void testObtenerUsuarioExiste() {
        SuperAdministrador superAdmin = SuperAdministrador.getInstance("123456", "Juan Camilo", "superadmin@nuevochat.com", "password");
        superAdmin.eliminarTodos();
        UsuarioNormal un = superAdmin.crearUsuario("JJ", "123456", "David Miller", "david@miller.com", "123456");
        UsuarioNormal otroUsuario = superAdmin.obtenerUsuario("123456");
        assertNotNull(otroUsuario);
        assertEquals("123456", otroUsuario.getIdentificacion());
    }
    
    @Test
    public void testObtenerUsuarioNoExiste() {
        SuperAdministrador superAdmin = SuperAdministrador.getInstance("123456", "Juan Camilo", "superadmin@nuevochat.com", "password");
        superAdmin.eliminarTodos();
        UsuarioNormal un = superAdmin.crearUsuario("JJ", "123456", "David Miller", "david@miller.com", "123456");
        UsuarioNormal otroUsuario = superAdmin.obtenerUsuario("852258");
        assertNull(otroUsuario);
    }


   
