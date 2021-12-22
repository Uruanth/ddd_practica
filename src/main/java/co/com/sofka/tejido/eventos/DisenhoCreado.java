package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.Cliente;
import co.com.sofka.tejido.SolicitudCliente;

public class DisenhoCreado extends DomainEvent {
    private final SolicitudCliente solicitudCliente;
    private final Cliente cliente;

    public DisenhoCreado(SolicitudCliente solicitudCliente, Cliente cliente) {
        super("sofka.diseño.diseñoCreado");
        this.solicitudCliente = solicitudCliente;
        this.cliente = cliente;
    }

    public SolicitudCliente getSolicitudCliente() {
        return solicitudCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
