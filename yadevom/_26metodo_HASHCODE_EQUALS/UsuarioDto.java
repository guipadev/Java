package com.yadevom._26metodo_HASHCODE_EQUALS;

import java.util.Objects;

public class UsuarioDto {

    private String nombre;
    private String email;

    public UsuarioDto(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Si un objeto apunta a la misma direccion de memoria que el objeto que hemos pasado signigica que son el mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false; // Se identifica si la clase es la misma o no con la instancia actual y el objeto que hemos pasado
        UsuarioDto that = (UsuarioDto) obj;
        return Objects.equals(nombre, that.nombre) && Objects.equals(email, that.email);
    }
}
