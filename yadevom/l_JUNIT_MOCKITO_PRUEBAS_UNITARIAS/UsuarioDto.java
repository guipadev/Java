package com.yadevom.l_JUNIT_MOCKITO_PRUEBAS_UNITARIAS;

import java.util.Objects;

public class UsuarioDto {

    final Long id;
    final String nombre;

    public UsuarioDto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si un objeto apunta a la misma direccion de memoria que el objeto que hemos pasado signigica que son el mismo objeto
        if (o == null || getClass() != o.getClass()) return false; // Se identifica si la clase es la misma o no con la instancia actual y el objeto que hemos pasado
        UsuarioDto that = (UsuarioDto) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
    }
}
