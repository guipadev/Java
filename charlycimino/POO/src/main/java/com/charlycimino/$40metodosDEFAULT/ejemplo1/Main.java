package com.charlycimino.$40metodosDEFAULT.ejemplo1;

/*
* Aquí tenemos el problema del diamante ya que las interface se empiezan a aparecer cada
* vez más a las clases abstractas, ya que esto es como una pseudo herencia multiple con la
* salvedad que en las interfaces no podemos guardar atributos
* Pero hasta hora pueden tener un conjunto de métodos abstractos y de métodos concretos que
* en este caso se llaman default al igual que las clases abstractas
*
* En el ejemplo 2 se realiza la solucion
*/
public class Main {

    public static void main(String[] args) {
        Persona p = new Persona("1234");
        Reserva r = new Reserva();
        Automovil a = new Automovil();

        p.mostrarIdentificacion();
        r.mostrarIdentificacion();
        a.mostrarIdentificacion();
    }
}
