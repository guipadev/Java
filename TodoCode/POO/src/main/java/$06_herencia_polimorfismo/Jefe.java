package $06_herencia_polimorfismo;

public class Jefe extends Persona {

    int id_jefe;
    String departamente_jefe;

    public Jefe() {
    }

    public Jefe(int id_jefe, String departamente_jefe, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamente_jefe = departamente_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamente_jefe() {
        return departamente_jefe;
    }

    public void setDepartamente_jefe(String departamente_jefe) {
        this.departamente_jefe = departamente_jefe;
    }
    
    
    
}
