package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.Feedback;
import co.com.sofka.tejido.values.PedidoId;

import java.util.Set;

public class CalificarFeedbacksComando extends Command {
    private final PedidoId id;
    private final Set<Feedback> feedbacks;

    public PedidoId getId() {
        return id;
    }

    public Set<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public CalificarFeedbacksComando(PedidoId id, Set<Feedback> feedbacks) {
        this.id = id;
        this.feedbacks = feedbacks;
    }
}
