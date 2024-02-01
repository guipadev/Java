package $08_encapsulamiento;

public class Alumno {

    private int id;
    private String nombre;
    private String apellido;

    // Si los métodos se cambian a PRIVADO no se podran crear o utilizar en otras clases
    // PROTECTED se utiliza por ejemplo tener una clase Persona y que solo las hijas puedan obtener datos de ellas
    
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

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
    
    
}
