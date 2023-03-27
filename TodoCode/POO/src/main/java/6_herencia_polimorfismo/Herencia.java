package herencia;

public class Herencia {
    
    public static void main(String[] args) {
        
        // Empleado
        /*
        Empleado emple = new Empleado();
        emple.getNum_legajo();
        emple.getNombre();
        */
        
        // Consultor
        /*
        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getNombre();
        */
        
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
