package $12_Colecciones_EstructuraDatos.formasTrabajarListas;

import $11_PatronesDeDiseno.factory.Circle;

import java.util.*;

/**
 * la ventaja de ArrayList sobre un array es que es expandible,
 * es decir que crece a medida que se le añaden elementos
 **/

public class Eje_List_ArrayList {

    //ArrayList es un arreglo
    //Por detras trabaja que apenas se llene el arreglo se crea un nuevo mas grande y se borra el otro
    //Con solo indicar la posicion del indice encontramos el elemtno

    public static void main(String[] args) {

        // Formas declarar lista
        List lista = new ArrayList();

        // Forma de declarar lista , restringiendo ingresar solo un tipo especifico de dato
        List<Double> listado = new ArrayList<>();

        // Cuando sabemos de antemano cuantos objetos necesitamos
        List<Double> listadoCerrado = new ArrayList<>(15); // creamos con espacio de 15 objetos

        //guarda cualquier tipo de elemento en la lista
        lista.add("asd");
        lista.add(15614);
        lista.add(new Circle()); //se puede hasta un objeto, pero no es recomendado

        //la idea es que todos los elementos de la lista sean del mismo tipo
        listado.add(2.5);
        listado.add(3.2);

        //Mostrar posicion especifica con get
        System.out.println(listado.get(0));

        System.out.println("--------------------------------------");

        for (Object data : lista) {
            System.out.println(data);
        }
    }
}
