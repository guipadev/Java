

import static Utilidades.Utils.*;

public class Programa2 {

    public static void main(String[] args) {

        int edad = inputInt("Cual es tu edad? ");
        int limiteEdad = 18;
        int senior = 65;

        if (edad < limiteEdad) {
            println("No tienes la edad suficiente");
        } else if (edad >= limiteEdad && edad < senior) {
            println("Puedes pasar al party");
        }else {
            println("Eres de la tercera edad, sigue con esa energia ;)");
        }

    }
}
