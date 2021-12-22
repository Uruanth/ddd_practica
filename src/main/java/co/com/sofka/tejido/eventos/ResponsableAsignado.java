package co.com.sofka.tejido.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tejido.values.NombreTejedor;
import co.com.sofka.tejido.values.ProductoFinal;
import co.com.sofka.tejido.values.ResponsableId;

public class ResponsableAsignado extends DomainEvent {
    private final ResponsableId id;
    private final NombreTejedor nombreTejedor;
    private final ProductoFinal productoFinal;

    public ResponsableId getId() {
        return id;
    }

    public NombreTejedor getNombreTejedor() {
        return nombreTejedor;
    }

    public ProductoFinal getProductoFinal() {
        return productoFinal;
    }

    public ResponsableAsignado(ResponsableId id, NombreTejedor nombreTejedor, ProductoFinal productoFinal) {
        super("sofka.produccion.responsableAsignado");
        this.id = id;
        this.nombreTejedor = nombreTejedor;
        this.productoFinal = productoFinal;
    }
}
