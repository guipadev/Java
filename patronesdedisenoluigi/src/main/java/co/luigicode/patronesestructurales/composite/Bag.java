package co.luigicode.patronesestructurales.composite;

import java.util.ArrayList;

/**
 * Clase bolsa/contenedor, el inventario va a ser un objeto de este tipo
 */
public class Bag extends BaseItem {
    /**
     * La bolsa no va a tener valor, sera 0
     * Lo que tendra valor son los elementos que contienen los items
     * @param name nombre
     */
    public Bag(String name) {
        super(name, 0);
        // Inicializar los items, porque van con items
        items = new ArrayList<>();
    }

    @Override
    public void add(BaseItem baseItem) {
        items.add(baseItem);
    }

    @Override
    public void delete(BaseItem baseItem) {
        items.remove(baseItem);
    }

    /**
     * Función recursiva que se llama así misma
     * Se recorren todos los items, y llamamos el getValue
     * En caso de que tengas uno devuelve inmediatamente el resultado
     * @return
     */
    @Override
    public int getValue() {
        int result = value;

        for (BaseItem item: items)
            result += item.getValue(); // La función getValue() esta dentro de si misma

        return result;
    }
}
