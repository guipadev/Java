

### **Tagged Interfaces** - Interfaces etiqueteadas o marcadas en Java

Una interfaz es un recurso en programación, específicamente en Java. Una interfaz etiquetada es una interfaz común que no tiene métodos definidos. Su único propósito es marcar una clase como que implementa dicha interfaz. Algunos ejemplos de interfaces etiquetadas comúnmente utilizadas, aunque posiblemente no se conozcan como "interfaz etiquetada", son `Serializable` o `Cloneable`.

También puedes crear tus propias interfaces etiquetadas. Por ejemplo, supongamos que queremos marcar una clase como "comible". Simplemente definimos nuestra interfaz llamada `Comible` que no tiene métodos definidos. Luego, creamos nuestra clase y la implementamos con la interfaz `Comible`. Utilizando un método llamado `isaInstanceOf`, podemos verificar si un objeto pertenece a una clase que implementa la interfaz. De esta manera, tenemos un recurso adicional en programación para realizar este tipo de marcado.

### ¿Qué es **instanceof** y para qué se usa?

**instanceOf** es una palabra reservada del lenguaje que se utiliza para verificar si un objeto pertenece a una clase o es una instancia de una clase específica. Esta operación permite realizar comprobaciones de tipo en tiempo de ejecución y determinar si un objeto es una instancia de una clase, o si es una instancia de una subclase de esa clase.

Para entender mejor su funcionamiento, supongamos que tenemos la siguiente estructura de clases:

```
class Mamifero { ... }

class Persona extends Mamifero { ... }

class Delfin extends Mamifero { ... }
```

En este caso, tanto **Persona** como **Delfin** son subclases de **Mamifero**.

Veamos un ejemplo de uso de **instanceof**:

```
Mamifero mamifero = new Persona();
System.out.println(mamifero instanceof Persona); // Resultado: true

mamifero = new Delfin();
System.out.println(mamifero instanceof Persona); // Resultado: false

System.out.println(mamifero instanceof Mamifero); // Resultado: true

```

En el primer caso, creamos un objeto **Persona** y lo asignamos a una variable de tipo **Mamifero**. Al utilizar **mamifero instanceof Persona**, obtendremos **true**, ya que el objeto es tanto una instancia de **Mamifero** como una instancia de **Persona**.

En el segundo caso, creamos un objeto **Delfin** y nuevamente lo asignamos a una variable de tipo **Mamifero**. Al utilizar **mamifero instanceof Persona**, obtenemos **false**, ya que el objeto es un **Delfin** y no una instancia de **Persona**.

En el tercer caso, verificamos si **mamifero** es una instancia de **Mamifero**, y obtendremos **true**, ya que es un **Delfin**, que es una subclase de **Mamifero**.

En resumen, el operador **instanceof** nos permite verificar la relación de herencia entre clases y determinar si un objeto es una instancia de una clase específica o de alguna de sus subclases. Esto es útil para realizar comprobaciones de tipo dinámicas y tomar decisiones en función del tipo de objeto en tiempo de ejecución.

### ¿Qué es una clase sellada en Java?

Java 15 introdujo las clases selladas y Java 17 las mejoró. Una clase sellada es aquella que define que solo ciertas clases pueden heredar de ella. Esto se logra mediante el uso de la palabra reservada **sealed**. Una clase que implementa una clase sellada debe ser de uno de los tres tipos permitidos: **final**, **non-sealed**, o **permits**.

A continuación, se muestra un ejemplo de una clase sellada llamada "Mamifero" que solo permite que las clases "Delfin" y "Persona" hereden de ella. En este caso, "Delfin" es una clase no sellada, lo que significa que rompe el sellamiento de la clase padre. Mientras que la clase "Persona" extiende a "Mamifero" y es una clase final, lo que indica que tiene el mismo comportamiento que en versiones previas de Java.

```
public sealed class Mamifero permits Delfin, Persona {
    // Definición de la clase sellada "Mamifero"
    // Solo las clases "Delfin" y "Persona" pueden heredar de ella

    // ...
}

public final class Persona extends Mamifero {
    // Clase "Persona" que extiende de la clase sellada "Mamifero"

    // ...
}

public class Delfin extends Mamifero {
    // Clase "Delfin" que extiende de la clase sellada "Mamifero"

    // ...
}

```

