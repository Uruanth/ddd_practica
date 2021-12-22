package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.ProductoId;

public class PrototipoCambiado extends DomainEvent {
    private final ProductoId id;
    private final String nombre;
    private final String caracteristicas;
    private final String materiales;

    public ProductoId getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getMateriales() {
        return materiales;
    }

    public PrototipoCambiado(ProductoId id, String nombre, String caracteristicas, String materiales) {
        super("sofka.qa.prototipoCambiado");
        this.id = id;
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.materiales = materiales;
    }
}
