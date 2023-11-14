package co.yom.strings;

public class Strings {

    public static void main(String[] args) {
        String x = "Hola mundo!";

        // posición 6
        System.out.println(x.charAt(6));

        // acceder al último
        System.out.println(x.charAt(x.length()-1));

        // recorrer elementos
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }

        // Obtener el dato mediante el index
        int c = x.indexOf("m");
        System.out.println(c); // 5
    }
}
