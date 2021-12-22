package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.DisenhoId;

public class DisenhoAsignado extends DomainEvent {
    private final DisenhoId disenhoId;

    public DisenhoId getDisenhoId() {
        return disenhoId;
    }

    public DisenhoAsignado(DisenhoId disenhoId) {
        super("sofka.pedido.diseñoAsosiado");
        this.disenhoId = disenhoId;
    }
}