En este ejemplo, la clase **Mamifero** se declara como sellada utilizando la palabra clave **sealed**. La cláusula **permits** especifica las clases que pueden heredar de ella, en este caso, **Delfin** y **Persona**.

La clase **Persona** es una subclase de **Mamifero** y se declara como **final**, lo que significa que no puede tener subclases adicionales. Esto indica que tiene el mismo comportamiento que en versiones previas de Java.

La clase **Delfin** también es una subclase de **Mamifero**, pero no se declara como **final**, lo que significa que se permite la creación de subclases adicionales que extiendan **Delfin**. Esto rompe el sellamiento de la clase padre **Mamifero**.

En resumen, las clases selladas son una característica introducida en Java 15 y mejorada en Java 17. Permiten controlar la herencia restringiendo qué clases pueden heredar de una clase sellada. Esto proporciona una forma más controlada y segura de definir jerarquías de clases en Java.

### Excepciones **checked** y **unchecked** en Java

En Java, existen fundamentalmente dos tipos o categorías de excepciones: las excepciones chequeadas y las excepciones no chequeadas.

Las excepciones chequeadas son aquellas que están implementadas por debajo de la clase **Throwable**. Requieren que se añadan controles adicionales en nuestras aplicaciones mediante el uso de elementos y piezas adicionales de código. En la firma de los métodos, es necesario agregar la cláusula **throws** para indicar que el método puede lanzar una excepción chequeada.

Por otro lado, las excepciones no chequeadas son aquellas que están implementadas por debajo de la clase **RuntimeException**. No necesitamos añadir controles adicionales en nuestras aplicaciones para manejar estas excepciones. Son más flexibles y no requieren la cláusula **throws** en la firma de los métodos.

La principal diferencia entre una excepción no chequeada y una excepción chequeada radica en los controles adicionales que se necesitan para manejarlas. Las excepciones chequeadas requieren un manejo explícito o una propagación hacia arriba en la jerarquía de llamadas a métodos, mientras que las excepciones no chequeadas no tienen estos requisitos adicionales.

### ¿Qué es **Loom**?

**Loom** es un proyecto para entrega a la **JVM** un nuevo modelo de concurrecia ligero y de alto rendimiento para reemplazar el modelo actual de concurrencia en las primeras versiones de Java.

El proyecto se compone de tres subproyectos fundamentales:

JP425 
se enfoca en la implementación de hilos virtuales o rutinas de Java. 

JP428 
se centra en la implementación de un mecanismo de concurrencia estructurada. 

JDP429 se ocupa de la implementación de los denominados "scot values". 

Este proyecto tiene como objetivo presentar estas innovaciones en la próxima edición de Java.


### Patrones de diseño y sus categorias

En Java, existen tres categorías fundamentales de patrones de diseño: 

Patrones creacionales:
Se centran en la creación de objetos y ofrecen formas flexibles de instanciar objetos. 
Algunos ejemplos populares de patrones creacionales son el patrón Builder, el patrón Singleton y el patrón Factory.

Patrones estructurales:
Se enfocan en la composición de clases y objetos para formar estructuras más grandes y complejas. 
Son ampliamente utilizados y algunos ejemplos comunes incluyen el patrón Adapter, el patrón Decorator y el patrón Facade.

Patrones de comportamiento:
Se centran en las interacciones y comunicaciones entre objetos. 
Estos patrones definen cómo los objetos colaboran y distribuyen las responsabilidades. 
Algunos ejemplos populares de patrones de comportamiento son el patrón Strategy, el patrón Observer y el patrón Command.

Cada categoría tiene su propio propósito y ofrece soluciones específicas para problemas comunes en el diseño de software. 
Estos patrones son ampliamente utilizados y comprenderlos es importante tanto para el desarrollo de software como para las entrevistas de trabajo en el ámbito de la programación.


### Diferencia entre String, StringBuilder y StringBuffer

Estas clases se utilizan para manipular cadenas, pero tienen diferencias importantes.

