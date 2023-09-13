package co.luigicode.patronescreacionales.prototype;

public class TestPrototype {

    public static void main(String[] args) {
        // Así de esta forma todo a punta a la misma referencia en memoria
        //Enemy enemy1 = new Enemy(100, 100);
        //Enemy enemy2 = enemy1;
        //Enemy enemy3 = enemy1;

        // Ya teniendo un constructor vacio en la entidad
        // Si hay 20 comenzamos a escribirlos todos
        //Enemy enemy2 = new Enemy();
        //enemy2.setHealth(enemy1.getHealth());
        //enemy2.setDamage(enemy1.getDamage());

        // Tambien se podria usar el constructor, pero si tambien hay 200 variable tocaria c/u
        //Enemy enemy3 = new Enemy(enemy1.getHealth(), enemy1.getDamage());

        /*
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);

        System.out.println("==============");

        enemy2.setHealth(0); // Muerte al enemigo 2, mata a todos

        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);
         */

        // La forma correcta seria aplicar este método que permite clonar de forma rápida
        // Así obteniendo una var distinta con su respectivo espacio en memoria
        // pero con los mismo valores de donde se clono
        //Enemy enemy = enemy1.clone();

        Warrior warrior1 = new Warrior(100, 100, 100);
        Warrior warrior2 = (Warrior) warrior1.clone();

        System.out.println(warrior1);
        System.out.println(warrior2);

        System.out.println("==============");

        warrior2.setHealth(0); // solo morira el guerrero 2

        System.out.println(warrior1);
        System.out.println(warrior2);

        System.out.println("==============");

        Mage mage1 = new Mage(100, 100, 100);
        Mage mage2 = (Mage) mage1.clone();

        System.out.println(mage1);
        System.out.println(mage2);

        System.out.println("==============");

        mage2.setHealth(0); // solo morira el mago 2

        System.out.println(mage1);
        System.out.println(mage2);


    }
}
