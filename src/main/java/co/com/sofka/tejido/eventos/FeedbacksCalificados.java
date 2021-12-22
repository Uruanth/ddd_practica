package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.Feedback;

import java.util.Set;

public class FeedbacksCalificados extends DomainEvent {
    private final Set<Feedback> feedback;

    public Set<Feedback> getFeedback() {
        return feedback;
    }

    public FeedbacksCalificados(Set<Feedback> feedback) {
        super("sofka.pedido.feedbacksCalificados");
        this.feedback = feedback;
    }
}
