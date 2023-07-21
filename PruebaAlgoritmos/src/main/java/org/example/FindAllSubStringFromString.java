package org.example;

public class FindAllSubStringFromString {

    /**
     * Encontrar todas las posibles combinaciones del subString
     */
    public static void main(String[] args) {

        String text = "abcd";

        for (int i = 0; i < text.length(); i++) {

            //String substring = "";

            StringBuilder substring = new StringBuilder();

            for (int j = i; j < text.length(); j++) {
                //substring += text.charAt(j);

                substring.append(text.charAt(j));

                System.out.println(substring);
            }
        }

    }
}
