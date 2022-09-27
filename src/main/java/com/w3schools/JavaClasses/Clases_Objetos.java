package JavaClasses;

/*
Clases/Objetos Java
Java es un lenguaje de programación orientado a objetos.

Todo en Java está asociado con clases y objetos, junto con sus atributos y métodos.
Por ejemplo: en la vida real, un automóvil es un objeto.
El automóvil tiene atributos, como el peso y el color, y métodos, como la conducción y el freno.

Una clase es como un constructor de objetos o un "modelo" para crear objetos.

Crear una clase
Para crear una clase, utilice la palabra clave class:

Principal.java
Cree una clase llamada "Main" con una variable x:

public class Main {
  int x = 5;
}
Recuerde del capítulo Sintaxis de Java que una clase siempre debe comenzar
con una primera letra mayúscula y que el nombre del archivo java debe coincidir
con el nombre de la clase.
*/

/*
Crear un objeto
En Java, un objeto se crea a partir de una clase.
Ya hemos creado la clase llamada Main, por lo que ahora podemos usarla para crear objetos.

Para crear un objeto de Main, especifique el nombre de la clase, seguido del nombre del objeto
y use la palabra clave new:
*/
public class Clases_Objetos {

    // Cree un objeto llamado " myObj" e imprima el valor de x:
    int x = 5;

    public static void main(String[] args) {

        Clases_Objetos myObj = new Clases_Objetos();
        System.out.println(myObj.x);

        // Objetos Múltiples
        //Puede crear múltiples objetos de una clase:
        Clases_Objetos myObj1 = new Clases_Objetos();  // Object 1
        Clases_Objetos myObj2 = new Clases_Objetos();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }

    /*
    Uso de varias clases
    También puede crear un objeto de una clase y acceder a él en otra clase. Esto se usa a menudo para una mejor organización de las clases (una clase tiene todos los atributos y métodos, mientras que la otra clase contiene el main()método (código a ejecutar)).

    Recuerde que el nombre del archivo java debe coincidir con el nombre de la clase. En este ejemplo, hemos creado dos archivos en el mismo directorio/carpeta:

    - Principal.java
    - Segundo.java

    Principal.java
    public class Main {
        int x = 5;
    }

    Segundo.java
    class Second {
        public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println(myObj.x);
        }
    }
    */
}
