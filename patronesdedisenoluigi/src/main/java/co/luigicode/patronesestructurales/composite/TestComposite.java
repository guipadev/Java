package co.luigicode.patronesestructurales.composite;

/**
 * Entender principal lo de la funciones recursivas de la clase Bag
 * la función getValue()
 */
public class TestComposite {

    public static void main(String[] args) {

        // Bolsa inventario
        BaseItem inventory = new Bag("invetory");

        // Bolsa monedas
        BaseItem bagCoins = new Bag("bag coins");

        // Bolsa posiciones maginas
        BaseItem bagPotions = new Bag("bag positions");

        BaseItem coins = new Item("coins", 6);
        bagCoins.add(coins);

        BaseItem magicPotion = new Item("Magic potion", 3);
        bagPotions.add(magicPotion);

        BaseItem healtPotion = new Item("Healt potion", 3);
        bagPotions.add(healtPotion);

        // Items que no van en ningun bolsa, que van sueltos
        BaseItem blade = new Item("blade", 3);
        BaseItem shield = new Item("shield", 3);
        BaseItem armor = new Item("shield", 3);

        // Agregar al inventario
        inventory.add(bagCoins);
        inventory.add(bagPotions);
        inventory.add(blade);
        inventory.add(shield);
        inventory.add(armor);

        // Calcular precio que me tendria que dar 21
        System.out.println("Inventory total value: " + inventory.getValue());


    }
}
