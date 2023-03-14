package FactoryRedSocial;

import java.util.ArrayList;

/**
 * Esta clase modela los atributos y comportamientos básicos de un Estado en la red de Socitos.
 * Esta clase es parte de la implementación del Patrón de Diseño Factoty,
 * como un objeto a ser construido por la fábrica.
 */
public class Estado implements ComponenteRedSocial{
    
    //Atributos del Estado
    private String fecha = "";
    private String contenido = "";
    private ArrayList<String> comentarios = null;
    
    
    /**
     * Constructor de la Clase
     * @param fecha
     * @param contenido
     */
    public Estado(String fecha, String contenido){
        this.fecha = fecha;
        this.contenido = contenido;
        this.comentarios = new ArrayList<>();
    }
    
    
    /**
     * Este método es utilizado para agregar comentarios al estado.
     * @param nuevoComentario
     * @return éxito de la operación
     */
    public String agregarComentario(String nuevoComentario){
       try{
            this.comentarios.add(nuevoComentario);
            return "Proceso Exitoso";
        }
        catch(Exception ex){
            ex.printStackTrace();
            return "Proceso No Exitoso";
        } 
    }
    
    
    /**
     * Este método es utilizado para retornar todos los comentarios del estado en un solo String
     * @return comentarios
     */
    public String cargarComentarios(){
        String comentariosTotal = "";
        for(String comentario: this.comentarios){
            comentariosTotal += comentario + "\n";
        }
        return comentariosTotal;
    }
    
    
    @Override
    public String toString(){
        String respuesta = "Fecha: " + this.fecha + ". Contenido: " + this.contenido + "\n";
        return respuesta;
    }
}