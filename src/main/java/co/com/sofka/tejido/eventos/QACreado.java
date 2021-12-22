package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.QAResponsable;
import co.com.sofka.tejido.values.QAId;

public class QACreado extends DomainEvent {
    private final QAId id;
    private final QAResponsable qaResponsable;

    public QAId getId() {
        return id;
    }

    public QAResponsable getQaResponsable() {
        return qaResponsable;
    }

    public QACreado(QAId id, QAResponsable qaResponsable) {
        super("sofka.qa.qaCreado");
        this.id = id;
        this.qaResponsable = qaResponsable;
    }
}
