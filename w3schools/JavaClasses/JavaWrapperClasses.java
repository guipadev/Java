package JavaClasses;

/*
Clases contenedoras de Java

Las clases contenedoras proporcionan una forma de utilizar tipos de datos primitivos
( int, boolean, etc.) como objetos.

La siguiente tabla muestra el tipo primitivo y la clase contenedora equivalente:

Primitive Data Type     Wrapper Class
byte	                Byte
short	                Short
int	                    Integer
long	                Long
float	                Float
double	                Double
boolean	                Boolean
char	                Character

A veces, debe usar clases contenedoras, por ejemplo, cuando trabaja con objetos de colección,
como ArrayList, donde no se pueden usar tipos primitivos (la lista solo puede almacenar objetos):
*/

import java.util.ArrayList;

public class JavaWrapperClasses {

    public static void main(String[] args) {

        // Invalid
        // ArrayList<int> myNumbers = new ArrayList<int>();

        // Valid
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        // Creación de objetos de envoltorio
        // Para crear un objeto contenedor, use la clase contenedora en lugar del tipo primitivo.
        // Para obtener el valor, puede simplemente imprimir el objeto:
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        /*
        Como ahora está trabajando con objetos, puede usar ciertos métodos para obtener información
        sobre el objeto específico.

        Por ejemplo, los siguientes métodos se utilizan para obtener el valor asociado con el objeto
        contenedor correspondiente:
        intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().

        Este ejemplo generará el mismo resultado que el ejemplo anterior:
        */
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // Otro método útil es el toString() método, que se utiliza para convertir objetos
        // envoltorios en cadenas.
        // En el siguiente ejemplo,
        // convertimos an Integer en a String y usamos el length() método de la String clase
        // para generar la longitud de la "cadena":
        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());
    }
}