String 
Es la clase más comúnmente utilizada para manipular cadenas en Java. Sin embargo, tiene la característica de ser inmutable, lo que significa que una vez que se define un String, no se puede modificar internamente. 
Cualquier operación que parezca modificar un String en realidad crea una nueva instancia de String con los cambios aplicados.

StringBuilder
Es una clase mutable, lo que significa que se puede modificar. Proporciona funciones útiles como reverse o insert, que permiten insertar o revertir una cadena de manera eficiente. Es más eficiente en términos de rendimiento cuando se realizan operaciones repetidas de modificación de cadenas, ya que evita la creación de múltiples instancias de cadenas intermedias.

StringBuffer 
Es similar a StringBuilder en términos de mutabilidad y funciones ofrecidas. Sin embargo, a diferencia de StringBuilder, StringBuffer es una clase sincronizada, lo que significa que es segura para su uso en entornos concurrentes donde múltiples hilos pueden acceder y modificar la misma instancia de StringBuffer. Sin embargo, debido a esta sincronización, StringBuffer puede tener un rendimiento ligeramente inferior en comparación con StringBuilder en entornos no concurrentes.

En resumen, la diferencia clave entre estas clases es que String es inmutable, StringBuilder es mutable y más eficiente en términos de rendimiento, y StringBuffer es mutable y sincronizado para su uso en entornos concurrentes. La elección de la clase a utilizar depende de los requisitos específicos del programa y si se necesita mutabilidad o sincronización.

### Mapas

¿Qué es Map y para qué es útil?

Map es una interfaz y su implementación más común es HashMap.

En Java, los mapas son estructuras de datos que permiten almacenar y acceder a elementos utilizando una estructura de llave-valor. 
La interfaz más comúnmente utilizada para representar mapas en Java es `Map`, y su implementación más común es `HashMap`.

`HashMap` es una implementación popular de la interfaz `Map` y es probable que ya lo hayas utilizado. Otra implementación particularmente útil y ampliamente utilizada es `ConcurrentHashMap`, que proporciona capacidades de concurrencia mejorada.

Un mapa en Java permite almacenar y recuperar elementos utilizando una clave. Puede almacenar estructuras de datos de tipo llave-valor y proporciona un mecanismo eficiente para buscar y recuperar valores asociados a una clave específica.

En Java, al igual que en otros lenguajes de programación, se puede acceder a los valores de un mapa utilizando la clave correspondiente. Esto permite un acceso rápido y eficiente a los valores almacenados.

En resumen, en Java los mapas son estructuras de datos que permiten almacenar y acceder a elementos utilizando una estructura de llave-valor. La implementación más común es `HashMap`, pero también existe `ConcurrentHashMap` que proporciona capacidades de concurrencia mejorada. Los mapas son útiles para almacenar y recuperar información utilizando una clave específica, lo que permite un acceso rápido y eficiente a los valores asociados.


### Cómo podemos recorrer un Map


Básicamente, hay dos formas comunes de recorrer un mapa. La primera forma es utilizando el enfoque tradicional y la segunda forma es utilizando características introducidas después de Java 8.

Tradicional
Podemos recorrer un mapa de la siguiente manera: primero, obtenemos el conjunto de claves del mapa utilizando el método `keySet()`. Luego, iteramos sobre cada clave y, a partir de cada clave, obtenemos el valor correspondiente utilizando el método `get()`. De esta forma, podemos trabajar con la clave y el valor como sea necesario.


```
for (String key : map.keySet()) {
    Integer value = map.get(key);
    System.out.println(key + "-" + value);
}
```

Después de Java 8, podemos utilizar la sintaxis de lambdas para recorrer los mapas de manera más concisa. Podemos utilizar el método `forEach()` del mapa junto con una expresión lambda para definir lo que queremos hacer con cada clave y valor. Por ejemplo, podemos imprimirlos utilizando el método `System.out.println()`.

```
map.forEach((k, v) -> System.out.println(k + "-" + v));
```

