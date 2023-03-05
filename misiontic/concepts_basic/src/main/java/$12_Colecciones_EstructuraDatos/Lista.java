package Colecciones_EstructuraDatos;

import PatronesDeDiseno.factory.Circle;

import java.sql.Array;
import java.util.*;

/**
 * la ventaja de ArrayList sobre un array es que es expandible,
 * es decir que crece a medida que se le añaden elementos
 **/

public class Lista {

    public static void main(String[] args) {

        //Formas declarar lista
        List lista = new ArrayList();
        List listota = new LinkedList();

        //forma de declarar lista , restringiendo ingresar solo un tipo especifico de dato

        //ArrayList es un arreglo
        //Por detras trabaja que apenas se llene el arreglo se crea un nuevo mas grande y se borra el otro
        //Con solo indicar la posicion del indice encontramos el elemtno
        List<Double> listado = new ArrayList<>();
        //LinkedList funciona con objetos, trabaja con nodos encadenados, donde vas creando cada vez un objeto
        //recorre todos los nodos para encontrar el elemento, el unico limite es la memoria
        List<String> listadoB = new LinkedList<>();

        // Ejemplo uso LinkedList
        // si necesitas guardas muchos datos solo para guardarlos y no hacer nada con los datos
        // es la mejor opcion, porque podemos agregar tantos datos como quiera

        // Ejemplo uso ArrayList
        // Cuando sabemos de antemano cuantos objetos necesitamos
        // List<Double> listado = new ArrayList<>(15); creamos con espacio de 15 objetos

        //guarda cualquier tipo de elemento en la lista
        //la idea es que todos los elementos de la lista sean del mismo tipo
        lista.add("asd");
        lista.add(15614);
        lista.add(new Circle()); //se puede hasta un objeto, pero no es recomendado

        //Agregando elementos del mismo elemento
        listado.add(2.5);
        listado.add(3.2);

        //Mostrar posicion especifica con get
        System.out.println(listado.get(0));

        //HashMap es el diccionario en Java
        //Se puede declara de las siguientes formas
        HashMap<String, String> listaA = new HashMap<>();
        Map<String, String> listaB = new HashMap<>();

        //Agregar elementos al diccionario
        listaA.put("Hola", "Lala");

        //Obtener elementos dada una llave
        listaA.get("Hola");

        System.out.println(listaA.get("Hola"));
    }
}
