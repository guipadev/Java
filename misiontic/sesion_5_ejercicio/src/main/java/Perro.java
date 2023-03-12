
public class Perro {
    
    // Atributos (caracteristicas de la entidad)
    public int edad;
    public String nombre;
    public String colorOjos;
    
    // Constructor (Funcion especial para iniciar objeto)
    public Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }
    
    public Perro(int edad) {
        this.edad = edad;
        this.nombre = "";
        this.colorOjos = "";
    }
    
    // Metodos(Representan comportamientos)
    public void ladrar() {
        System.out.println("Guau guau");
    }
    
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
 
    public void quienEsMayor(Perro otroPerro) {
        if (this.edad > otroPerro.edad) {
            System.out.println("El perro a comparar es mayor que " + otroPerro.nombre);
        } else if (this.edad == otroPerro.edad) {
            System.out.println("El perro a compara tiene la misma edad ");
        } else {
            System.out.println(otroPerro.nombre + " El perro a comparar es mayor ");
        }
    }
    
    public void saludarOtroPerro(Perro otroPerro) {
        System.out.println("Hola perrosqui " + otroPerro.nombre + ", yo soy "
                + this.nombre);
    }
    
    

}
