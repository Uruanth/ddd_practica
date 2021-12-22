package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.PedidoId;
import co.com.sofka.tejido.values.ProduccionId;

public class AsociarProduccionComando extends Command {
    private final PedidoId id;
    private final ProduccionId produccionId;

    public PedidoId getId() {
        return id;
    }

    public ProduccionId getProduccionId() {
        return produccionId;
    }

    public AsociarProduccionComando(PedidoId id, ProduccionId produccionId) {
        this.id = id;
        this.produccionId = produccionId;
    }
}
