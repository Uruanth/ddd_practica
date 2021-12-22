package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.ProduccionId;
import co.com.sofka.tejido.values.ProductoFinal;

public class ConfirmarPedidoComando extends Command {
    private final ProduccionId id;
    private final ProductoFinal productoFinal;

    public ProduccionId getId() {
        return id;
    }

    public ProductoFinal getProductoFinal() {
        return productoFinal;
    }

    public ConfirmarPedidoComando(ProduccionId id, ProductoFinal productoFinal) {
        this.id = id;
        this.productoFinal = productoFinal;
    }
}
