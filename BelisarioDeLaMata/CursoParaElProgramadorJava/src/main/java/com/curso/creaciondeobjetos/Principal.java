package com.curso.creaciondeobjetos;

/**
 *
 * @author yamid
 */
public class Principal {
    
        public static void main(String[] args) {
                Materia materiaDelComponente = new Materia();
                materiaDelComponente.codigo = "XXX";
                materiaDelComponente.nombre = "ALGORITMOS";
                
                Materia materiaDelComponente2 = new Materia();
                materiaDelComponente2.codigo = "ZZZ";
                materiaDelComponente2.nombre = "PROGRAMACION";
                
                Materia materiaDelComponente3 = new Materia("YYY", "ESTRUCTURA DE DATOS"); 
    }
}
