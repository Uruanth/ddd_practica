package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.Comentarios;
import co.com.sofka.tejido.values.FeedbackId;
import co.com.sofka.tejido.values.PedidoId;

public class AgregarFeedbackComando extends Command {
    private final PedidoId id;
    private final FeedbackId feedbackId;
    private final Comentarios comentarios;

    public PedidoId getId() {
        return id;
    }

    public FeedbackId getFeedbackId() {
        return feedbackId;
    }

    public Comentarios getComentarios() {
        return comentarios;
    }

    public AgregarFeedbackComando(PedidoId id, FeedbackId feedbackId, Comentarios comentarios) {
        this.id = id;
        this.feedbackId = feedbackId;
        this.comentarios = comentarios;
    }
}
