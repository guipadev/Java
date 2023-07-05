## Introducción a Java

- Introducción a Maven
- Disección de un programa sencillo en Java
- Comentarios
- Tipos de datos enteros
- Tipos de datos de punto flotante
- El tipo de datos de los caracteres
- El tipo de datos lógicos
- Literales
- Variables
- Conversiones de tipo
- Operadores aritméticos
- Operadores relacionales y lógicos
- Operadores de bits
- Precedencia de operadores y parentisis
- Sentenfia de control: IF
- Sentencia de control: SWITCH
- Sentencia de control: WHILE
- Sentencia de control: DO-WHILE
- Sentencia de control: FOR
- Sentencia de control: BREAK & CONTINUE
- Funciones y Constantes
- Números grandes
- Cadenas de caracteres
- Entrada y salida

## Programación Orientada a Objetos

- Tipos de abstractos de datos, clases y objetos
- La estructura estatica: Las clases
- La estructura dinamica: Los objetos
- Caracteristicas Constantes y Globales
- Herencia
- Polimorfismo y vinculación dinámica
- Interfaces
- Object: La superclase cosmica
- Gestión de Excepciones
- Enumerados
- Arrays
- Clases internas
- Anotaciones

## Programación Genérica

- Clases Genéricas, métodos genéricos y genericidad restringida
- El borrador de tipos y consecuencias
- Tipos comodín
- Varianza de tipos
- Tipos materializables y contaminación del montículo
- La interfaz java.lang.comparable<T>

## Programación por contrato, prueba unitarias y diseño de algoritmos

- Aserciones
- Robustez
- Pruebas con JUnit
- Diseño de algoritmos iterativos
- Diseño de algoritmos recursivos

## Estructura de datos fundamentales

- Pilas
- Colas
- Listas
- Cola dobles
- Conjuntos
- Tablas
- Multiconjuntos
- Arrays
- Arbol binarios

## Programación funcional

- Interfaces funcionales y expresiones lambda
- Evaluación perezosa, efectos

### Disección de un programa sencillo en Java
- Java respecta mayúsculas y minúsculas, por ejemplo no es lo mismo main que Main.
- La palabra reservada **public** es un modificado de acceso, osea que controla el acceso a otras partes del código.
- La palbra reservada **class** toda entidad que existe en Java vive dentro de una clase.
- Después de usar **class** esta el nombre que debe empezar por una letra, por convención la primer letra en mayúscula, ej: Fabrica1
- El nombre del fichero debe ser igual al nombre de la clase.
- Para ejecutar un programa compilado, la JVM siempre empieza la ejecución del código que se encuentra dentro del método **main()** de la clase indicada.
- Las llaves { } los bloques de un programa.
- Para imprimir en consola usamos el objeto **System.out** e invocamos el método **println()** el método **print()** y dentro de esta pasamos los parametros que queramos mostrar.
  
### Comentarios

- // En una sola linea

- /*  
Varias lineas de codigo
Se pueden tener
en este lugar
*/

- Java tiene la herramienta **javadoc** para generar documentación en formato **HTML** extrayendo información de los siguientes elementos:
  - Paquetes
  - Clases e interfaces públicas
  - Métodos públicos y protegidos
  - Atributos públicos y protegidos

La utilidad **javadoc** genera documentación código fuente a partir de comentariso /** */

/**
 * @param descripción de variable
 * @return describe contenido que retorna el método
 * @throws indica que el método puede arrojar una excepción
 * @author nombre del autor
 * @version version actual
 * @since cualquier descripción de la versión que introdujo esta característica
 * @deprecated indica que la clase, método o variable ya no deberia utilizarse
 */


### Tipos de datos enteros
Números que carecen de parte fraccionaria. Permitido valores negativos:

- **byte** 8 bit = 1 byte rango -128 a 127.
- **short** 16 bits = 2 bytes rango -32.768 a 32.767.
- **int** 32 bits = 4 bytes rango -2.147.483.648 a 2.147.483.648.
- **long** 64 bits = 8 bytes rango -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808. 


### Tipos de datos de punto flotante



- El tipo de datos de los caracteres
- El tipo de datos lógicos
- Literales
- Variables
- Conversiones de tipo
- Operadores aritméticos
- Operadores relacionales y lógicos
- Operadores de bits
- Precedencia de operadores y parentisis
- Sentenfia de control: IF
- Sentencia de control: SWITCH
- Sentencia de control: WHILE
- Sentencia de control: DO-WHILE
- Sentencia de control: FOR
- Sentencia de control: BREAK & CONTINUE
- Funciones y Constantes
- Números grandes
- Cadenas de caracteres
- Entrada y salida




