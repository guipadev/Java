package com.dev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número de capas: ");

        int num = Integer.parseInt(teclado.nextLine());

        System.out.println("I am" + wordsGroot(num)+ " it");
    }

    public static String wordsGroot(int num){

        String texto = "";

        for (int i = 1; i < num; i++){
            if(i == 1) texto += "";
            if(i%2 == 0) texto += " that I am";
            if(i%2 != 0) texto += " that I groot";

        }
        return texto;
    }
}