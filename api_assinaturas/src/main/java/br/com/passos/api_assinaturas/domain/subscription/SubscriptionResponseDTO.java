package br.com.passos.api_assinaturas.domain.subscription;

import br.com.passos.api_assinaturas.domain.plan.PlanResponseDTO;
import java.time.LocalDate;
import java.util.UUID;

public record SubscriptionResponseDTO(
    UUID id,
    PlanResponseDTO plan,
    String customerEmail,
    Status status,
    LocalDate nextBillingDate
) {
    public SubscriptionResponseDTO(Subscription subscription) {
        this(
            subscription.getId(),
            new PlanResponseDTO(subscription.getPlan()),
            subscription.getCustomerEmail(),
            subscription.getStatus(),
            subscription.getNextBillingDate()
        );
    }
}
