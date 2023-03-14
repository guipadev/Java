package FactoryRedSocial;

import java.util.ArrayList;

/**
 * Esta clase modela los atributos y comportamientos básicos de un Usuario en la red de Socitos.
 * Esta clase es parte de la implementación del Patrón de Diseño Factoty,
 * como un objeto a ser construido por la fábrica.
 */
public class Usuario implements ComponenteRedSocial{
   
    //Atributos del Usuario
    private String nombre = "";
    public String email = ""; // este debe ser único e irrepetible
    public String alias = ""; // este debe ser único e irrepetible
    private ArrayList<String> pendientes = null; // notificaciones pendientes por revisar
    private ArrayList<Estado> estados = null;
    
    
    /**
     * Constructor de la Clase
     * @param nombre
     * @param email
     * @param alias
     */
    public Usuario(String nombre, String email, String alias){
        this.nombre = nombre;
        this.email = email;
        this.alias = alias;
        this.pendientes = new ArrayList<>();
        this.estados = new ArrayList<>();
    }
    
    
    /**
     * Método utilizado para actualizar el nombre del usuario
     * @param nombre 
     */
    public void actualizarNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    /**
     * Método utilizado para agregar un nuevo estado "escrito" por el usuario.
     * @param nuevoEstado
     * @return éxito de la operación
     */
    public String agregarEstado(Estado nuevoEstado){
        try{
            this.estados.add(nuevoEstado);
            return "Proceso Exitoso";
        }
        catch(Exception ex){
            ex.printStackTrace();
            return "Proceso No Exitoso.";
        }
    }
    
    
    /**
     * Método que permite obtener los últimos 5 estados que ha publicado el usuario si tiene más de cinco. 
     * Si tiene menos de cinco estados, retornará los que tenga.
     * @return arreglo con los últimos estados
     */
    public String ultimosEstados(){
        int cantidad = (this.estados.size() < 5) ? this.estados.size() : 5;
        String estados_ = "";
        
        for(int i = 0; i < cantidad; i++){
            estados_ += this.estados.get(this.estados.size() - 1 - i).toString();
        }
        
        return estados_;
    }
    
    
    /**
     * Método utilizado para agregar una nueva notificación para el usuario.
     * @param nuevaNotificacion
     * @return éxito de la operación
     */
    public String agregarNotificacion(String nuevaNotificacion){
        try{
            this.pendientes.add(nuevaNotificacion);
            return "Proceso Exitoso";
        }
        catch(Exception ex){
            ex.printStackTrace();
            return "Proceso No Exitoso.";
        }
    }
    
    
    /**
     * Este método se utiliza para que un usuario pueda ver las notificaciones que tiene pendientes. 
     * Luego de retornar las notificaciones, esta lista será limpiada.
     * @return notificaciones pendientes
     */
    public String verNotificacionesPendientes(){
        String respuesta = "";
        for(String notificacion: this.pendientes){
            respuesta += notificacion + "\n";
        }
        this.pendientes.clear();
        return respuesta;
    }
    
    
    @Override
    public String toString(){
        String usuario = "El usuario tiene por nombre " + this.nombre + ", con el email " + this.email + 
                        " y con el alias " + this.alias + ". Ha escrito " + this.estados.size() + 
                        " estados, y tiene " + this.pendientes.size() + " notificaciones por leer.\n";
        return usuario;
    }
}