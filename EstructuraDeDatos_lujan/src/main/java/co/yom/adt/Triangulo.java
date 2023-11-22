package co.yom.adt;

/**
 * En estructura de datos esto es un ADT
 * Un tipo de dato abstracto que el programador, el sistema o los requerimientos necesitan
 * para poder trabajar de forma practica y sencilla, los datos
 */
public class Triangulo {

    private double base;
    private double altura;

    private double area() {
        return base * altura / 2.0;
    }
}
