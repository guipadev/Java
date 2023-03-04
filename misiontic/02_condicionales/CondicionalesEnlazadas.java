package condicionales;

public class CondicionalesEnlazadas {
    
    public static double pagoFinal(int n, double precio) {
        double valor;
        if (n <= 5) {
            valor = n * precio;
        } else if (5 < n && n <= 10) {
            valor = n * precio * 0.95;
        } else if (10 < n && n <= 20) {
            valor = n * precio * 0.90;
        } else {
            valor = n * precio * 0.80;
        }
        return valor;
    }
    
    public static double pagoFinal2(int n, double precio) {
        if (n <= 5) {
            return n * precio;
        } else if (5 < n && n <= 10) {
            return n * precio * 0.95;
        } else if (10 < n && n <= 20) {
            return n * precio * 0.90;
        } else {
            return n * precio * 0.80;
        }
    }
    
}
