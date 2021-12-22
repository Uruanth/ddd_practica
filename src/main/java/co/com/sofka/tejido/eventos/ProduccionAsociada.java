package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.ProduccionId;

public class ProduccionAsociada extends DomainEvent {
    private final ProduccionId produccionId;

    public ProduccionId getProduccionId() {
        return produccionId;
    }

    public ProduccionAsociada(ProduccionId produccionId) {
        super("sofka.pedido.produccionAsociada");
        this.produccionId = produccionId;
    }
}
