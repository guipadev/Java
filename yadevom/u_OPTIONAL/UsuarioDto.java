package com.yadevom.u_OPTIONAL;

import java.util.Optional;

public class UsuarioDto {

    private Optional<DireccionDto> direccionDto;

    public UsuarioDto(Optional<DireccionDto> direccionDto) {
        this.direccionDto = direccionDto;
    }

    public Optional<DireccionDto> getDireccionDto() {
        return direccionDto;
    }
}
