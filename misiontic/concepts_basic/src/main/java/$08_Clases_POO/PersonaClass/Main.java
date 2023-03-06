package $08_Clases_POO.PersonaClass;

public class Main {

    public static void main(String[] args) {
        Persona miPersona1 = new Persona("Nataly Loza", 25, "F", 65, 170);
        Persona miPersona2 = new Persona("Ana Fonseca", 2, "F", 45, 100);
        Persona miPersona3 = new Persona("Rubencho Ortiz", 32, "M", 85, 178);


        //esMayorDeEdad(): Devolverá true si es mayor de edad, false en caso contrario.
        System.out.println("La persona: "+ miPersona2.nombre +" es mayor de edad: "+miPersona2.esMayorDeEdad(miPersona2.edad));

        //calcularIMC(): Calculará y retornará el Indice de Masa Corporal del objeto.
        System.out.println("La persona: "+ miPersona3.nombre +" el IMC es: " + miPersona3.calcularIMC(miPersona3.peso, miPersona3.altura));

        //toString(): Devolverá toda la información del objeto en un String.
        miPersona1.toString(miPersona1);
    }
}
