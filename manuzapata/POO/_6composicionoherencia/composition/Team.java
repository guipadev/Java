package com.manuelzapata._6composicionoherencia.composition;

/**
 * Una desventaja de la herencia
 * - Una clase hija no puede reducir la interfaz de la clase base
 * - Al sobrescribir un método de la clase hija, no hay que violar el principio de sustitución de Liskov
 * Según este principio, hay que ser coherentes con el método de la clase padre
 * - La herencia puede romper el encapsulamiento de la clase padre
 * - Las clase hija tiene un fuerte acoplamiento con la clase padre
 *
 * - En la composición, las relaciones entre objetos es de tipo "Tiene un/una"
 * Un carro tiene un motor, este carro no hereda de la clase motor, son 2 clases independientes conectadas por una relación de composición
 *
 * - En el caso de la herencia, las relaciones es de tipo "es un/una"
 * Tenemos un clase base carro y clase carro deportivo, por lo cual diriamos que un carro deportivo es un carro
 * Tenemos un clase base carro y clase carro deportivo, por lo cual diriamos que un carro deportivo es un carro
 */
public class Team {

    private Sport sport;

    private Category category;

}