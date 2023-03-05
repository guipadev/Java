package $05_For;

public class Ejemplo1Sumatoria {

    public static void main(String[] args) {

        System.out.println(suma(10));
    }

    public static int suma(int n) {
        int s = 0;

        for (int i = 1; i <= n; i++){
            s = s + i;
        }
        return s;
    }
    
}
