package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.DatosCliente;
import co.com.sofka.tejido.values.PedidoId;

public class CrearFacturaComando extends Command {
    private final PedidoId id;
    private final DatosCliente datosCliente;

    public PedidoId getId() {
        return id;
    }

    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public CrearFacturaComando(PedidoId id, DatosCliente datosCliente) {
        this.id = id;
        this.datosCliente = datosCliente;
    }
}
