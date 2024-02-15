package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Java Stream API proporciona una forma poderosa de procesar secuencias de elementos,
 * como colecciones o matrices, de manera concisa y expresiva. 
 * Le permite realizar operaciones con datos con facilidad, haciendo que su código sea más legible 
 * y fácil de mantener. 
 * 
 * Optimización de su código Java
 * Java Streams ofrece una forma moderna y expresiva de procesar datos en Java. 
 * Al comprender y utilizar estos métodos de manera efectiva, podrá escribir código limpio, conciso y eficiente. 
 * Ya sea que esté trabajando con colecciones, bases de datos o cualquier fuente de datos, Java Streams puede 
 * hacer que su código sea más legible y fácil de mantener.
*/

public class Main {

    public static void main(String[] args) {

        /**
         * Filtrar elementos con filter()
         * El método filter () le permite filtrar elementos según una condición
         * determinada.
         * Por ejemplo, puedes filtrar números pares de una lista:
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList()); // Transformando elementos con `map()`

        System.out.println(numerosPares); // [2, 4, 6, 8, 10]

        /**
         * Transformando elementos con map()
         * El método map() transforma cada elemento utilizando una función
         * proporcionada.
         * Puedes calcular la longitud de los nombres en una lista de cadenas:
         */
        List<String> nombres = Arrays.asList("Alice", "Bob", "Charlie");

        List<Integer> longitudNombres = nombres.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(longitudNombres); // [5, 3, 7]

        /**
         * Recorriendo elementos con forEach()
         * El método forEach() le permite realizar una acción para cada elemento.
         * Aquí imprimimos nombres de una lista:
         */
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .forEach(System.out::println); // Alice Bob Charlie

        /**
         * Combinando elementos con reducir()
         * El método reduce() combina elementos en un solo resultado.
         * Calcula la suma de números en una lista:
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum); // 15

        /**
         * Recopilación de resultados con Collect()
         * El método Collect() reúne elementos en una colección o un resumen.
         * Une nombres en una lista en una sola cadena:
         */
        List<Integer> numeritos = Arrays.asList(1, 2, 3, 4, 5);

        int sumX = numeritos.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sumX); // 15

        /**************************************************************************
         * Operaciones avanzadas de transmisión
         * Más allá de lo básico, puedes lograr operaciones poderosas con Streams:
         ***************************************************************************/

        // Elementos distintos: devuelve elementos distintos en una secuencia
        List<Integer> numbersX = Arrays.asList(1, 2, 2, 3, 3, 3);

        List<Integer> distinctNumbers = numbersX.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers); // [1, 2, 3]

        // Ordenar elementos: devolver una secuencia ordenada
        List<Integer> numbersZ = Arrays.asList(5, 2, 8, 1, 7);

        List<Integer> sortedNumbers = numbersZ.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNumbers); // [1, 2, 5, 7, 8]

        // Limitación de elementos: limite la cantidad de elementos en la secuencia
        List<Integer> numberA = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> limitedNumbers = numberA.stream()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(limitedNumbers); // [1, 2, 3, 4, 5]

        // Omitir elementos: omita los primeros 'n' elementos de la secuencia.
        List<Integer> numbersC = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> skippedNumbers = numbersC.stream()
                .skip(5)
                .collect(Collectors.toList());

        System.out.println(skippedNumbers); // [6, 7, 8, 9, 10]

        /*
         * Matching Elements: Check if elements match a condition.
         * List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
         * boolean containsA = names.stream()
         * .anyMatch(name -> name.contains("A"));
         * boolean allEven = numbers.stream()
         * .allMatch(n -> n % 2 == 0);
         * boolean noneContainZ = names.stream()
         * .noneMatch(name -> name.contains("Z"));
         * Transform and Flatten
         * Transform each element of a stream of values into another stream and then
         * flatten the resulting streams into a single stream
         * 
         * List<List<Integer>> nestedList = Arrays.asList(
         * Arrays.asList(1, 2, 3),
         * Arrays.asList(4, 5, 6),
         * Arrays.asList(7, 8, 9)
         * );
         * 
         * // Nested list into a single list
         * Stream<Integer> flattenedStream = nestedList.stream()
         * .flatMap(List::stream);
         * 
         * flattenedStream.forEach(System.out::println);
         * List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");
         * 
         * Stream<String> characters = words.stream()
         * .flatMap(word -> Arrays.stream(word.split("")))
         * .distinct();
         * 
         * characters.forEach(System.out::println);
         * 
         * Debugging or monitoring
         * Used for debugging or monitoring the elements in a stream without changing
         * them.
         * 
         * Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
         * 
         * // Use peek to print each number before performing an operation
         * numbers
         * .peek(n -> System.out.println("Processing: " + n))
         * .map(n -> n * 2)
         * .forEach(System.out::println);
         * Grouping and Summarizing Data
         * Let’s take a look at more advanced operations:
         * 
         * Group Employees by Department and Count
         * Map<Department, Long> employeeCountByDept = employees.stream()
         * .collect(Collectors.groupingBy(Employee::getDepartment,
         * Collectors.counting()));
         * Find the Highest Paid Employee in Each Department
         * Map<Department, Optional<Employee>> highestPaidByDept = employees.stream()
         * .collect(Collectors.groupingBy(Employee::getDepartment,
         * Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
         * Calculate Average Salary by Department
         * Map<Department, Double> averageSalaryByDept = employees.stream()
         * .collect(Collectors.groupingBy(Employee::getDepartment,
         * Collectors.averagingInt(Employee::getSalary)));
         * Partition Students into Passing and Failing
         * Map<Boolean, List<Student>> passingFailing = students.stream()
         * .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
         */

    }
}
