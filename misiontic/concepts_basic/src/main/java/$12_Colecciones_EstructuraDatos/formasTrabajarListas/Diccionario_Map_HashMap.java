package $12_Colecciones_EstructuraDatos.formasTrabajarListas;

import java.util.HashMap;
import java.util.Map;

public class Diccionario_Map_HashMap {

    public static void main(String[] args) {

        //HashMap es el diccionario en Java. Se puede declara de las siguientes formas

        HashMap<String, String> listaA = new HashMap<>();

        Map<String, String> listaB = new HashMap<>();

        //Agregar elementos al diccionario
        listaA.put("mensaje", "hola como estas?");
        listaB.put("nombre", "Juan David");

        //Obtener elementos dada una llave
        //listaA.get("mensaje");
        //listaB.get("nombre");

        System.out.println(listaA.get("mensaje"));

        System.out.println(listaB.get("nombre"));
    }
}
