package co.yom.strings;

public class InicializacionCadenasEInmutabilidad {

    /**
     * Las cadenas son inmutables, osea no se pueden cambiar
     * @param args
     */
    public static void main(String[] args) {

        // Se trabaja como objeto
        String x;
        x = new String(); // 0
        System.out.println(x.length());

        x = new String("hola mundo");

        // Comprobación de mutabilidad
        String s1 = "picachu";
        String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);

        // Nos daremos que se crean un nuevo String y se apunta a ese nuevo
        s1 = "charmander";
        System.out.println(s1);
        // Este queda sin referencia y el garbage collector
        System.out.println(s2);

    }
}
