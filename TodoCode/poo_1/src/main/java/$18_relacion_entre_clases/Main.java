package $18_relacion_entre_clases;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Auto aut = new Auto ();
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");
        
        // Creación lista propietarios vacias para asociar 
        List<Propietario> listaPropietarios = new ArrayList<Propietario> ();
        
        // Creación propietarios vácios
        Propietario prop1 = new Propietario ();
        Propietario prop2 = new Propietario ();
        
        // Asigación de datos a propietarios
        prop1.setId(35L);
        prop1.setNombre("Paula");
        prop1.setApelllido("Rios");
        
        prop2.setId(30L);
        prop2.setNombre("Scarlet");
        prop2.setApelllido("Jhonson");
        
        //Guardar propietarios a la lista
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        // Setiar/asignar a auto la lista de propietarios
        aut.setListaPropietarios(listaPropietarios);
        
        // Método toString() para pasar todo a texto de los objetos, el cual debe esta asignado en lcas clase auto y propietario
        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + 
                " tiene como propietarios a: " + aut.getListaPropietarios().toString());
    }
}
