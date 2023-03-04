package IMC;

public class Persona {

    //Atributos
    //Los atributos se podrian inicializar pero NO, es mala practica
    private String nombre;
     int edad;
     char genero;
     double peso;
     double altura;
     Propiedad[] propiedades;

    //Mostrar u obtener valor del atributo privado
    public String getNombre() {
        return nombre;
    }

    //Permite asignar un valor a dicho atributo privado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor, siempre public
    public Persona(String nombre, int edad, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        propiedades = new Propiedad[10];
    }

    //No hay necesidad de colocar atributos a las funciones ya que se cuentan la informacion ya establecida
    public double calcularIMC(){
        return this.peso / this.altura * this.altura;
    }

    public boolean esMayorDeEdad(){
        return  this.edad >= 18;
    }

    public String toString (){
        return  "Mi nombre es: " + this.nombre +"\n"+
                "Mi edad es: " + this.edad +"\n"+
                "Mi genero es: " + this.genero +"\n"+
                "Mi peso es: " + this.peso +"\n"+
                "Mi estatura es: " + this.altura;
    }
}
