package $07_polimorfismo;

import $06_herencia_polimorfismo.Consultor;
import $06_herencia_polimorfismo.Empleado;
import $06_herencia_polimorfismo.Jefe;
import $06_herencia_polimorfismo.Persona;

public class Main {

    public static void main(String[] args) {
        
        // Polimorfismo
        // Distintos tipos que pertenecen a clases hijas
        Persona vector [] = new Persona [5];
        vector [0] = new Persona ();
        vector [1] = new Empleado ();
        vector [2] = new Consultor ();
        vector [3] = new Jefe ();
        
        Persona perso = new Persona ();
        Consultor consul = new Consultor ();
        
        // Polimorfismo
        // Al objeto persona le podemos asignar consultor
        // La asignación se puede hacer de un hijo a padre, pero no de padre a hijo
        perso = consul;
    }
}