En resumen, existen dos formas comunes de recorrer un mapa en Java. La forma tradicional involucra obtener el conjunto de claves y luego iterar sobre ellas para acceder a los valores correspondientes. Después de Java 8, podemos utilizar la sintaxis de lambdas y el método `forEach()` para recorrer los mapas de manera más concisa y realizar acciones específicas con cada clave y valor.


### Que es una clase ?

En Java, una clase es el elemento fundamental de la programación orientada a objetos. Funciona como una plantilla o molde a partir del cual se pueden crear objetos que representan elementos de la vida real, como automóviles, casas u otros objetos.

Una clase se compone de atributos, métodos y constructores. Los atributos definen las características del elemento que estamos representando. Por ejemplo, en una clase "Auto", los atributos podrían ser el color, la marca o el modelo del automóvil.

Los métodos representan las acciones que un objeto de la clase puede realizar. En el caso del ejemplo del "Auto", los métodos podrían ser "arrancar", "acelerar" o "frenar".

Los constructores son elementos especiales que nos permiten crear objetos de la clase. Utilizamos los constructores para inicializar los atributos del objeto cuando se crea una instancia de la clase.

En resumen, una clase en Java es una plantilla o molde que define la estructura y el comportamiento de los objetos que representan elementos de la vida real. Está compuesta por atributos, métodos y constructores, que definen las características, acciones y la forma de crear los objetos de la clase.


### Que es una clase abstracta ?

En Java, una clase abstracta es una clase especial que se utiliza como una plantilla para crear otras clases que comparten características similares. A diferencia de las clases normales, no se pueden crear objetos directamente a partir de una clase abstracta.

Una clase abstracta sirve como un concepto general o una abstracción de un grupo de objetos relacionados. Por ejemplo, si queremos representar varios tipos de animales, como perros y gatos, podemos crear una clase abstracta llamada "Animal". Todos los animales tienen algunas características comunes, como comer o si son carnívoros. Estas características comunes se definen en la clase abstracta "Animal".

```
public abstract class Animal {
    protected abstract void comer();
    
    protected boolean esCarnivoro() {
        return true;
    }
}
```

Las clases abstractas se identifican mediante la palabra reservada `abstract`. No se pueden instanciar directamente, pero se pueden utilizar como una base para crear clases concretas que heredan de ellas. Estas clases concretas deben implementar o sobrescribir los métodos abstractos definidos en la clase abstracta.

En resumen, una clase abstracta en Java es una plantilla que se utiliza para crear otras clases relacionadas. No se pueden crear objetos directamente a partir de una clase abstracta. Se utilizan para representar conceptos generales y definir características comunes que se comparten entre las clases hijas. Las clases abstractas se identifican con la palabra reservada `abstract` y sirven como una abstracción de un grupo de objetos relacionados.


### La palabra **final** en Java, para que se usa ?

La palabra reservada "final" en Java tiene diferentes usos dependiendo de dónde se utilice. Puede ser utilizada a nivel de clase, a nivel de método o a nivel de atributo.

Cuando se utiliza la palabra "final" a nivel de clase, estamos indicando que nadie más puede heredar de esa clase. En una jerarquía de herencia, esa clase sería la última, no se pueden crear subclases adicionales.

```
public final class Humano extends Animal { }
```

Cuando se utiliza la palabra "final" a nivel de método, estamos indicando que ese método no puede ser sobreescrito en las clases hijas. El método final en la clase padre no puede ser modificado en las clases que la heredan.

```
public class Animal {
    
    protected final String comer() {
        return "EAT";
    }
}
```

Cuando se utiliza la palabra "final" a nivel de atributo, estamos indicando que esa variable es una constante, es decir, su valor no puede ser modificado una vez asignado.

```
private final int total = 100;
```

### Que diferencia hay entre **Map**, HashMap, HashTable, TreeMap, ConcurrentHashMap y LinkedHashMap

Todos ellos se utilizan para representar mapas, pero varían en la forma en que organizan y manejan los elementos internamente.

- Un Map es una interfaz que representa una colección de pares clave-valor. No especifica la implementación subyacente, solo define los métodos básicos para trabajar con un mapa.

- HashMap es una implementación de map que utiliza una tabla hash para organizar los elementos internamente. Proporciona un acceso rápido a los elementos y no garantiza un orden específico.

