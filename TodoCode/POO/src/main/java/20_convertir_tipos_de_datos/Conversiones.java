package convertir_tipos_de_datos;

public class Conversiones {
 
    public static void main(String[] args) {
        
        double num = 1.67;
        
        // casteo a entero
        int numInt = (int) num;
        
        // casteo a long
        long numLong = (long) num;
        
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        // Ejemplo de conversion
        String cantidad = "15";
        String precio = "150.27";
        
        int cantEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El valor todal de la compra es: " + (cantEntero * precioDouble));
        
        // Ejemplo de conversion
        int edad = 30;
        double estatura = 1.67;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
    }
}
