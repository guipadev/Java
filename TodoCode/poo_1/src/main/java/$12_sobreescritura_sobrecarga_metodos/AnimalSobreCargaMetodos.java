package $12_sobreescritura_sobrecarga_metodos;

public class AnimalSobreCargaMetodos {

    private int id_animal;
    private String descripcion;
    
    // constructores
    public AnimalSobreCargaMetodos() { }

    public AnimalSobreCargaMetodos(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion = descripcion;
    }
  
    // métodos getters y setters
    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    // otros métodos, que son sobrecargar de métodos
    // nombre iguales, pero parametros diferentes
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido de tipo " + tipoSonido);
    }
    
}
