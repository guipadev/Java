package com.yomdev.uso_Switch_Case;

public class CurrentMonthLambda {

    /**
     * A partir de Java 14 soporta esta forma de switch
     */
    public static void main(String[] args) {

        int month = 6;

        String monthResult = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Unknown";
        };

        System.out.println(monthResult); // June
    }
}
