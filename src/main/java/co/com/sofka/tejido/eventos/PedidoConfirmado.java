package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.ProductoFinal;

public class PedidoConfirmado extends DomainEvent {
    private final ProductoFinal productoFinal;

    public ProductoFinal getProductoFinal() {
        return productoFinal;
    }

    public PedidoConfirmado(ProductoFinal productoFinal) {
        super("sofka.produccion.pedidoConfirmado");
        this.productoFinal = productoFinal;
    }
}
