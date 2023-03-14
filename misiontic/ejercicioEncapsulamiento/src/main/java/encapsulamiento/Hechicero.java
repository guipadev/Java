
package encapsulamiento;

//extends para heredar los atribujtos de clase padre Personaje
public class Hechicero extends Personaje {
    
    private int poder;  //Se agrega un nuevo metodo a la clase hija
    
    //Poliformismo ya que heredamos pero cambiamos el resultado
    public void saludar() {
        System.out.println("Hola soy un hechicero");
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    public static void main(String[] args) {
        
        //Aplicamos poliformismo para que esta clase tenga su propio saludo
        //Y heredamos los atributos y metodos de la clase padre
        //Pero realizamos poliformismo ya que cambiamos los atributos y metodos del nuevo personaje creado hechicero
        Personaje hechicero = new Hechicero();
        
        //Utilizamos el metodo Setters par ingresar datos
        hechicero.setNombre("Ronaldo");
        hechicero.setEdad(19);
        hechicero.setTextura("Rona.png");
        
        //Utilizamos el metodo Getters para mostrar los datos ingresados
        System.out.println("Nombre: " + hechicero.getNombre());
        System.out.println("Edad: " + hechicero.getEdad());
        System.out.println("Textura: "+ hechicero.getTextura());
        
        hechicero.saludar();
    }
   
}
