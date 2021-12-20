package co.com.sofka.generico;

import java.time.Instant;

public abstract class DomainEvent {
    private String type;
    private Instant instant;
    private Id aggregateId;

    public DomainEvent(String type) {
        this.type = type;
        this.instant = Instant.now();
    }

    public void setAggregateId(Id aggregateId) {
        this.aggregateId = aggregateId;
    }

    public String getType() {
        return type;
    }

    public Instant getInstant() {
        return instant;
    }

    public Id getAggregateId() {
        return aggregateId;
    }
}
