package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.NombreTejedor;
import co.com.sofka.tejido.values.ProductoId;
import co.com.sofka.tejido.values.Prototipo;

public class ProductoQAAgregado extends DomainEvent {
    private final ProductoId id;
    private final NombreTejedor nombreTejedor;
    private final Prototipo prototipo;

    public ProductoId getId() {
        return id;
    }

    public NombreTejedor getNombreTejedor() {
        return nombreTejedor;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }

    public ProductoQAAgregado(ProductoId id, NombreTejedor nombreTejedor, Prototipo prototipo) {
        super("sofka.qa.productoQAAgregado");
        this.id = id;
        this.nombreTejedor = nombreTejedor;
        this.prototipo = prototipo;
    }
}
