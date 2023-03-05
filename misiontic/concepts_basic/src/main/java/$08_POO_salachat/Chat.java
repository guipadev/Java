//package POO_salachat;


public class Chat {

    private Mensaje[] mensajes;
    private Usuario[] usuarios;
    private int numMensajes;

    public Chat(Usuario[] usuarios) {
        this.usuarios = usuarios;
        this.mensajes = new Mensaje[10000];
        numMensajes = 0;
    }

    public void mostrarMensaje(Mensaje mensaje){
        System.out.println(mensaje.getFecha() + " " + mensaje.getTexto());
        mensajes[numMensajes] = mensaje;
        numMensajes++;
    }

    public void mostrarUsuario(){
        System.out.println("LOS USUARIOS SON:");
        for (int i = 0; i < usuarios.length; i++){
            System.out.println(usuarios[i].getNombre());
        }
    }


    //Getters y Setters

    public Mensaje[] getMensajes() {
        return mensajes;
    }

    public void setMensajes(Mensaje[] mensajes) {
        this.mensajes = mensajes;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }




}