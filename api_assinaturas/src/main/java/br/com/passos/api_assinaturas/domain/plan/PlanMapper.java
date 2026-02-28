package br.com.passos.api_assinaturas.domain.plan;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlanMapper {

    PlanMapper INSTANCE = Mappers.getMapper(PlanMapper.class);

    Plan toEntity(PlanRequestDTO dto);

    PlanResponseDTO toResponseDTO(Plan plan);
}
