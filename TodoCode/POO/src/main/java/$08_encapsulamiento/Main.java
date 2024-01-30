package $08_encapsulamiento;

public class Main {
    
    public static void main(String[] args) {
        
        Alumno alu = new Alumno ();
        Alumno alu2 = new Alumno (15, "Ernesto", "Perez");
        
        System.out.println("id: " + alu2.getId());
        System.out.println("nombre: " + alu2.getNombre());
        System.out.println("apellido: " + alu2.getApellido());
    }
    
}
