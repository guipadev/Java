import java.util.Scanner;

public class SalaAp1 {

    public static int menuConOut() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\tBIENVENIDO A LA TIENDA SAN\n");
        System.out.print("1. Aguacate\n");
        System.out.print("2. Yerbabuena\n");
        System.out.print("3. Limon\n");
        System.out.print("5. Salir");
        System.out.print("\n\nPor favor seleccione una opcion\n");
        opcion = sc.nextInt();
        return opcion;
    }

    public static int menuConStr() {
        int opcion = 0;
        String a = "";
        Scanner sc = new Scanner(System.in);
        for (int i=0; i <= 10; i++){
            System.out.println(i);
        }
        a += "\t\tBIENVENIDO A LA TIENDA SAN\n";
        a += "1. Aguacate\n";
        a += "2. Yerbabuena\n";
        a += "3. Limon\n";
        a += "5. Salir";
        a += "\n\nPor favor seleccione una opcion\n" + opcion;
        System.out.print(a);
        opcion = sc.nextInt();
        return opcion;
    }

    public static int menuConFor() {
        int opcion = 0;
        int lista[] = {1, 2, 3, 4, 5, 0}; //por extensión
        String a = "";
        Scanner sc = new Scanner(System.in);
        String[] arreglo = new String[6]; //declaro el arreglo

        arreglo[0] = "\t\tBIENVENIDO A LA TIENDA SAN\n";
        arreglo[1] = "Aguacate\n";
        arreglo[2] = "Yerbabuena\n";
        arreglo[3] = "Limon\n";
        arreglo[4] = "Salir";
        arreglo[5] = "\n\nPor favor seleccione una opcion\n" + opcion;

        for (int i = 0; i < 6; i++) {
            System.out.print(lista[i] + ". " + arreglo[i]);
        }

        System.out.print(a);
        opcion = sc.nextInt();
        return opcion;

    }

    public static void main(String[] args) {
        //menuConOut();
        //menuConStr();
        menuConFor();
    }

}
