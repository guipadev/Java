package $08_Clases_POO.mascotaPerro;

public class Perro {

    // Atributos
    public int edad;
    public String nombre;
    public String colorOjos;

    // Constructor
    Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }

    // Metodos
    public void ladrar() {
        System.out.println("Guau guau");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    /*
    Se puede definir un saludo personalizado que tenga en cuenta
    el estado (valor de los atributos) del objeto.
    */

    // Metodos
    public void saludarOtroPerro(Perro otroPerro) {
        System.out.println("Hola " + otroPerro.nombre + ", yo soy " + this.nombre);
    }

    /**
     * Se pretende crear un método que compare las edades de dos perros.
     * Dicho método comparará la edad de un perro en específico,
     * contra la edad de otro perro cualquiera.
     **/
    public void quienEsMayor(Perro otroPerro) {
        if (this.edad > otroPerro.edad){
            System.out.println("Soy mayor que " + otroPerro.nombre);
        }else if (this.edad == otroPerro.edad){
            System.out.println("Tenemos la misma edad");
        }else{
            System.out.println(otroPerro.nombre + " es mayor que yo");
        }
    }
}
