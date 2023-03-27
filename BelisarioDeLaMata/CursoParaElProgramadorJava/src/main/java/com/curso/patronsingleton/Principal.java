package com.curso.patronsingleton;

/*
Es un patrón de creación enfocado en crear dentro de la aplicación una sola instancia de un objeto
que puede ser compartida por todas las clases y subprocesos
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Evidenciamos que se imprimir siempre la misma referencia de instancia
        // Simulamos la petición de 10.000 hilos
        for (int i = 0; i < 10000; i++) {
            //System.out.println(MiClase.getInstance().toString());
            new Thread (
                    () -> {
                        MiClase.getInstance();
                    }) {
                    }.start();
        }
    }
          
}
