package org.example;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String text = "This is a string and nothing more than a string";

        String result = "";

        for (String word : text.split(" ")) {
            if (!result.contains(word)) {
                result += word + " ";
            }
        }

        System.out.println(result); // This a string and nothing more than

    }
}
