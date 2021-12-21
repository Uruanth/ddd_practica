package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class PedidoId extends Id {

    private PedidoId(String value) {
        super(value);
    }

    public PedidoId(){}

    public static PedidoId of(String value) {
        return new PedidoId(value);
    }
}
