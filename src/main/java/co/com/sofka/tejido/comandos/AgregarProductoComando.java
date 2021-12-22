package co.com.sofka.tejido.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tejido.values.PedidoId;

public class AgregarProductoComando extends Command {
    private final PedidoId id;
    private final Double costo;
    private final String nombre;
    private final String caracteristicas;

    public PedidoId getId() {
        return id;
    }

    public Double getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public AgregarProductoComando(PedidoId id, Double costo, String nombre, String caracteristicas) {
        this.id = id;
        this.costo = costo;
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
    }
}
