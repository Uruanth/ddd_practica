package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.DisenhoId;
import co.com.sofka.tejido.values.PedidoId;

public class AsignarDisenhoComando extends Command {
    private final PedidoId id;
    private final DisenhoId disenhoId;

    public PedidoId getId() {
        return id;
    }

    public DisenhoId getDisenhoId() {
        return disenhoId;
    }

    public AsignarDisenhoComando(PedidoId id, DisenhoId disenhoId) {
        this.id = id;
        this.disenhoId = disenhoId;
    }
}
