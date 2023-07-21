package com.yomdev.uso_Switch_Case;

import org.w3c.dom.ls.LSOutput;

public class Username {

    public static void main(String[] args) {

        String username = "John";

        switch (username) {
            case "Doe":
                System.out.println("Username is Doe");
                break;
            case "John":
                System.out.println("Username is John");
                break;
            case "Jane":
                System.out.println("Username is Jane");
                break;
            // Username is John
        }

        String result = switch (username) {
            case "Doe" -> "Username is Doe";
            case "John" -> "Username is John";
            case "Jane" -> "Username is Jane";
            default -> "Not username";
            // Username is John
        };

        System.out.println(result);
    }
}
