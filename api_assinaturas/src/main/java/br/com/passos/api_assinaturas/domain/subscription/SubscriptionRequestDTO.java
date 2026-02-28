package br.com.passos.api_assinaturas.domain.subscription;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

public record SubscriptionRequestDTO(
    @NotNull(message = "Plan ID is required")
    UUID planId,

    @NotBlank(message = "Customer email is required")
    @Email(message = "Customer email must be valid")
    String customerEmail,

    @NotNull(message = "Status is required")
    Status status,

    @NotNull(message = "Next billing date is required")
    LocalDate nextBillingDate
) {}
