package br.com.passos.api_assinaturas.domain.subscription;

import java.time.LocalDate;
import java.util.UUID;

import br.com.passos.api_assinaturas.domain.plan.Plan;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "subscriptions")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne 
    @JoinColumn(name = "plan_id")
    private Plan plan;

    private String customerEmail;

    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate nextBillingDate;

    public Subscription() {}

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Plan getPlan() {
        return this.plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getNextBillingDate() {
        return this.nextBillingDate;
    }

    public void setNextBillingDate(LocalDate nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) o;
        return Objects.equals(id, subscription.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
