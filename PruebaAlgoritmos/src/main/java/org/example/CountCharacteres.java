package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountCharacteres {

    public static void main(String[] args) {

        String text = "This is a string and nothing more than a string";

        Map<Character, Integer> characterCount = new HashMap<>();

        for (char character : text.toCharArray()) {
            if (!Character.isWhitespace(character)) {
                characterCount.put(character, characterCount.getOrDefault(character, 0) + 1);
            }
        }

        for (Character character : characterCount.keySet()) {
            System.out.println(character + ": " + characterCount.get(character));
        }
    }
}
