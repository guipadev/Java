package com.yadevom._24OPTIONAL;

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
