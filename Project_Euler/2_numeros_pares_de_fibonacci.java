/**
 * Números pares de Fibonacci
 * Cada nuevo término en la sucesión de Fibonacci se genera sumando los dos
 * términos anteriores.
 * al comenzar con 1 y 2, la primera 10 términos serán:
 * 
 * 1,2,3,5,8,13,21,34,55,89,...
 * 
 * Al considerar los términos en la sucesión de Fibonacci cuyos valores no
 * superan los cuatro millones,
 * encuentre la suma de los términos de valor par.
 */

class Main2 {

    public static void main(String[] args) {

        int limite = 4000000;
        int termino1 = 1;
        int termino2 = 2;
        int suma = 0;

        while (termino1 <= limite) {

            if (termino1 % 2 == 0) {
                suma += termino1;
            }

            int siguienteTermino = termino1 + termino2;
            termino1 = termino2;
            termino2 = siguienteTermino;
        }

        System.out.println(
                "La suma de los términos de valor par de la secuencia de Fibonacci que no superan los cuatro millones es: "
                        + suma); // 4613732
    }

}