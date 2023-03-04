package ForLoop;

public class ForEach {

    public static void main(String[] args) {

        // For-Each Loop
        // There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

        // The following example outputs all elements in the cars array, using a "for-each" loop:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String i : cars) {
            System.out.println(i);
        }

        // Note: Don't worry if you don't understand the example above. You will learn more about Arrays in the Java Arrays chapter.
    }
}
