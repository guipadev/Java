package co.guipadev.StreamAPIdropWhileYtakeWhile;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 🚀 Java 9 : ¡Mejoras en la API de transmisión! 🚀

 Java 9 trajo una serie de potentes mejoras a la API de Stream, haciendo que el procesamiento de datos en Java
 sea aún más expresivo y eficiente.
 ¡Exploremos algunas de las nuevas características que simplifican nuestro código y lo hacen más legible!

 1️⃣ Presentamos dropWhile y takeWhile:
 El nuevo método dropWhile nos permite omitir elementos en una secuencia mientras se cumple una determinada condición.
 Por otro lado, el método takeWhile nos permite recopilar elementos de la secuencia hasta que la condición sea verdadera.
 Estos nuevos métodos proporcionan soluciones elegantes para manejar datos basados en predicados específicos.

 2️⃣ Manejo nulo simplificado con ofNullable:
 Todos conocemos las dificultades de manejar valores nulos en nuestros datos.
 Java 9 solucionó este punto débil con el método ofNullable en la API Stream.
 Este método nos permite crear una secuencia de un solo elemento si no es nulo, o un flujo vacío si el valor es nulo,
 lo que nos ayuda a evitar esas molestas NullPointerExceptions.

 3️⃣ Método de iteración mejorado:
 El método de iteración obtuvo un impulso con una sobrecarga que toma un predicado.
 Ahora, podemos usar esta nueva versión para detener la iteración basada en una condición, lo que nos proporciona
 más flexibilidad en nuestro procesamiento de datos.
 Estas mejoras de la API de Stream en Java 9 han llevado la programación de estilo funcional al siguiente nivel.
 Nos permiten escribir código más conciso y expresivo, lo que lleva a una mejor legibilidad y mantenibilidad.
 */
public class App {

    public static void main(String[] args) {

        // dropWhile

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> result = numbers.stream()
                .dropWhile(n -> n < 5)
                .collect(Collectors.toList());

        System.out.println(result); // [5, 6, 7, 8, 9, 10]

        // takeWhile

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> resultado = numbers.stream()
                .takeWhile(n -> n < 5)
                .collect(Collectors.toList());

        System.out.println(resultado); // [1, 2, 3, 4]
    }
}
