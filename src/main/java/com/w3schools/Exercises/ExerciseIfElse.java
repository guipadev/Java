package Exercises;

public class ExerciseIfElse {

    public static void main(String[] args) {

        // Print "Hello World" if x is greater than y.
        int x = 50;
        int y = 10;

        if (x > y) {
            System.out.println("Hello World");
        }

        // Print "Hello World" if x is equal to y.
        if (x == y) {
            System.out.println("Hello World");
        }

        // Print "Yes" if x is equal to y, otherwise print "No".
        if(x == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".
        if (x == y) {
            System.out.println("1");
        } else if (x > y){
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        // Insert the missing parts to complete the following "short hand if...else statement" (ternary operator):
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
