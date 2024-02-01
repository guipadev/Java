package $16_collection_hash_Map;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {
        
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        // Agregar clave - valor
        mapaEmpleados.put(123, "Jose Betancourt");
        mapaEmpleados.put(456, "Miguel Muñoz");
        mapaEmpleados.put(789, "Ana Aguilar");
        mapaEmpleados.put(012, "Lina Sierra");
        mapaEmpleados.put(753, "Miryam Perez");
        mapaEmpleados.put(951, "Tulia Tulua");
        
        // Validar si existe valor
        boolean buscaValor = mapaEmpleados.containsValue("Lina Sierra");
        
        // Validar si existe key
        boolean buscaLlave = mapaEmpleados.containsKey(123);
        
        if (buscaValor == true) {
            System.out.println("Se encuentra el registro por VALUE");
        } else {
            System.out.println("No se encuentra el registro :(");
        }
        
        if (buscaLlave == true) {
            System.out.println("Se encuentra el registro por KEY");
        } else {
            System.out.println("No se encuentra el registro :(");
        }
        
        // Listar todos los valores en cuestion
        System.out.println(mapaEmpleados.values());
        
        // Listar todos las llaves en cuestion
        System.out.println(mapaEmpleados.keySet());
        
        // Traer el valor asociado a una Key
        String nombre = mapaEmpleados.get(789);
        
        System.out.println("El empleado buscado es: " + nombre);
        
        // remove, eliminar valor de nuestro mapa
        // Si existe el key, lo elimina, si no existe no hace nada y no genera error
        mapaEmpleados.remove(1527);
    }
}
