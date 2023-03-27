package com.curso.creaciondeobjetos;

/**
 *
 * @author yamid
 */
public class Materia {
        
        String nombre;
        String codigo;

         {
            System.out.println("Siempre se ejecutan primero los bloques inicializadores #1");
        }
        
         /**
         * El método constructor es aquel que se ejecuta cuando un objeto de una clase es creado (instanciado)
         */
        public Materia() {
            System.out.println("Se ha instanciado un objeto de la clase materia");
        }
        
        {
            System.out.println("Siempre se ejecutan primero los bloques inicializadores #2");
        }
        
        // Constructor con parametros
        public Materia(String nombre, String codigo) {
            this.nombre = nombre;
            this.codigo = codigo;
        }
        
        /**
         * No es recomendable crear constructores con muchos parámetros
         * Es recomendabe un constructor sin parámetros
         * Y constructores con los parámetros principales
         */
        
        /**
         * Cuando se crea un objeto, luego se ejecuta el constructor, pero el constructor se ejecuta luego de un bloeque de inicialización
         * LOS BLOQUES DE CONSTRUCCIÓN/INICIALIZADORES
         * Se usan con el objetivo de colocar algún código que necesitemos realizar antes de que se ejecute cualquier bloque constructor
         * 
         */
        
}
