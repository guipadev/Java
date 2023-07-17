package Absolute.POO;

/**
 * PROGRAMACION ORIENTADA A OBJETOS
 *
 * CLASE
 * Es un modelo o plantilla donde se puede sacar muchos objetos con las mismas caracteristicas
 *
 * Ejemplo:
 *
 * Clase Avion
 * Atributos: Color, numeroMotores, capacidadMax.
 * Metodos(acciones): Despegar(), Volar(), Aterrizar().
 *
 * Clase Cubo
 * Atributos: Nombre, Textura, Dimension.
 *
 * Objeto TNT               Objeto Agua
 * Atributos:               Atributos:
 * Nombre = "TNT"           Nombre = "Agua"
 * Textura = img.png        Textura = liquida
 * dimension = 1            dimension = 1000
 * Metodo:                  Metodo:
 * Explotar()               Expandir()
 *
 *
 * Clase Personaje          Clase Espada
 * Atributos:               Atributos:
 * nombre = "Mike";         nombre
 * skin = mike.png;         daño
 * vida = 20;               textura
 *
 *                          Metodo:
 *                          dañar();
 *
 * De la clase Espada podremos hacer los objetos Espada Diamante, Espada Madera etc.
 * Y todo con la misma clase, ya que tiene los mismos atribtos. Pero diferentes datos.
 *
 * Espada Fuego             Espada Hielo
 * nombre = "Fuego"         nombre = "Hielo"
 * daño = 8;                daño = 7;
 * textura = "caliente";    textura = "helado";
 *
 * quemar();                congelar();
 *
 *
 * HERENCIA
 * Lo que el Padre le da a su hija. El arte de reutilizar código de extender algo que ya
 * programaste u otro que tendra lo mismo.
 *
 * Clase Padre              Clase Hija
 * Clase Espada             Atributos: Los hereda de la clase espada, pero pueden haber atributos extras.
 *                          poder(); animacion(); efecot();
 *
 * Son el mismo objeto, pero con diferente proposito. Reutilización  de código. Ejemplo:
 *
 * Clase Armadura           Clase Role extends Armadura
 * - proteccion             - hereda atributos
 * - durabilidad            - elemento
 * - textura                - poder
 *
 *
 * POLIMORFISMO
 * Poli -> Muchos
 * Morfismo -> Forma, composición estructura de cuerpo
 */

// Clase Padre
class Cubo {
    // Atributos
    protected int dimension;
    protected String nombre;
    protected String textura;

    // Método
    public void destruir() {
        System.out.println("Destrucción me rompi");
    }
}

// Clase Hija Carbon Hereda de Padre Cubo
class Carbon extends Cubo {
    private int xp;

    @Override
    public void destruir() {
        System.out.println("Me rompi tengo un carbon");
    }
}

class Diamante extends Cubo {
    private int xp;

    @Override
    public void destruir() {
        System.out.println("Me rompi tengo un diamante");
    }
}

/**
 * Hereda todos los atributos y metodos de cubo pero puede cambiar nombre, textura, dimension
 */
public class App {

    public static void main(String[] args) {
        /**
         * Aquí se ocupa el código de Cubo pero tambien el código de su clase
         * hija Diamante
         */
        Cubo carboncito = new Carbon();

        carboncito.destruir(); // Me rompi tengo un carbon

        Cubo diamantito = new Diamante();

        diamantito.destruir(); // Me rompi tengo un diamante
    }
}

/**
 * ENCAPSULAMIENTO - Package encapsulamiento;
 *
 * Modificadores de Acceso:
 * default -> Cuando no se pone nada
 * public -> Se tiene acceso desde cualquier lugar
 * protected -> Solo las clases package pueden tener acceso
 * private -> Solo la clase principal tiene acceso *
 */

class Personaje {

    private String nombre;
    private int edad;
    private String textura;

    /**
     * Este metodo permite cambiar el atributo private nombre
     * @param nombre
     * setNombre podria tener cualquier otro nombre
     */
    public void setNombre(String nombre) {
        // Poder modificar el nombre del objeto a futuro
        this.nombre = nombre;
    }

    /**
     * Este método permite mostrar el atributo nombre privado por fuera de la clase
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void saludar() {
        System.out.println("Hola!!");
    }

    public static void main(String[] args) {

        Personaje personaje1 = new Personaje();
        // Si hicieramos esto fuera de otra clase generaria Error
        personaje1.nombre = "Steven";

        /**
         * Como crear objetos si no tenemos acceso
         * SETTERS
         * Para introducir  this.edad = edad;
         * GETTERS
         * Para obtener     return edad;
         */
    }
}