- Hashtable es similar a HashMap, pero es una versión sincronizada, lo que significa que es seguro para su uso en entornos concurrentes. Sin embargo, su uso se considera obsoleto en favor de ConcurrentHashMap.

- TreeMap es un mapa que utiliza una estructura de árbol binario de búsqueda equilibrado para ordenar y almacenar los elementos. Los elementos se ordenan automáticamente según el orden natural o un comparador personalizado.

- ConcurrentHashMap es una implementación de mapa optimizada para la concurrencia. Permite el acceso concurrente y seguro a través de segmentos o bloqueos finos, lo que lo hace adecuado para entornos con múltiples hilos.

- LinkedHashMap es una estructura de mapa que conserva el orden de inserción de los elementos, además de permitir el acceso rápido mediante claves. Combina la eficiencia de acceso de un HashMap con la capacidad de iterar en el orden de inserción.
 

### Cuál es la diferencia entre pasar parámetros por valor o por referencia ?

En Java, los parámetros se pasan por valor o por referencia dependiendo del tipo de dato que se esté utilizando. Si el tipo de dato es primitivo, los parámetros se pasan por valor. Si el tipo de dato es no primitivo, como objetos de clases, los parámetros se pasan por referencia.

La diferencia fundamental entre pasar parámetros por valor y pasar parámetros por referencia es que, cuando se pasa por valor, si se modifica la variable internamente, no se modifica la variable externa. En cambio, cuando se pasa por referencia, se modifica tanto la variable interna como la variable externa.

Para pasar datos primitivos por referencia en Java, se deben utilizar los correspondientes "wrappers" o envoltorios de tipos primitivos. Por ejemplo, si tenemos un dato primitivo de tipo `int`, deberíamos utilizar `Integer`.

### Qué es ThreadSafe

"ThreadSafe" significa en español "seguridad de hilos", la seguridad en hilos se aplica en el contexto de programas multihilos, que es común en la mayoría de los programas modernos. Se refiere principalmente a las estructuras de datos que cumplen con este principio.

"ThreadSafe" significa que es un programa que funciona correctamente durante la ejecucción simultánea de varios hilos.

Funciona correctamente cuando múltiples hilos acceden a datos compartidos y solo uno accede en un momento dado, a esos datos.

Cuando una estructura de datos es "thread-safe", significa que puede ser accedida y utilizada correctamente por múltiples hilos simultáneamente. Sin embargo, solo un hilo tiene acceso a los datos compartidos en un momento dado. Esto se conoce como "thread-safety".

En Java, existen múltiples estructuras de datos "thread-safe". Un ejemplo es `ConcurrentHashMap`, que es una implementación de mapa diseñada para soportar operaciones concurrentes de lectura y escritura de manera segura.

### Qué diferencias hay entre Set y HashSet ?

Set es una interfaz utilizada para trabajar con conjuntos de datos en Java. La característica principal de un Set es que NO permite elementos duplicados. Esto significa que cada elemento en un Set es único. Principal diferencia entre un Set y una Lista.

HashSet es una implementación específica de un Set que utiliza una tabla Hash como estructura adicional para acceder directamente a los elementos. HashSet no garantiza un orden específico de los elementos que se agregan. Los elementos se almacenan en función de sus valores hash, lo que permite una búsqueda y recuperación rápida.

```
Set<Integer> hs = new HashSet<>();
hs.add(34);
hs.add(78);
hs.add(78);
System.out.println(hs);

Resultado >> [34, 78]
```

Si planeas utilizar un Set para almacenar objetos, es importante asegurarse de que los objetos implementen el método `equals()` correctamente. Esto es necesario para garantizar que los elementos se consideren duplicados correctamente y puedan eliminarse si es necesario.

### Qué son los **hilos** y para que sirven ?

Un hilo es la unidad básica de utilización de la CPU. En Java se representan mediante la clase Thread y están mapeados 1 a 1 directamente a los hilos del sistema operativo. Cada hilo que se crea en una aplicación Java utiliza un hilo del sistema operativo para su ejecución de la JVM. 

