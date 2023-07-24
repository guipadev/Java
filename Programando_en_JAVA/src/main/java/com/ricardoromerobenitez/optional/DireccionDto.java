package com.ricardoromerobenitez.optional;

import java.util.Optional;

public class DireccionDto {

    private Optional direccion;

    public DireccionDto(Optional direccion) {
        this.direccion = direccion;
    }

    public Optional getDireccion() {
        return direccion;
    }
}
