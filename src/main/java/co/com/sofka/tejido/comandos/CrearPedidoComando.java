package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.Factura;
import co.com.sofka.tejido.Feedback;
import co.com.sofka.tejido.values.DisenhoId;
import co.com.sofka.tejido.values.PedidoId;
import co.com.sofka.tejido.values.ProduccionId;

import java.util.Set;

public class CrearPedidoComando extends Command {
    private final PedidoId pedidoId;
    private final DisenhoId disenhoId;
    private final ProduccionId produccionId;
    private final Factura factura;
    private final Set<Feedback> feedback;

    public PedidoId getPedidoId() {
        return pedidoId;
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

    public CrearPedidoComando(PedidoId pedidoId, DisenhoId disenhoId, ProduccionId produccionId, Factura factura, Set<Feedback> feedback) {
        this.pedidoId = pedidoId;
        this.disenhoId = disenhoId;
        this.produccionId = produccionId;
        this.factura = factura;
        this.feedback = feedback;
    }
}
