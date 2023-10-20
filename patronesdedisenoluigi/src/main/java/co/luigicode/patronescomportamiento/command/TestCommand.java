package co.luigicode.patronescomportamiento.command;

import java.util.Scanner;

public class TestCommand {

    public static void main(String[] args) {

        Player player = new Player(0, 0, 0);

        InvocarMover invocar = new InvocarMover(player);

        Scanner sc = new Scanner(System.in);

        char c = sc.next().trim().toLowerCase().charAt(0);

        while (c != 'q') {

            invocar.mover(c);

            c = sc.next().trim().toLowerCase().charAt(0);
        }
    }

}
