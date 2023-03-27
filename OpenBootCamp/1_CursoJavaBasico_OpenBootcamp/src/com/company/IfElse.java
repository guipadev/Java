package com.company;

public class IfElse {

    public static void main(String[] args) {

        boolean check = 5 < 10;

        int num1 = 5;
        int num2 = 15;
        int num3 = 25;
        int num4 = 1005;

        if(check) {
            System.out.println("verdadero");
        }

        if(num1 < num2 && num2 < num3) {
            System.out.println("verdadero");
        } else if (num3 < num4){
            System.out.println("falso");
        } else {
            System.out.println("Invalido");
        }

    }
}
