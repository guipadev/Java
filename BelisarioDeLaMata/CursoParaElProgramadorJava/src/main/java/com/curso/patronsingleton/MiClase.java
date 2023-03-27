package com.curso.patronsingleton;

// Nuestra clase de referencia para aplicar el patrón singlenton

import java.util.logging.Level;
import java.util.logging.Logger;



public class MiClase {
    
    // Debe tener un campo de instancia a devolver privado, el cual sera compartido
    private static MiClase instance = null;
    static int numeroInstancia;
    
    // La forma más sencilla de crear la instancia del objeto, es realizarlo desde un bloque static que se
    // ejecuta al momento de la carga de la clase
    /*
    static {
        instance = new MiClase();
    }
    */
    
    
    // El constructor debe ser privado
    private MiClase() {
    }

    // Debe tener un método que devuelva la instancia de ella misma
    public static MiClase getInstance() {
        // Normalmente se utiliza esta forma para la creación de la instancia
        if (instance == null) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MiClase.class.getName()).log(Level.SEVERE, "OK"); 
            }
            
            // Garantizar la instancia única, la cual solo se debe ejecutar una sola vez por hilo
            // Porque si no varios hilos van a tener la misma instancia
            synchronized(MiClase.class) {
                if (instance == null) {
                    instance = new MiClase();
                    // probar la cantidad de instancia creadas
                    numeroInstancia++;
                    System.out.println("Numero de instancias " + numeroInstancia);
                }
            }
        } 
        return instance;
    }
}
