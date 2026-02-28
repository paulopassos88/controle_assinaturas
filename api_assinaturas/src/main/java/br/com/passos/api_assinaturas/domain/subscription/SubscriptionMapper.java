package br.com.passos.api_assinaturas.domain.subscription;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SubscriptionMapper {

    SubscriptionMapper INSTANCE = Mappers.getMapper(SubscriptionMapper.class);

    @Mapping(target = "plan", ignore = true)
    @Mapping(target = "id", ignore = true)
    Subscription toEntity(SubscriptionRequestDTO dto);

    SubscriptionResponseDTO toResponseDTO(Subscription subscription);
}
