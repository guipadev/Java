package Exercises;

public class ExerciseLoops {

    public static void main (String[] args) {

        // Print i as long as i is less than 6.
        int i = 1;

        while (i < 6) {
            System.out.println(i);
            i++;
        }

        // Use the do/while loop to print i as long as i is less than 6.
        do {
            System.out.println(i);
            i++;
        } while (i < 6);

        // Use a for loop to print "Yes" 5 times:
        for (int x = 0; x < 5; x++) {
            System.out.println("Yes");
        }

        // Loop through the items in the cars array.
        String[] cars = {"Volvo", "BMW", "Ford"};

        for (String c : cars) {
            System.out.println(c);
        }

        // Stop the loop if i is 5.
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println(j);
        }

        // In the loop, when the value is "4", jump directly to the next value.
        for (int w = 0; w < 10; w++) {
            if (w == 4) {
                continue;
            }
            System.out.println(w);
        }


    }
}
