package $12_Colecciones_EstructuraDatos.arrayListPeople;
public class Persona {
    private String nombre;
    int edad;
    int CI;

    public Persona(String nombre, int edad, int CI) {
        this.nombre = nombre;
        this.edad = edad;
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }
}