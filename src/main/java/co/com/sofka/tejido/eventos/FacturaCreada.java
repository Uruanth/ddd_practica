package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.DatosCliente;
import co.com.sofka.tejido.values.FacturaId;

public class FacturaCreada extends DomainEvent {
    private final FacturaId facturaId;
    private final DatosCliente datosCliente;

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public FacturaCreada(FacturaId facturaId, DatosCliente datosCliente) {
        super("sofka.pedido.facturaGenerada");
        this.facturaId = facturaId;
        this.datosCliente = datosCliente;
    }
}
