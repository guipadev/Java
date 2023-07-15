package Absolute.WHILE;

import java.util.Scanner;

public class EjemploPassword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese clave: ");

        String password = sc.nextLine();

        while (password.equals("123")) {
            System.out.println("Bienvenido");
            break;
        }
    }
}
