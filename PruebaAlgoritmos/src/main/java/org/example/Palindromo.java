package org.example;

public class Palindromo {

    public static void main(String[] args) {

        String text = "sugus";

        boolean flag = true;

        for (int i = 0, j = text.length() - 1; i < text.length() / 2; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) {
                flag = false;
                break;
            }
        }

        String result = flag ? "The string is a palindrome" : "The string is not a palindrome";

        System.out.println(result);
    }
}
