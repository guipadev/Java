//package 08_Clases_&_POO;

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

    /** Se puede definir un saludo personalizado que tenga en cuenta
     ** el estado (valor de los atributos) del objeto. **/
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

    /**
     * Usando la clase anterior, se quiere instanciar un objeto a partir de ella.
     * La manera de hacerlo en Java es la siguiente:
     **/
    public static void main(String[] args) {
        /**
         * Perro es la clase que se definió anteriormente
         * miPerro es el objeto que se acaba de instanciar
         **/

        /**
         * public: Cualquier otro objeto puede acceder al atributo o método.
         * protected: Solo objetos de la misma clase, subclase, o del mismo
         * paquete. (package) pueden acceder al atributo o método.
         * private: Solo objetos de la misma clase pueden acceder al atributo o método
         **/
        Perro miPerro = new Perro(5, "Toby", "Blue");
        miPerro.saludar(); //Hola, mi nombre es Toby
        System.out.println(miPerro.edad); //5

        miPerro.ladrar(); //Guau guau

        /**
         * Podemos usar varios objetos en un mismo programa, haciendo referencia al
         * objeto deseado por el nombre que le dimos al momento de crearlo.
         * Es decir, si tenemos los objetos miPerro1, miPerro2 y miPerro3,
         * podemos acceder a la edad de miPerro2 con:
         **/
        Perro miPerro1 = new Perro(5, "Toby", "Azul");
        Perro miPerro2 = new Perro(7, "Vainilla", "Negro");
        Perro miPerro3 = new Perro(5, "Bony", "Amarillo");

        System.out.println(miPerro2.edad); // 7

        miPerro1.quienEsMayor(miPerro2); // Vainilla es mayor que yo

        miPerro1.saludarOtroPerro(miPerro2); // Hola Vainilla, yo soy Toby
    }
}
