package IMC;

public class Principal {

    public static void main(String[] args) {
        Persona nata = new Persona("Nataly Loza", 25, 'F', 65.0, 1.70);
        Persona rigo = new Persona("Rigo Beto Fonseca", 2, 'M', 45.0, 1.10);
        Persona bencho = new Persona("Rubencho Ortiz", 32, 'M', 85.0, 1.78);

        System.out.println("Edad de Nata: " + nata.edad);
        System.out.println("Altura de Rigo: " + rigo.altura);

        //visualizar informacion private
        System.out.println("El nombre del primero es: " + nata.getNombre());


        //cambiar nombre cuando esta en private
        rigo.setNombre("Yamid");

        //calculo IMC
        double IMC = bencho.calcularIMC();
        System.out.println("IMC de rubencho es: " + IMC);

        double IMCnata = nata.calcularIMC();
        System.out.println("IMC de Nata es: " + IMCnata);


        System.out.println("Rigo es mayor de edad: " + rigo.esMayorDeEdad());
        System.out.println("Bencho es mayor de edad: " + bencho.esMayorDeEdad());

        System.out.println(nata.toString());
    }
}
