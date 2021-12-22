package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.QAId;

public class QAAsignado extends DomainEvent {
    private final QAId qaId;

    public QAId getQaId() {
        return qaId;
    }

    public QAAsignado(QAId qaId) {
        super("sofka.produccion.qaAsignado");
        this.qaId = qaId;
    }
}
