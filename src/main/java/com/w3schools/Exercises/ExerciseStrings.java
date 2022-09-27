package Exercises;

public class ExerciseStrings {

    public static void main(String[] args) {

        // Use the correct method to print the length of the txt string.
        String txt = "Hello";
        System.out.println(txt.length());

        // Convert the value of txt to upper case.
        String txt2 = "Hello";
        System.out.println(txt2.toUpperCase());

        // Use the correct operator to concatenate two strings:
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);

        // Use the correct method to concatenate two strings:
        String firstName2 = "Julio";
        String lastName2 = "Jaramillo";
        System.out.println(firstName2.concat(lastName2));

        // Return the index (position) of the first occurrence of "e" in the following string:
        String txt3 = "Hello Everybody";
        System.out.println(txt3.indexOf("e"));
    }
}
