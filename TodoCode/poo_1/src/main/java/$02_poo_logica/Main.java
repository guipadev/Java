package $02_poo_logica;

public class Main {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Luisina", "Rivera");
        
        // Utilizar métodos
        System.out.println("La ID del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
        // Asignar valores método vacio
        alu1.setId(8);
        alu1.setNombre("Marcos");
        alu1.setApellido("Perez");
        
        System.out.println("--------------------------------------");
        System.out.println("La ID del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
        
        // Modificar datos
        alu2.setId(35);
        
        System.out.println("--------------------------------------");
        System.out.println("La ID del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
    }
    
}
