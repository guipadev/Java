
public class Sesion5 {
    
    public static void main(String[] args){
        
        Perro miPerro1 = new Perro(5, "Toby", "Azul");  //Aqui se le puede dar otro nombre al objeto
        Perro miPerro2 = new Perro(7, "Vainilla", "Negro");
        Perro miPerro3 = new Perro(5, "Bony", "Amarillo");
        
        Perro titan = new Perro(2, "titan", "azules");
        Perro perro1 = new Perro(3);
        
        
        System.out.println("Edad del perro: " + miPerro1.edad);
        miPerro1.saludar();
        
        System.out.println("La edad del perro 2 es: " + miPerro2.edad);
        
        miPerro1.quienEsMayor(miPerro2);
        
        miPerro2.saludarOtroPerro(miPerro3);
        
               
        System.out.println("Mi nombre es: "+ titan.nombre +" Mi eda es: "+ titan.edad +" Mis ojos color: "+ titan.colorOjos);
        titan.ladrar();
        
        System.out.println("Mi nombre es: "+ perro1.nombre +" Mi eda es: "+ perro1.edad +" Mis ojos color: "+ perro1.colorOjos);
        perro1.ladrar();
        
        Persona persona1 = new Persona("Nata", 31, 'F', 65, 170);
        
        persona1.esMayorDeEdad(persona1.edad);
        persona1.imc(persona1.peso, persona1.altura);
        persona1.toString(persona1.nombre);
        
    }
    
}
