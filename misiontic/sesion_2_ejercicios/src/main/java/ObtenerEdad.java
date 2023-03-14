import java.util.Scanner;

public class ObtenerEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dias a calular:");
        int dias = sc.nextInt();

        int ano, mes, dia, r;

        ano = dias/365;
        r = dias-ano*365;
        mes = r/30;
        dia = r-mes*30;

        System.out.println(ano + " año(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}