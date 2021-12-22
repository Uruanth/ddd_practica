package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.PedidoId;

public class CancelarPedidoComando extends Command {
    private final PedidoId id;

    public PedidoId getId() {
        return id;
    }

    public CancelarPedidoComando(PedidoId id) {
        this.id = id;
    }
}
