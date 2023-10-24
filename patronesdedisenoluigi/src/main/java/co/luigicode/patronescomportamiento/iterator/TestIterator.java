package co.luigicode.patronescomportamiento.iterator;

import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
      /*
        //Yo tengo una lista de cadenas, y voy a recorrer la cadena, y voy a utilizar el patron
        //iterator que viene implementado en java con moton de clases y librerias ya implemntado
        //no importa como este implementada una lista o pila y tampoco como almacenados los datos,
        //como se enlazan unos con otros, simplemente llamo al iterador, mientras alla uno muestramelo
        //este recorre la estructura de datos, sea cual sea, esto hace que el cliente no se preocupe como
        //estara implementada la estructrua de dato
        ListNode<String> listNode = new ListNode<>(new Node<>("hola"));
        listNode.addEnd("qué");
        listNode.addEnd("tal");
        Iterator<Node<String>> iterator = listNode.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        listNode.forEach(System.out::println);
        */
        Inventory inventory = new Inventory();
        inventory.addEnd(new Item("sword", 10));
        inventory.addEnd(new Item("shield", 10));
        inventory.addEnd(new Item("armor", 20));
        inventory.addEnd(new Item("helmet", 10));
        ItemIterator iterator = inventory.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("=========================");
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}