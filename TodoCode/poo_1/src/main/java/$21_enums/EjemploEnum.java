package $21_enums;

public class EjemploEnum {

    enum Color {
        ROJO, AZUL, AMARILLO, NEGRO, BLANCO
    }
    
    public static void main(String[] args) {
        
        Color color = Color.ROJO;
        
        System.out.println("El color es: " + color);
    
        // Recorrer el Enum
        for (Color c: Color.values()) {
            System.out.println("Colores del enum son: " + c);
        }
    }
    
}
