class Main {

    /**
     * Si enumeramos todos los números naturales a continuación 10 que son múltiplos
     * de 3 o 5,
     * obtenemos 3, 5, 6 y 9. La suma de estos múltiplos es 23.
     * Encuentre la suma de todos los múltiplos de 3 o 5 abajo 1000.
     */
    public static void main(String[] args) {

        int limite = 1000;
        int suma = 0;

        for (int i = 0; i < limite; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }

        }

        System.out.println("La suma de los multiplos de 3 o 5 es: " + suma); // 233168
    }

}