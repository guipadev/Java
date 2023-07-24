package com.ricardoromerobenitez.map_for;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // DEJAR DE USAR "FOR"
        List<UserEntity> userEntities = Arrays.asList(
                new UserEntity(UUID.randomUUID(), "Alfredo", 25, "Madrid"),
                new UserEntity(UUID.randomUUID(), "Martha", 55, "Barcelona"),
                new UserEntity(UUID.randomUUID(), "Julia", 16, "Valencia")
        );

        // Recorrido FOR
        List<Integer> ages = new ArrayList<>();

        for (UserEntity userEntity : userEntities) {
            ages.add(userEntity.getAge());
        }

        // Obtener la edad de los usuarios
        System.out.println(ages);

        // Mejor forma de recorrido MAP
        List<Integer> edades = userEntities
                .stream()
                .map(userEntity -> userEntity.getAge())
                .collect(Collectors.toList());

        System.out.println(edades);

        // Usuario DTO
        List<UserDTO> usuariosPersonas = Arrays.asList(
                new UserDTO("Alfredo", "Orozco",  25),
                new UserDTO("Martha", "Barcelona", 55),
                new UserDTO("Julia", "Valencia", 16)
        );

        // Mapear las entidades de usuario
        //List<UserDTO> usuariosPersonas = UserDTO.stream()
        //        .map(datos -> new UserDTO(datos.getName(), datos.getLastName(), datos.getAge()))
        //        .collect(Collectors.toList());

        //System.out.println(usuarios);


        // Optimizar la lambda
        List<String> ciudades = userEntities
                .stream()
                .map(UserEntity::getCity)
                .collect(Collectors.toList());

        System.out.println(ciudades);


    }
}
