package com.yadevom.u_OPTIONAL;
//https://programandoenjava.com/optional-en-java-8/
import java.util.Optional;

public class Main {

    /**
     * Optional es un tipo de dato que utiliza valores genericos como las colectiones
     * nos ayuda a controlar los valores null en nuestro codigo evitando los
     * null pointer excepcion
     */

    public static void main(String[] args) {

        Optional<String> stringNull = Optional.ofNullable(null);
        Optional<String> stringOptional = Optional.ofNullable("Hola");

        // Reducir codigo
        String stringElse = stringNull.orElse("Este valor era nulo");

        String stringElse2 = stringOptional.get();

        if (stringNull.isEmpty()) {
            System.out.println("Valor de string NULL es vacio");
        }

        if (stringOptional.isEmpty()) {
            System.out.println("Valor string OPTIONAL es vacio");
        }

        // Asi evitamos comprobaciones como estas
        String stringNormalNull = null;

        if (stringNormalNull != null) { // Usar comprobacion para evitar null pointer exception
            stringNormalNull.startsWith("a");
        }

        // Ejemplo uso optional
        DireccionDto direccionDto = new DireccionDto(Optional.of("Calle Maldivas 3"));
        UsuarioDto usuarioDto = new UsuarioDto(Optional.of(direccionDto));

        String direccionUsuario = (String) usuarioDto.getDireccionDto()
                .flatMap(DireccionDto::getDireccion)
                .orElse("No existe direccion");

        System.out.println(direccionUsuario);
    }
}
