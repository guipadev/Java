package usoThis;

/*
- formas de utilizarlo:
1. Hacer referencia a la var de una instancia de la clase
2. Invocar el metodo de la clase actual implicitamente
3. Usarla para invocar el constructor de la clase actual
4. Para pasar como argumento la llamada al metodo
5. Como argumento a la llamada del constructor
6. Retornar la instancia de la clase a travez del metodo
*/

public class Main {

    private String variable1;
    private String variable2;

    // 1. Hacer referencia a la var de una instancia de la clase
    public Main(String variable1, String variable2) {
        this(); // 3 forma uso
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public void mostrar() {
        System.out.println("Estas son las variables this que hacen referencia " + variable1 + " " + variable2);
    }

    // 2. Invocar el metodo de la clase actual implicitamente
    public void mostrarMas() {
        this.mostrar();
    }

    // 3. Usarla para invocar el constructor de la clase actual
    public Main() {
        System.out.println("Clase inicializada");
    }

    public Main(String variable1) {
        this(variable1, "");
    }

    // 4. Para pasar como argumento la llamada al metodo
    public void mostrare(Main main) {
        System.out.println("Estas son las variables " + main.variable1 + " " + main.variable2);
    }

    public void mostrareMas() {
        System.out.println("Mostare mas");
        mostrare(this);
    }

    // 5. Como argumento a la llamada del constructor
    public Main (Main main) {
        this.variable1 = main.variable1;
        this.variable2 = main.variable2;
    }

    public void mostrarMasArgumento() {
        System.out.println("Mostar mas");
        Main main = new Main(this);
        mostrare(main);
    }

    // 6. Retornar la instancia de la clase a travez del metodo
    public Main getInstance() {
        return this;
    }

    public static void main(String[] args) {

        Main main = new Main("ejemplo1", "ejemplo2");
        main.mostrareMas();

        // 6. Retornar la instancia de la clase a travez del metodo
        // patron builder
        System.out.println(main);
        System.out.println(main.getInstance());

    }
}
