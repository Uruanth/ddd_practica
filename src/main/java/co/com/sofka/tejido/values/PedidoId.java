package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;


public class PedidoId extends Identity {

    private PedidoId(String value) {
        super(value);
    }

    public PedidoId(){}

    public static PedidoId of(String value) {
        return new PedidoId(value);
    }
}
