package com.dev.modulo1.clasesyobjetos;

/**
 * CLASES
 * Permiten modelar los elementos (entidades, sujetos) que hacen parte del mundo del problema.
 *
 * OBJETOS
 * Son instancias de las clases. Es decir que tienen valores asignados para sus atributos.
 */
public class Pizza {

    /**
     * ATRIBUTOS
     * Permiten definir las características o propiedades de una clase
     *
     * ATRIBUTOS - TIPOS DE DATOS
     * Permiten definir el dominio de los atributos
     *
     * TIPOS BÁSICOS DE DATOS
     * - NÚMERO ENTEROS
     * ° byte -> 8 BITS
     * ° short -> 16 BITS
     * ° int -> 32 BITS
     * ° long -> 64 BITS
     * - NÚMEROS REALES
     * ° float -> PRECISIÓN SIMPLE
     * ° double -> PRECISIÓN DOBLE
     * - BOOLEANOS
     * ° boolean
     * - CARACTERES
     * ° char
     *
     * CLASES
     * - CLASES PROPIAS DE JAVA
     * ° String -> REPRESENTA CADENAS DE CARACTERES
     *   Consideraciones - String
     *   Se pueden concatenar cadenas de caracteres o cadenas con tipos básicos de datos
     *   String + String  ó  String + double  ó  String + int   ->      String
     *
     * - CLASES DE NUESTRO PROGRAMA
     */
    private String nombre;
    private double costoDeProduccion;
    private int cantidadProducida;
    private double precioDeVenta;

    /**
     * MÉTODOS CONSTRUCTORES
     * - Permiten crear un objeto con las características de una clase
     * - Todas las clases tiene un constructor por defecto
     * - Una clase puede tener tantos constructores como se desee
     * - Tiene la responsabilidad de inicializar los atributos del objeto
     */
    public Pizza(String nNombre, double nCosto, double nPrecio) {
        this.nombre = nNombre;
        this.costoDeProduccion = nCosto;
        this.precioDeVenta = nPrecio;
    }

    /**
     *     MÉTODOS E INSTRUCCIONES
     *     Permiten definir el comportamiento de una clase. Es decir la forma de recibir,
     *     manipular y entregar información
     *
     *     - MÉTODOS
     *     ° Signatura
     *     ° Cuerpo = conjunto de instrucciones
     *
     *     - INSTRUCCIONES
     *     ° Retorno
     *     ° Asignación
     *      ¬ x = x + y ->  x += y;
     *      ¬ x += 1;   ->  x++;
     *     ° Operaciones Matemáticas
     *      ¬ SUMA -> X + Y;
     *      ¬ RESTA -> X - Y;
     *      ¬ MULTIPLICACION -> X * Y;
     *      ¬ DIVISIÓN -> X / Y;
     *          El tipo de datos del dividiendo y el divisor determinan el tipo del cociente
     *          int / double  ó  double / double  ó double / int  ->  double
     *          int / int  ->  int
     *          Si queremos un valor más exacto de int x = 5;  int y = 2;
     *          ((double)x / y) -> 2.5            x / y ->  2
     *      ¬ RESIDUO -> X % Y;
     *     ° Creación de variables
     */
    public int darCantidadProducida() {
        return cantidadProducida;
    }

    public void modificarPrecioVenta(double nuevoPrecio) {
        precioDeVenta = nuevoPrecio;
    }

    public double darGananciaUnitaria() {
        // return precioDeVenta - costoDeProduccion;
        double resta = precioDeVenta - costoDeProduccion;

        return resta;
    }

    /**
     * LLAMADO DE MÉTODOS
     * ¿Cuándo utilizar (llamar) un método?
     * Una clase necesita un cálculo realizado en otro método de LA MISMA clase
     * Una clase necesita un cálculo realizado en un método de OTRA clase
     * El operador punt (.) permite acceder a los miembros de una clase (atributos y métodos publicos)
     */
    public double darGananciaTotal() {
        double resta = darGananciaUnitaria();

        return resta * cantidadProducida;
    }
}
