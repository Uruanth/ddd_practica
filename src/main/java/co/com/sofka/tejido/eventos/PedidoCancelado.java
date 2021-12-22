package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.PedidoId;

public class PedidoCancelado extends DomainEvent {
    private final PedidoId pedidoId;

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public PedidoCancelado(PedidoId pedidoId) {
        super("sofka.pedido.pedidoCancelado");
        this.pedidoId = pedidoId;
    }
}
