package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.Cliente;
import co.com.sofka.tejido.SolicitudCliente;
import co.com.sofka.tejido.values.DisenhoId;

public class CrearDisenhoComando extends Command {
    private final DisenhoId disenhoId;
    private final SolicitudCliente solicitudCliente;
    private final Cliente cliente;

    public DisenhoId getDisenhoId() {
        return disenhoId;
    }

    public SolicitudCliente getSolicitudCliente() {
        return solicitudCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public CrearDisenhoComando(DisenhoId disenhoId, SolicitudCliente solicitudCliente, Cliente cliente) {
        this.disenhoId = disenhoId;
        this.solicitudCliente = solicitudCliente;
        this.cliente = cliente;
    }
}
