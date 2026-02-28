package br.com.passos.api_assinaturas.service;

import br.com.passos.api_assinaturas.domain.plan.Plan;
import br.com.passos.api_assinaturas.domain.plan.PlanRepository;
import br.com.passos.api_assinaturas.domain.subscription.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;
    private final PlanRepository planRepository;
    private final SubscriptionMapper subscriptionMapper;

    public SubscriptionService(SubscriptionRepository subscriptionRepository,
                              PlanRepository planRepository,
                              SubscriptionMapper subscriptionMapper) {
        this.subscriptionRepository = subscriptionRepository;
        this.planRepository = planRepository;
        this.subscriptionMapper = subscriptionMapper;
    }

    @Transactional
    public SubscriptionResponseDTO create(SubscriptionRequestDTO dto) {
        Plan plan = planRepository.findById(dto.planId())
            .orElseThrow(() -> new RuntimeException("Plan not found"));

        Subscription subscription = subscriptionMapper.toEntity(dto);
        subscription.setPlan(plan);

        subscription = subscriptionRepository.save(subscription);

        return subscriptionMapper.toResponseDTO(subscription);
    }
}