Los hilos en Java tienen la utilidad de permitir la ejecución de tareas de forma concurrente (hacer múltiples tareas simultáneamente). Esto significa que se pueden realizar diferentes procesos o acciones en paralelo, lo que ayuda a mejorar la eficiencia y el rendimiento de las aplicaciones.

El proyecto Loom en Java es una iniciativa reciente que está cambiando la forma en que funcionan los hilos en la plataforma Java. 


### Synchronized en Java para que se usa ?

La palabra "synchronized" es una palabra reservada en Java que indica que un método o bloque de código solo puede ser ejecutado por un hilo a la vez. Es un elemento fundamental para garantizar el concepto de "thread-safety" (seguridad de hilos) en las aplicaciones.

Utilizar la palabra "synchronized" en Java asegura que el código o método designado se ejecute de manera segura en entornos concurrentes, evitando problemas de acceso y modificación simultánea de datos compartidos por múltiples hilos.

Para declarar e implementar un método como sincronizado en Java, se utiliza la palabra clave "synchronized" antes de la definición del método. Esto garantiza que solo un hilo pueda ejecutar el método a la vez, evitando problemas de concurrencia.

En resumen, la palabra reservada "synchronized" en Java se utiliza para garantizar que un método o bloque de código sea ejecutado por un solo hilo a la vez, asegurando la seguridad de hilos en entornos concurrentes.

### Diferencia entre interfaz y clase abstracta ?

En primer lugar, una interfaz en Java es un recurso de programación utilizado para definir contratos. Define los métodos que posteriormente se implementarán en las clases que la implementen. A partir de Java 8, también se pueden implementar métodos en una interfaz.

Por otro lado, una clase abstracta es una clase particular que puede tener atributos y puede tener tanto métodos concretos como métodos abstractos. Hasta aquí, no hay muchas diferencias entre una interfaz y una clase abstracta.

La principal diferencia radica en que una interfaz solo puede tener constantes, mientras que una clase abstracta puede tener atributos de clase y métodos concretos. Esta es una distinción importante.

Además, otra diferencia fundamental es que una clase puede heredar solo una clase abstracta, pero puede implementar múltiples interfaces. Esto significa que una clase puede tener una única clase abstracta como clase padre, pero puede implementar múltiples interfaces para adquirir diferentes funcionalidades.


### Qué es una condición de carrera ?

La condición de carrera es un concepto importante en programación que se refiere a una situación en la cual varios hilos o procesos acceden simultáneamente a un mismo recurso computacional. 

La condición de carrera se considera una situación indeseada, ya que puede provocar cambios no controlados en el estado de variables o recursos compartidos. Para prevenir o controlar las condiciones de carrera, se utiliza el recurso de programación conocido como sincronización.

La sincronización se utiliza para coordinar y sincronizar el acceso de diferentes hilos o elementos a recursos compartidos, asegurando que los cambios de estado se realicen de manera controlada y evitando conflictos.

Es importante comprender y manejar adecuadamente las condiciones de carrera para garantizar la integridad y consistencia de los datos en programas multihilo.

### Novedades en las interfaces de JDK 8 y 9

Desde las últimas versiones de Java (Java 8 y Java 9), se han añadido recursos útiles para el trabajo con interfaces en Java. 
Java 8 introdujo la posibilidad de implementar en la interfaz métodos estáticos y métodos por defecto, conocidos como "defaults". 
Java 9 presentó el cambio más significativo al permitir la implementación de métodos privados en las interfaces.

Probablemente te preguntes qué sentido tiene un método privado en una interfaz. 
Básicamente, nos posibilita aplicar el principio de responsabilidad única cuando utilizamos métodos por defecto o métodos estáticos dentro de la propia interfaz. 
Esto nos permite separar la implementación de ese método o tipo de métodos.

### Que es el Context Switching

Aquí tienes el texto organizado:

El context switching o cambio de contexto. 
El context switching es un principio mediante el cual se puede almacenar el estado de un hilo para luego poder reanudarlo y continuar su ejecución.

El context switching es el proceso o principio que permite que varios hilos o procesos compartan una misma CPU. 
Es esencialmente un principio para garantizar una programación multihilo efectiva.





