import static Utilidades.Utils.*;

public class Comparaciones {

    public static void main(String[] args) {

        int precioPan1 = 2000;
        int precioPan2 = 2600;

        println((precioPan1 > precioPan2) + "");
        println((precioPan1 < precioPan2) + "");

        println((precioPan1 == precioPan2) + "");

        int a = 10;
        int b = 15;
        int c = 10;

        println((a == c) + "");
        println((b >= c) + "");
        println((a <= c) + "");
        println((b <= c) + "");

        println((2.6 > 1.4) + "");

        println(("morsa" == "perro") + "");

        println(("morsa".equals("perro")) + "");
    }

    public static class Programa1 {

        public static void main(String[] args) {

            String nombreUsuario = input("Ingresa tu nombre: ");
            int edad = inputInt("Ahora ingresa tu edad: ");

            println("Hola " + nombreUsuario + " tu edad es " + edad);
        }
    }
}
