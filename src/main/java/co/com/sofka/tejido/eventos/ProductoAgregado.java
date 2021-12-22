package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;

public class ProductoAgregado extends DomainEvent {
    private final Double costo;
    private final String nombre;
    private final String caracteristicas;

    public Double getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public ProductoAgregado(Double costo, String nombre, String caracteristicas) {
        super("sofka.pedido.productoAgregado");
        this.costo = costo;
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
    }
}
