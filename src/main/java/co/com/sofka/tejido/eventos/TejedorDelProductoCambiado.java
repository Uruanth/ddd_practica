package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.ProductoId;

public class TejedorDelProductoCambiado extends DomainEvent {
    private final ProductoId id;
    private final String nombreTejedor;

    public ProductoId getId() {
        return id;
    }

    public String getNombreTejedor() {
        return nombreTejedor;
    }

    public TejedorDelProductoCambiado(ProductoId id, String nombreTejedor) {
        super("sofka.qa.tejedorDelProductoCambiado");
        this.id = id;
        this.nombreTejedor = nombreTejedor;
    }
}
