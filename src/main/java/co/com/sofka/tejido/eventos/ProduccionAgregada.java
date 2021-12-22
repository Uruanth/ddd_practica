package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.Materiales;
import co.com.sofka.tejido.Responsable;
import co.com.sofka.tejido.values.ProduccionId;
import co.com.sofka.tejido.values.Prototipo;
import co.com.sofka.tejido.values.QAId;

public class ProduccionAgregada extends DomainEvent {
    private final ProduccionId id;
    private final Prototipo prototipo;
    private final Responsable responsable;
    private final Materiales materiales;
    private final QAId qaId;

    public ProduccionAgregada(ProduccionId id, Prototipo prototipo, Responsable responsable, Materiales materiales, QAId qaId) {
        super("sofka.produccion.produccionAgregada");
        this.id = id;
        this.prototipo = prototipo;
        this.responsable = responsable;
        this.materiales = materiales;
        this.qaId = qaId;
    }

    public ProduccionId getId() {
        return id;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public Materiales getMateriales() {
        return materiales;
    }

    public QAId getQaId() {
        return qaId;
    }
}
