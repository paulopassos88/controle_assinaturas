package br.com.passos.api_assinaturas.domain.event;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EventRequestDTO(
    @NotBlank(message = "Type is required")
    String type,

    @NotBlank(message = "Data is required")
    String data,

    @NotNull(message = "Processed status is required")
    Boolean processed
) {}
