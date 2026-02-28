package br.com.passos.api_assinaturas.domain.event;

import java.util.UUID;

public record EventResponseDTO(
    UUID id,
    String type,
    String data,
    boolean processed
) {
    public EventResponseDTO(Event event) {
        this(event.getId(), event.getType(), event.getData(), event.isProcessed());
    }
}
