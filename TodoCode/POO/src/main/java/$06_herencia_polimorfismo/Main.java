package $06_herencia_polimorfismo;

public class Main {
    
    public static void main(String[] args) {
        
        // Empleado
        
        Empleado emple = new Empleado();
        emple.getNum_legajo();
        emple.getNombre();
        
        
        // Consultor
        
        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getNombre();
        
        
        
    }
}
