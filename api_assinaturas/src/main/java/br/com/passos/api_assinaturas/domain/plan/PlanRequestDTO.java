package br.com.passos.api_assinaturas.domain.plan;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record PlanRequestDTO(
    @NotBlank(message = "Name is required")
    String name,

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive")
    BigDecimal price,

    @NotBlank(message = "Billing cycle is required")
    String billingCycle
) {}
