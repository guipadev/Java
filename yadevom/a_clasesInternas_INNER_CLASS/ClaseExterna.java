package com.yadevom.a_clasesInternas_INNER_CLASS;

public class ClaseExterna {

    private String hola;

    public void metodoEjemplo() {
        System.out.println("Este es un metodo de la clase externa");

        // Clases locales
        // Dentro del metodo crear clases
        class ClaseLocal {
            private String ejemplo;

            public void metodoLocal() {
                System.out.println("Este es un metodo de la clase local");
            }
        }
        // Esta clase solo se puede utilizar dentro del metodo
        ClaseLocal claseLocal = new ClaseLocal();

        claseLocal.metodoLocal();
    }

    // Creacion de clase interna, para no tener que inicializar la clase externa
    // para utilizar la clase interna la volvemos tipo estatica
    public static class ClaseInterna {

        private String adios;

        public void metodoInterno() {
            System.out.println("Este es un metodo de la clase interna");
        }
    }
}
