public class Persona {
    // Atributos (caracteristicas de la entidad)
    public String nombre;
    public int edad;
    public char genero;
    public int peso;
    public int altura;
    
    // Constructor (Funcion especial para iniciar objeto)
    public Persona (String nombre, int edad, char genero, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void imc(int peso, int estatura) {
        int imc = (peso / estatura^2);
        System.out.println("su indice de masa corporal es " + imc);
    }
    
    public void esMayorDeEdad(int edad){
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    
    }
    
    
    public void toString(String nombre){
        System.out.println("Su nombre es: "+ nombre+ " Edad:"+edad + "Genero: " +genero+" Con un peso: " +peso+ "Y altura de: "+altura);
    }
    
    /*//Imprimimos los resultados en el archivo Sesion5
    public static void main(String[] args){
        
        Persona persona1 = new Persona("Nata", 31, "F", 65, 170);
        
        persona1.esMayorDeEdad(persona1.edad);
        persona1.imc(persona1.peso, persona1.altura);
        persona1.toString(persona1.nombre);
    }*/
}

    
