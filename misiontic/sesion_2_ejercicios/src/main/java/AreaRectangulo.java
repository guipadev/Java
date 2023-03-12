import java.util.Scanner;

public class AreaRectangulo {
    
    public static double area_rectangulo(double l, double a) {
            double area = l * a;
            return area;
    }
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Ingrese el lado:");
            int l = sc.nextInt();
       
            System.out.println("Ingrese el ancho:");
            int a = sc.nextInt();
        
            System.out.println("Area: "+area_rectangulo(l, a));
    }
}
