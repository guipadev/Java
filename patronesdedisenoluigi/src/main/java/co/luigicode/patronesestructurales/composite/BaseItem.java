package co.luigicode.patronesestructurales.composite;

import java.util.List;

/**
 * Calcular el valor de todo el inventario, todo lo que lleve encima el player
 * vamos a sumar el valor de todos los items y se calcular el total del inventario
 * La lista serian los hijos, osea un nodo tiene unas hojas y serian los items
 * El item contiene elementos como el mismo item contiene items
 */
public abstract class BaseItem {
    protected String name;
    protected int value;
    protected List<BaseItem> items;

    public BaseItem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public abstract void add(BaseItem baseItem);

    public abstract void delete(BaseItem baseItem);

    public abstract int getValue();
}
