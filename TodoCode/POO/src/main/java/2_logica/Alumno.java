package logica;

public class Alumno {
    
    // Atributos
    int id;
    String nombre;
    String apellido;
    
    
    // Constructores
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Métodos para mostrar/obtener get y establecer/modificar set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    // Métodos Personalizados
    public void mostrarNombre() {
        
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }
    
    public void saberAprobado(double calificacion) {
    
        if (calificacion >= 6) {
            System.out.println("Aprobo la materia");
        }
        else {
            System.out.println("Uyy NO aprobé");
        }
    }
    
}
