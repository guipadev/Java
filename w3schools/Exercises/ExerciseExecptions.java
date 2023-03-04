package Exercises;

public class ExerciseExecptions {

    public static void main(String[] args) {

        // Insert the missing parts to handle the error in the code below.
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        // Insert the missing keyword to execute code, after try..catch, regardless of the result.
        try {
            int[] myNumbers2 = {1, 2, 3};
            System.out.println(myNumbers2[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

    }
}
