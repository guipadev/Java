package $12_sobreescritura_sobrecarga_metodos.sobreescritura;

// Clase abstracta
public abstract class Animal {
    
    private int id_animal;
    private String descripcion;
    
    // constructores
    public Animal() { }

    public Animal(int id_animal, String descripcion) {
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
    
    // Método, cada hijo implementa a su manera
    // Sobre escriba, pise este método, lo modifique a su manera
    public abstract void hacerSonido();
}
