package $12_Colecciones_EstructuraDatos.formasTrabajarListas;

import $11_PatronesDeDiseno.factory.Circle;

import java.util.LinkedList;
import java.util.List;

public class Eje_List_LinkedList {

    public static void main(String[] args) {

        //LinkedList funciona con objetos, trabaja con nodos encadenados, donde vas creando cada vez un objeto
        //recorre todos los nodos para encontrar el elemento, el unico limite es la memoria

        List listaLinkA = new LinkedList();

        List<String> listaLinkB = new LinkedList<>();

        // Ejemplo uso LinkedList
        // si necesitas guardas muchos datos solo para guardarlos y no hacer nada con los datos
        // es la mejor opcion, porque podemos agregar tantos datos como quiera

        //guarda cualquier tipo de elemento en la lista
        listaLinkA.add("asd");
        listaLinkA.add(15614);
        listaLinkA.add(new Circle()); //se puede hasta un objeto, pero no es recomendado

        //la idea es que todos los elementos de la lista sean del mismo tipo
        listaLinkB.add("perro");
        listaLinkB.add("gato");
        listaLinkB.add("cerdo");

        // Mostrar posicion especifica con get
        System.out.println(listaLinkA.get(0));

        System.out.println("-------------------------------------------------");

        // Mostrar toda la lista
        for (String mascota : listaLinkB) {
            System.out.println(mascota);
        }
    }
}
