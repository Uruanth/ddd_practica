package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.Comentarios;
import co.com.sofka.tejido.values.FeedbackId;

public class FeedbackAgregado extends DomainEvent {
    private final FeedbackId feedbackId;
    private final Comentarios comentarios;

    public FeedbackId getFeedbackId() {
        return feedbackId;
    }

    public Comentarios getComentarios() {
        return comentarios;
    }

    public FeedbackAgregado(FeedbackId feedbackId, Comentarios comentarios) {
        super("sofka.pedido.feedbackAgregado");
        this.feedbackId = feedbackId;
        this.comentarios = comentarios;
    }
}
