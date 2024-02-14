package $21_enums;

import $21_enums.enums.RazaPerro;

public class Main {
    
    public static void main(String[] args) {
        
        for (RazaPerro perro: RazaPerro.values()) {
            System.out.println("Raza: " + perro);
        }
        
        RazaPerro bambi = RazaPerro.BEAGLE;
        
        // Métodos de los enum
        System.out.println("Es de raza: " + bambi.name());
        System.out.println("Posición en listado: " + bambi.ordinal());
        
        // Buscar valor dentro listado de los enum
        RazaPerro morgan;
        
        try {
            morgan = RazaPerro.valueOf("LABRADOR");
        
            System.out.println("Existe la raza: " + bambi);
        } catch (IllegalArgumentException e) {
            System.out.println("Ocurrió una excepción. El valor no es correcto");
        }
 
    }
    
}
