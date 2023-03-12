import java.util.Scanner;

public class VocalMinuscula {
    
    public static boolean esVocalMinuscula(char ch) {
        boolean value;
        switch (ch) {
            case 'a':
                value = true;
                break;
            case 'e':
                value = true;
                break;
            case 'i':
                value = true;
                break;
            case 'o':
                value = true;
                break;
            case 'u':
                value = true;
                break;
            default:
                value = false;
                break;
        }
        return value;
    }
    
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese alguna letra del vocabulario:");
            char v = sc.nextLine().charAt(0);
            
        System.out.println("La vocal ingresada es minuscula: "+esVocalMinuscula(v));
    }
    
}
