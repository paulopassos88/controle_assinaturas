package br.com.passos.api_assinaturas.domain.plan;

import java.math.BigDecimal;
import java.util.UUID;

public record PlanResponseDTO(
    UUID id,
    String name,
    BigDecimal price,
    String billingCycle
) {
    public PlanResponseDTO(Plan plan) {
        this(plan.getId(), plan.getName(), plan.getPrice(), plan.getBillingCycle());
    }
}
