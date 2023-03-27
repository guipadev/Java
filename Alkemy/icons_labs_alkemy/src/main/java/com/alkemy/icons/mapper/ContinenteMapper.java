package com.alkemy.icons.mapper;

import com.alkemy.icons.dto.ContinenteDTO;
import com.alkemy.icons.entity.ContinenteEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Convertir las Entidades en DTO y los DTO en Entidades
 * @Component inyectarlo en la clase
 */
@Component
public class ContinenteMapper {

    /**
     * Reutilizable, transformar de DTO a Entidad
     */
    public ContinenteEntity continenteDTO2Entity(ContinenteDTO dto) {
        ContinenteEntity continenteEntity = new ContinenteEntity();
        continenteEntity.setImagen(dto.getImagen());
        continenteEntity.setDenominacion(dto.getDenominacion());
        return continenteEntity;
    }

    /**
     * Reutilizable, transformar de Entidad a DTO
     */
    public ContinenteDTO continenteEntity2DTO(ContinenteEntity entity) {
        ContinenteDTO dto = new ContinenteDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        return dto;
    }

    /**
     * Tranformar lista
     */
    public List<ContinenteDTO> continenteEntityList2DTOList(List<ContinenteEntity> entities) {
        List<ContinenteDTO> dtos = new ArrayList<>();
        for (ContinenteEntity entity : entities) {
            dtos.add(this.continenteEntity2DTO(entity));
        }
        return dtos;
    }
}
