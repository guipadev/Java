package com.ricardoromerobenitez.clases_anonimas;

/*
Son clases internas sin nombre, como no tienen nombre no podemos usarlas para crear instancias de esa clase
es decir que tenemos que declarar e instanciar las anonimas en una unica expresion cuando queramos usarlas
hay dos formas para hacer eso:
1. extendiendo la clase de una cosa existente
2. cuando queremos implementar una interfaz
* */

public class Main {

    // Otras formas de utilizar anonima
    public static void claseAnonimaVehiculo(Vehiculo vehiculo) {}

    public static void claseAnonimaInterfaz(UsuarioServicio usuarioServicio) {}


    public static void main(String[] args) {
        // Declarando clase anonima, primera forma
        new Vehiculo() {
            private int numeroPasajero;

            public void conducir() {
                System.out.println("Estoy conduciendo");
            }
            // Si queremos utilizar un metodo o atributo de la clase anonima, se puede hacer despues del corchete
        }.conducir();

        // Declarando clase anonima, segunda forma
        UsuarioServicio usuarioServicio = new UsuarioServicio() {
            @Override
            public void crearUsuario() {
                System.out.println("Creando usuario");
            }
        };
        usuarioServicio.crearUsuario();

    }
}
