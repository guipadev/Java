package $18_relacion_entre_clases;

public class Propietario {
    
    private Long id;
    private String apelllido, nombre;

    public Propietario() { }

    public Propietario(Long id, String apelllido, String nombre) {
        this.id = id;
        this.apelllido = apelllido;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + ", apelllido=" + apelllido + ", nombre=" + nombre + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
