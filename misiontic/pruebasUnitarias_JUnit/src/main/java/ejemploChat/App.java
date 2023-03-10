package ejemploChat;

public class App {

    
    public static void main(String[] args) {
        
        SuperAdministrador superAdmin = SuperAdministrador.getInstance("123456", "Juan Camilo", "superadmin@nuevochat.com", "password");
        
        superAdmin.crearUsuario("JC", "2012365", "Juan Castro", "juan@email.com", "1234561");
        superAdmin.crearUsuario("PP", "3012365", "Pepito Perez", "pepito@email.com", "1234562");
        superAdmin.crearUsuario("FT", "4012365", "Fulanito Tales", "fulanito@email.com", "1234563");
        superAdmin.crearUsuario("SA", "5012365", "Sutanito Aguilar", "sutanito@email.com", "1234564");
        
        int tamano = superAdmin.listarUsuarios();
        
        System.out.println(tamano);
        
        UsuarioNormal u1 = superAdmin.obtenerUsuario("2012365");
        UsuarioNormal u2 = superAdmin.obtenerUsuario("4012365");
        
        Chat amigosChat = u1.crearChat(u2, "Amigos");
        
        
        System.out.println("*************************");
        
        
        u1.chatear("Amigos", "Hola Fulanito");
        amigosChat.listarMensajes(u2);
        System.out.println("------------------------");        
        u2.chatear("Amigos", "Hola Juan, milagro en leerte.");
        amigosChat.listarMensajes(u1);
        System.out.println("------------------------"); 
        u1.chatear("Amigos", "Lo mismo digo");        
        amigosChat.listarMensajes(u1);
        System.out.println("------------------------"); 
                            
    }
    
}