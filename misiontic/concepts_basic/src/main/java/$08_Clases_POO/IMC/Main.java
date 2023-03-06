package $08_Clases_POO.IMC;;

public class Main {

    public static void main(String[] args) {

        Persona people1 = new Persona("Nataly Loza", 25, 'F', 65.0, 1.70);
        Persona people2 = new Persona("Rigo Beto Fonseca", 2, 'M', 45.0, 1.10);
        Persona people3 = new Persona("Rubencho Ortiz", 32, 'M', 85.0, 1.78);

        System.out.println("====================== datos especificos personas ======================");

        System.out.println("Edad de " + people1.getNombre() + " : " + people1.edad);

        System.out.println("Altura de " + people2.getNombre() + " : " + people2.altura);

        //visualizar informacion private
        System.out.println("El nombre del primero es: " + people1.getNombre());

        //cambiar nombre cuando esta en private
        people2.setNombre("Yamid");

        System.out.println("====================== calculo IMC ======================");
        double IMC = people3.calcularIMC();
        System.out.println(people3.getNombre() + " tiene un IMC de: " + IMC);

        double IMCnata = people1.calcularIMC();
        System.out.println(people1.getNombre() + " tiene un IMC de: " + IMCnata);

        System.out.println("====================== comprobación edad ======================");
        System.out.println(people2.getNombre() + " es mayor de edad: " + people2.esMayorDeEdad());
        System.out.println(people3.getNombre() + " es mayor de edad: " + people3.esMayorDeEdad());

        System.out.println("====================== datos personales de personas ======================");
        System.out.println(people1.toString());
    }
}
