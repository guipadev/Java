package usoStatic;

/*
En los metodos estaticos no se puede utilizar this
Y tampoco podemos utilizar un metodo estatico dentro de un metodo estatico
*/

public class Contador {

    private static int valor = 0;

    // Buena practica indicar que se utilizara en el metodo de forma estatica
    public void contar() {
        Contador.valor++;
    }

    public static int getValor() {
        return Contador.valor;
    }

    // Tambien podemos crear metodo estaticos sin necesidad de valores estaticos
    public static int sum(int val1, int val2) {
        return val1 + val2;
    }
}
