package com.alkemy.icons.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class PaisDTO {

    private Long id;
    private String imagen;
    private String denominacion;
    private Long cantidadHabitantes;
    private Long superficie;
    private ContinenteDTO continente;
    private Long continenteId;
    private List<IconDTO> icons;

}