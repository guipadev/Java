package com.curso.polimorfismoobjetosreferenciasycasting;

/*
El objeto en memoria es el tiene todas las caracteristicas y comportamientos
Pero el tipo referencia es el que determina cuales son esas caracteristicas y comportamientos
que van a ser referenciada o permitir el alcance
Así mismo cuando nostros asignamos un tipo de referencia que esté relacionado se hace un casting implícito
esto pasa cuando la clase Hija va a hacer referenciada desde una clase Padre
Si se quire que una clase Padre se referencia desde una clase Hija el casting implícito se realiza de forma manual
pero recordar que es posible dependiendo del objeto que este pueda o no realizarse
*/
public class Principal {

    public static void main(String[] args) {
        
       Persona persona = new Persona();
       System.out.println(persona);
       persona.comer();
       System.out.println("------");
       
       Estudiante estudiante = new Estudiante();
       System.out.println(estudiante);
       estudiante.comer();
       System.out.println("------");
       
       Docente docente = new Docente();
       docente.comer();
       System.out.println(docente);
       System.out.println("------");
       
       //Referencia nos ayuda a limitar caracteristicas y comportamientos que tiene un objeto
       //Casting (implicito/automatico cuando se hace clase hija se asigna a una clase padre) 
       //transformación de un tipo primitivo o referencia a otro tipo primitivo o referencia
       //Normalmente se realiza el casteo cuando se quiere asingar de clase padre a una hija
       Persona personaE = estudiante; //(Persona)estudiante
       personaE.comer();
       
       IActividad actividad = estudiante; //(IActividad)estudiante
       actividad.subir();
    }
}
