package com.yadevom._26metodo_HASHCODE_EQUALS;
//https://programandoenjava.com/equals-y-hashcode-en-java/

/*
Son métodos que toda clase de Java hereda de la clase Object
estos metodos ayudan a optimizar el código y evaluar nuestras clases entre ellas
* */

public class Main {

    public static void main(String[] args) {
        UsuarioDto usuarioDto = new UsuarioDto("juan", "j@gmail.com");
        // Devuelve el codigo Hash de nuestro objeto
        System.out.println(usuarioDto.hashCode());

        UsuarioDto usuarioDto2 = new UsuarioDto("juane", "ju@gmail.com");
        System.out.println(usuarioDto2.hashCode());

        // Por eso es recomedable que cada vez que queremos implementar un metodo equeals
        // para saber si un objeto es mismo que el otro implementar el metodo Hash

        if (usuarioDto.equals(usuarioDto2)) {
            System.out.println("Los objetos son iguales");
        }
    }
}
