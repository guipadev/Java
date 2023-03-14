package FactoryRedSocial;

import java.util.HashMap;

/**
 * Clase que implementa la parte frontal el Patrón de Diseño Factory.
 * Corresponde a la fábrica en donde se recibe la solicitud de creación de componentes,
 * se aplica la lógica correspondiente para la creación de acuerdo a las clases definidas
 * como posible componente en la fábrica, y oculta del usuario final la complejidad
 * de generación de objetos y relaciones
 */
public class Fabrica {
   
    /**
     * Constructor de la clase
     */
    public Fabrica(){} 
    
    
    /**
     * Este método es utilizado para recibir la solicitud del cliente (en este caso desde la clase Fachada, implementación
     * del patrón de diseño Facade), y generar el objeto correspondiente para ser enviado al usuario.
     * @param tipo
     * @param requerimiento
     * @return componente de la red social
     */
    protected ComponenteRedSocial crearComponenteRedSocial(String tipo, HashMap<String, String> requerimiento){
        // en el HashMap llamado "requerimiento", se deberán enviar los datos necesarios para crear cada componente según corresponda
        
        ComponenteRedSocial respuesta = null;
        switch(tipo){
            case "Usuario":
                String nombre = requerimiento.get("nombre");
                String email = requerimiento.get("email");
                String alias = requerimiento.get("alias");
                respuesta = new Usuario(nombre, email, alias);
                break;
            case "Grupo":
                String nombreGrupo = requerimiento.get("nombre");
                respuesta = new Grupo(nombreGrupo);
                break;
            case "Estado":
                String fecha = requerimiento.get("fecha");
                String contenido = requerimiento.get("contenido");
                respuesta = new Estado(fecha, contenido);
                break;
        }
        
        // ATENCIÓN: Si se requuiere agregar un nuevo componente, simplemente se agrega la opción en el Switch y se notifica
        // al usuario el requerimiento de datos para la creación de dicho componente. De esta manera, será transparente el proceso
        
        return respuesta;
    }
}
