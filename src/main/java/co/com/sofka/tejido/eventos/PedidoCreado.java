package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.Factura;
import co.com.sofka.tejido.Feedback;
import co.com.sofka.tejido.values.DisenhoId;
import co.com.sofka.tejido.values.ProduccionId;

import java.util.Set;

public class PedidoCreado extends DomainEvent {
    private final DisenhoId disenhoId;
    private final ProduccionId produccionId;
    private final Factura factura;
    private final Set<Feedback> feedback;

    public PedidoCreado(DisenhoId disenhoId, ProduccionId produccionId, Factura factura, Set<Feedback> feedback) {
        super("sofka.pedido.pedidoCreado");
        this.disenhoId = disenhoId;
        this.produccionId = produccionId;
        this.factura = factura;
        this.feedback = feedback;
    }

    public DisenhoId getDisenhoId() {
        return disenhoId;
    }

    public ProduccionId getProduccionId() {
        return produccionId;
    }

    public Factura getFactura() {
        return factura;
    }

    public Set<Feedback> getFeedback() {
        return feedback;
    }
}
