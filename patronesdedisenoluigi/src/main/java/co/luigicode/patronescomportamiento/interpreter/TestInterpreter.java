package co.luigicode.patronescomportamiento.interpreter;

public class TestInterpreter {

    public static void main(String[] args) {

        String str = "4 8 3 - +";

        System.out.println("Resultado => " + new Interpreter(str).evaluate());

        // Notación polaca a la inversa
        String str2 = "5 1 2 + 4 * + 3 -";

        System.out.println("Resultado => " + new Interpreter(str2).evaluate());
    }
}
